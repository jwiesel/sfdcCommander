<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
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
				<xsl:for-each select="sfdc:CustomApplication">
				<div class="innerbody">
						<div class="staticheader"><script>document.write(decodeURIComponent(decodeURIComponent('<xsl:value-of select="$file"/>')));</script></div>
						<div class="qnav"><a href="javascript:history.back()"><i class="glyphicon glyphicon-circle-arrow-left"></i></a></div>
						<div class="dynamiccontent">
							<p>
								<b>Label: </b><xsl:value-of select="sfdc:label"/><br />
								<b>Description: </b><span><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></span><br />
								<b>Default Landing Tab: </b><xsl:value-of select="sfdc:defaultLandingTab"/><br />
								<xsl:if test="count(sfdc:logo)>0">
									<b>Logo:</b><br />
									<img><xsl:attribute name="src"><xsl:value-of select='concat("../", sfdc:logo)' /></xsl:attribute></img>
								</xsl:if>
							</p>
							
							<xsl:if test="count(sfdc:tab)>0">
								<h3><a name="tab">Tabs</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Tab</th>
									</tr>
									<xsl:for-each select="sfdc:tab">
										<tr>
											<td>
												<xsl:choose>
													<xsl:when test="starts-with(.,'standard-')">
														<xsl:value-of select="."/>
													</xsl:when>
													<xsl:otherwise>
														<a><xsl:attribute name="href"><xsl:value-of select="concat('../tabs/', ., '.html')"/></xsl:attribute><xsl:value-of select="."/></a>
													</xsl:otherwise>
												</xsl:choose>
											</td>
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
