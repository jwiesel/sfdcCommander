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
				<xsl:for-each select="sfdc:CustomPageWebLink">
					<div class="innerbody">
						<div class="staticheader"><script>document.write(decodeURIComponent(decodeURIComponent('<xsl:value-of select='$file' />')));</script></div>
						<div class="qnav"><a href="javascript:history.back()"><i class="glyphicon glyphicon-circle-arrow-left"></i></a></div>
						<div class="dynamiccontent">
							<p>
								<b>Master Label: </b><xsl:value-of select="sfdc:masterLabel"/><br />
								<b>Availability: </b><xsl:value-of select="sfdc:availability"/><br />
								<b>Display Type: </b><xsl:value-of select="sfdc:displayType"/><br />
								<xsl:if test="sfdc:height!=''"><b>Height: </b><xsl:value-of select="sfdc:height"/><br /></xsl:if>
								<b>Link Type: </b><xsl:value-of select="sfdc:linkType"/><br />
								<xsl:if test="sfdc:url!=''"><b>URL: </b><xsl:value-of select="sfdc:url"/><br /></xsl:if>
								<xsl:if test="sfdc:scontrol!=''"><b>sControl: </b><a><xsl:attribute name="href"><xsl:value-of select="concat('../scontrols/', sfdc:scontrol,'.scf-meta.html')"/></xsl:attribute><xsl:value-of select="sfdc:scontrol"/></a><br /></xsl:if>
								<b>Open Type: </b><xsl:value-of select="sfdc:openType"/><br />
								<b>Protected?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:protected" /></xsl:call-template><br />
								<b>Description: </b><span><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></span>
							</p>
						</div>
					</div>
				</xsl:for-each>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>