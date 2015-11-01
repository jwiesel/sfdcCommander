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
		<xsl:variable name="object"><xsl:value-of select="substring-before($file,'.')"/></xsl:variable>
		<html>
			<head>
				<xsl:call-template name="get-header"></xsl:call-template>
			</head>
			<body>
				<xsl:for-each select="sfdc:QuickAction">
					<div class="innerbody">
						<xsl:call-template name="get-content-header"><xsl:with-param name="file" select="$file" /></xsl:call-template>
						<div class="dynamiccontent">
							
							<p>
								<b>Standard Label: </b><xsl:value-of select="sfdc:standardLabel"/><br />
								<b>Target Object: </b><a><xsl:attribute name="href"><xsl:value-of select="concat('../index.html?category=objects&amp;entity=',sfdc:targetObject)"/></xsl:attribute><xsl:value-of select="sfdc:targetObject"/></a><br />
								<b>Target Parent Field: </b><xsl:value-of select="sfdc:description" />
							</p>
							
							<xsl:if test="count(sfdc:quickActionLayout)>0">
								<h3><a name="classaccesses">Quick Action Layout</a></h3>
								<table class="layoutsection">
									<xsl:for-each select="sfdc:quickActionLayout">
										<!-- if styles TwoColumnsLeftToRight, TwoColumnsTopToBottom, OneColumn, CustomLinks -->
										<tr><xsl:attribute name="class"><xsl:value-of select="concat('layoutcontent ', sfdc:layoutSectionStyle)"/></xsl:attribute>
											<xsl:for-each select="sfdc:quickActionLayoutColumns">
											<td>
												<xsl:for-each select="sfdc:quickActionLayoutItems">
													<div class="f-label"><a><xsl:attribute name="href"><xsl:value-of select="concat('../index.html?category=objects&amp;entity=',$object,'#f_',sfdc:field)"/></xsl:attribute><xsl:value-of select="sfdc:field"/></a></div>
													<div><xsl:attribute name="class"><xsl:value-of select="concat('field ', sfdc:uiBehavior)"/></xsl:attribute></div>
												</xsl:for-each>
											</td>
											</xsl:for-each>
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