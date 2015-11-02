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
				<div class="innerbody">
					<xsl:call-template name="get-content-header"><xsl:with-param name="file" select="$file" /></xsl:call-template>
					<div class="dynamiccontent">
						<xsl:for-each select="sfdc:SharingRules">
							<xsl:for-each select="sfdc:sharingOwnerRules">
								<h3>Sharing Rule - <xsl:value-of select="sfdc:fullName"/></h3>
								<p>
									<b>Label: </b><xsl:value-of select="sfdc:label"/><br />
									<b>Description: </b><span><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></span><br />
									<b>Access Level: </b><xsl:value-of select="sfdc:accessLevel"/>
								</p>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Shared From</th>
										<th>Shared To</th>
									</tr>
									<tr>
										<td><xsl:for-each select="sfdc:sharedFrom/*"><xsl:value-of select="name()"/></xsl:for-each></td>
										<td><xsl:for-each select="sfdc:sharedTo/*"><xsl:value-of select="name()"/></xsl:for-each></td>
									</tr>
								</table>
								<xsl:if test="count(sfdc:accountSettings)>0">
									<h4>Account Settings</h4>
									<xsl:for-each select="sfdc:accountSettings">
										<b>Case Access Level: </b><xsl:value-of select="sfdc:caseAccessLevel"/><br />
										<b>Contact Access Level: </b><xsl:value-of select="sfdc:contactAccessLevel"/><br />
										<b>Opportunity Access Level: </b><xsl:value-of select="sfdc:opportunityAccessLevel"/>
									</xsl:for-each>
								</xsl:if>
							</xsl:for-each>
							<xsl:for-each select="sfdc:sharingCriteriaRules">
								<h3>Sharing Rule - <xsl:value-of select="sfdc:fullName"/></h3>
								<p>
									<b>Label: </b><xsl:value-of select="sfdc:label"/><br />
									<b>Description: </b><span><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></span><br />
									<b>Access Level: </b><xsl:value-of select="sfdc:accessLevel"/>
								</p>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Shared To</th>
									</tr>
									<tr>
										<td><xsl:for-each select="sfdc:sharedTo/*"><xsl:value-of select="name()"/></xsl:for-each></td>
									</tr>
								</table>
								<xsl:if test="count(sfdc:criteriaItems)>0">
									<h4>Criteria Items</h4>
									<table class="table table-striped table-hover">
										<tr class="headline">
											<th>Field</th>
											<th>Operation</th>
											<th>Value</th>
										</tr>
										<xsl:for-each select="sfdc:criteriaItems">
											<tr>
												<td><xsl:value-of select="sfdc:field"/></td>
												<td><xsl:value-of select="sfdc:operation"/></td>
												<td><xsl:value-of select="sfdc:value"/></td>
											</tr>
										</xsl:for-each>
									</table>
								</xsl:if>
							</xsl:for-each>
						</xsl:for-each>
					</div>
				</div>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>