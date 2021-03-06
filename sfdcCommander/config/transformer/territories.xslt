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
				<div class="innerbody">
					<div class="staticheader">Territory hierarchy</div>
					<div class="qnav"><a href="javascript:history.back()"><i class="glyphicon glyphicon-circle-arrow-left"></i></a></div>
					<div class="dynamiccontent">
						<xsl:for-each select="sfdc:territories">
							<h3>Territories</h3>
							<table class="table table-striped table-hover">
								<tr class="headline">
									<th>Name</th>
									<th>Description</th>
									<th>Parent Territory</th>
									<th>mayForecastManagerShare???</th>
									<th>Case Access Level</th>
									<th>Contact Access Level</th>
									<th>Opportunity Access Level</th>
								</tr>
								<xsl:for-each select="sfdc:Territory">
									<xsl:sort select="sfdc:parentTerritory"/>
									<xsl:sort select="sfdc:name"/>
									<tr>
										<td><xsl:value-of select="sfdc:name"/></td>
										<td><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></td>
										<td><xsl:value-of select="sfdc:parentTerritory"/></td>
										<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:mayForecastManagerShare" /><xsl:with-param name="title" select="'mayForecastManagerShare?'" /></xsl:call-template></td>
										<td><xsl:value-of select="sfdc:caseAccessLevel"/></td>
										<td><xsl:value-of select="sfdc:contactAccessLevel"/></td>
										<td><xsl:value-of select="sfdc:opportunityAccessLevel"/></td>
									</tr>
								</xsl:for-each>
							</table>
						</xsl:for-each>
					</div>
				</div>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>