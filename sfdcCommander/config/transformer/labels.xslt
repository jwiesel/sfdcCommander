<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="2.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
xmlns:sfdc="http://soap.sforce.com/2006/04/metadata">

	<xsl:import href="templates.xsl" />
	<xsl:output
		method="html"
		doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		omit-xml-declaration="yes"
		encoding="UTF-8"
		indent="yes" />

	<xsl:template match="/">
		<xsl:variable name="file"><xsl:call-template name="substring-after-last"><xsl:with-param name="string" select="base-uri()" /><xsl:with-param name="delimiter" select="'/'" /></xsl:call-template></xsl:variable>
		<html>
			<head>
				<xsl:call-template name="get-header"></xsl:call-template>
			</head>
			<body>
				<xsl:for-each select="sfdc:CustomLabels">
					<div class="innerbody">
						<xsl:call-template name="get-content-header"><xsl:with-param name="file" select="$file" /></xsl:call-template>
						<div class="dynamiccontent">
							<xsl:if test="count(sfdc:labels)>0">
								<h3><a name="customapplications">Labels</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Category</th>
										<th>Language</th>
										<th>Value</th>
										<th>Protected?</th>
										<th>Short Description</th>
									</tr>
									<xsl:for-each select="sfdc:labels">
										<tr>
											<td><xsl:value-of select="sfdc:fullName"/></td>
											<td><xsl:value-of select="sfdc:categories"/></td>
											<td><a><xsl:attribute name="href"><xsl:value-of select="concat('../index.html?category=translations&amp;entity=', sfdc:language)"/></xsl:attribute><xsl:value-of select="sfdc:language"/></a></td>
											<td><xsl:value-of select="sfdc:value"/></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:protected" /><xsl:with-param name="title" select="'Protected?'" /></xsl:call-template></td>
											<td><xsl:value-of select="sfdc:shortDescription"/></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
						</div>
					</div>
				</xsl:for-each>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>