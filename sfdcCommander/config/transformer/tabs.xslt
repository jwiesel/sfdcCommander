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
		<xsl:variable name="tab"><xsl:value-of select='substring($file,0,string-length($file)-3)' /></xsl:variable>
		<html>
			<head>
				<xsl:call-template name="get-header"></xsl:call-template>
			</head>
			<body>
				<xsl:for-each select="sfdc:CustomTab">
					<div class="innerbody">
						<div class="staticheader"><script>document.write(decodeURIComponent(decodeURIComponent('<xsl:value-of select='$file' />')));</script></div>
						<div class="qnav"><a href="javascript:history.back()"><i class="glyphicon glyphicon-circle-arrow-left"></i></a></div>
						<div class="dynamiccontent">
							<p>
								<xsl:if test="sfdc:customObject='true'"><b>Custom Object: </b><a><xsl:attribute name="href"><xsl:value-of select="concat('../objects/',$tab,'.html')"/></xsl:attribute><xsl:value-of select="$tab"/></a><br /></xsl:if>
								<xsl:if test="count(sfdc:scontrol)>0"><b>sControl: </b><xsl:value-of select="sfdc:scontrol"/><br /></xsl:if>
								<xsl:if test="count(sfdc:label)>0"><b>Label: </b><xsl:value-of select="sfdc:label"/><br /></xsl:if>
								<xsl:if test="count(sfdc:motif)>0"><b>Motif: </b><xsl:value-of select="sfdc:motif"/><br /></xsl:if>
								<xsl:if test="count(sfdc:mobileReady)>0"><b>Mobile Ready?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:mobileReady" /></xsl:call-template><br /></xsl:if>
								<xsl:if test="count(sfdc:hasSidebar)>0"><b>Has Sidebar?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:hasSidebar" /></xsl:call-template><br /></xsl:if>
								<xsl:if test="count(sfdc:frameHeight)>0"><b>Frame Height: </b><xsl:value-of select="sfdc:frameHeight" /><br /></xsl:if>
								<b>Description: </b><span><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></span>
							</p>
						</div>
					</div>
				</xsl:for-each>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>