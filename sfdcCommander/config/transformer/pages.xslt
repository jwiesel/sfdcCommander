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
		<!-- get page file name -->
		<xsl:variable name="file"><xsl:call-template name="substring-after-last"><xsl:with-param name="string" select="base-uri()" /><xsl:with-param name="delimiter" select="'/'" /></xsl:call-template></xsl:variable>
		<xsl:variable name="page"><xsl:value-of select='substring($file,0,string-length($file)-8)' /></xsl:variable>

		<html>
			<head>
				<xsl:call-template name="get-header"></xsl:call-template>
				<script type="text/javascript" src="../script/jquery.snippet.min.js"></script>
				<script>
				$(document).ready(function(){
					init();
					var loc = window.location.pathname;
					var dir = loc.substring(0, loc.lastIndexOf('/')); 
					$.ajax({
						type: "GET",
						url: dir+'/<xsl:value-of select='$page' />',
						dataType: "xml",
						async: false,
						contentType: "text/xml; charset=\"utf-8\"",
						complete: function(xmlResponse) {
							$("pre.code").text(xmlResponse.responseText);
							$('pre.code').snippet("xml", {style:"ide-eclipse", menu:false});
						}
					});
				});
				</script>
				<link rel="stylesheet" href="../css/jquery.snippet.min.css" type="text/css" />
			</head>
			<body>
				<div class="innerbody">
					<xsl:call-template name="get-content-header"><xsl:with-param name="file" select="$page" /></xsl:call-template>
					<div class="dynamiccontent">
						<xsl:for-each select="sfdc:ApexPage">
							<p>
								<b>Label: </b><xsl:value-of select="sfdc:label"/><br />
								<b>API Version: </b><xsl:value-of select="sfdc:apiVersion"/><br />
								<b>Description: </b><span><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></span>

								<pre class="code"></pre>
							</p>
						</xsl:for-each>
					</div>
				</div>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>