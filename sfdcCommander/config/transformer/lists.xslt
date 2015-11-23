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
		<html>
			<head>
				<xsl:call-template name="get-header"></xsl:call-template>
			</head>
			<body>
				<xsl:for-each select="sfdc:Files">
					<div class="innerbody">
					
						<xsl:variable name="entity" select="sfdc:entity" /> 
						<xsl:call-template name="get-content-header"><xsl:with-param name="file" select="$entity" /><xsl:with-param name="list" select="'true'" /></xsl:call-template>
						<div class="dynamiccontent">
							<table class="table table-striped table-hover">
								<xsl:for-each select="sfdc:file">
									<tr>
										<td><a><xsl:attribute name="href"><xsl:value-of select="concat('../index.html?category=', $entity, '&amp;entity=', encode-for-uri(.))"/></xsl:attribute><xsl:value-of  disable-output-escaping="yes" select="." /></a></td>
									</tr>
								</xsl:for-each>
							</table>
						</div>
					</div>
				</xsl:for-each>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>
