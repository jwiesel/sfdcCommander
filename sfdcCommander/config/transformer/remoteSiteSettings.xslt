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
				<xsl:for-each select="sfdc:RemoteSiteSetting">
					<div class="innerbody">
						<div class="staticheader"><script>document.write(decodeURIComponent(decodeURIComponent('<xsl:value-of select='$file' />')));</script></div>
						<div class="qnav"><a href="javascript:history.back()"><i class="glyphicon glyphicon-circle-arrow-left"></i></a></div>
						<div class="dynamiccontent">
							<p>
								<b>URL: </b><xsl:value-of select="sfdc:url"/><br />
								<b>Active?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:isActive" /></xsl:call-template><br />
								<b>Disable Protocol Security?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:disableProtocolSecurity" /></xsl:call-template><br />
							</p>
						</div>
					</div>
				</xsl:for-each>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>