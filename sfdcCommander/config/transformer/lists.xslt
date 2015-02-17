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
		<html>
			<head>
				<xsl:call-template name="get-header"></xsl:call-template>
			</head>
			<body>
				<xsl:for-each select="sfdc:Files">
					<div class="innerbody">
					
						<xsl:variable name="entity" select="sfdc:entity" /> 
						<div class="staticheader"><xsl:value-of select="$entity"/></div>
						<div class="dynamiccontent">
							<table class="table table-striped table-hover">
								<xsl:for-each select="sfdc:file">
									<tr>
										<td><a><xsl:attribute name="href"><xsl:value-of select="concat('../', $entity, '/' ,encode-for-uri(.) , '.html')"/></xsl:attribute><script>document.write(decodeURIComponent('<xsl:value-of select="." />'));</script></a></td>
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
