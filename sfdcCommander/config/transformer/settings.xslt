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
						<xsl:for-each select="sfdc:SecuritySettings">

							<xsl:for-each select="sfdc:networkAccess">
								<h3><a name="networkaccess">Network Access</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Start</th>
										<th>End</th>
									</tr>
									<xsl:for-each select="sfdc:ipRanges">
										<tr>
											<td><xsl:value-of select="sfdc:start"/></td>
											<td><xsl:value-of select="sfdc:end"/></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:for-each>
							
							<xsl:for-each select="sfdc:passwordPolicies">
								<h3><a name="passwordpolicies">Password Policies</a></h3>
								<p>
									<b>Complexity: </b><xsl:value-of select="sfdc:complexity"/><br />
									<b>Expiration: </b><xsl:value-of select="sfdc:expiration"/><br />
									<b>History Restriction: </b><xsl:value-of select="sfdc:historyRestriction"/><br />
									<b>Lockout Interval: </b><xsl:value-of select="sfdc:lockoutInterval"/><br />
									<b>Max. Login Attempts: </b><xsl:value-of select="sfdc:maxLoginAttempts"/><br />
									<b>Min. Password Length: </b><xsl:value-of select="sfdc:minPasswordLength"/><br />
									<b>Minimum Password Lifetime?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:minimumPasswordLifetime" /></xsl:call-template><br />
									<b>Obscure Secret Answer?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:obscureSecretAnswer" /></xsl:call-template><br />
									<b>Question Restriction: </b><xsl:value-of select="sfdc:questionRestriction"/>
								</p>
							</xsl:for-each>
							
							<xsl:for-each select="sfdc:sessionSettings">
								<h3><a name="sessionsettings">Session Settings</a></h3>
								<p>
									<b>Disable Timeout Warning?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:disableTimeoutWarning" /></xsl:call-template><br />
									<b>Enable CSRF On Get?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableCSRFOnGet" /></xsl:call-template><br />
									<b>Enable CSRF On Post?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableCSRFOnPost" /></xsl:call-template><br />
									<b>Enable Cache And Autocomplete?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableCacheAndAutocomplete" /></xsl:call-template><br />
									<b>Enable Clickjack Nonsetup SFDC?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableClickjackNonsetupSFDC" /></xsl:call-template><br />
									<b>Enable Clickjack Nonsetup User?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableClickjackNonsetupUser" /></xsl:call-template><br />
									<b>Enable Clickjack Nonsetup User Headerless?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableClickjackNonsetupUserHeaderless" /></xsl:call-template><br />
									<b>Enable Clickjack Setup?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableClickjackSetup" /></xsl:call-template><br />
									<b>Enable Post For Sessions?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enablePostForSessions" /></xsl:call-template><br />
									<b>Enable SMS Identity?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableSMSIdentity" /></xsl:call-template><br />
									<b>Enforce Ip Ranges Every Request?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enforceIpRangesEveryRequest" /></xsl:call-template><br />
									<b>Force Logout On Session Timeout?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:forceLogoutOnSessionTimeout" /></xsl:call-template><br />
									<b>Force Relogin?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:forceRelogin" /></xsl:call-template><br />
									<b>Lock Sessions To Domain?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:lockSessionsToDomain" /></xsl:call-template><br />
									<b>Lock Sessions To Ip?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:lockSessionsToIp" /></xsl:call-template><br />
									<b>Session Timeout: </b><xsl:value-of select="sfdc:sessionTimeout"/>
								</p>
							</xsl:for-each>
						</xsl:for-each>
						
						<xsl:for-each select="sfdc:AddressSettings">

							<xsl:for-each select="sfdc:countriesAndStates">
								<h3><a name="countriesAndStates">Countries &amp; States</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Country Label</th>
										<th>Iso Code</th>
										<th>Integration Value</th>
										<th>Active?</th>
										<th>OrgDefault?</th>
										<th>Standard?</th>
										<th>Visible?</th>
									</tr>
									<xsl:for-each select="sfdc:countries">
										<xsl:variable name="actcountry" select='position()' />
										<tr>
											<td><xsl:value-of select="sfdc:label"/></td>
											<td><xsl:value-of select="sfdc:isoCode"/></td>
											<td><xsl:value-of select="sfdc:integrationValue"/></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:active" /><xsl:with-param name="title" select="'Active?'" /></xsl:call-template></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:orgDefault" /><xsl:with-param name="title" select="'Org Default?'" /></xsl:call-template></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:standard" /><xsl:with-param name="title" select="'Standard?'" /></xsl:call-template></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:visible" /><xsl:with-param name="title" select="'Visible?'" /></xsl:call-template></td>
										</tr>
										<xsl:if test="count(sfdc:states)>0">
											<tr>
												<td colspan="7">
													<div class="fader"><xsl:attribute name="id"><xsl:value-of select='$actcountry' /></xsl:attribute>States</div>
													<table class="embedded table table-striped"><xsl:attribute name="id"><xsl:value-of select='concat("tab", $actcountry)' /></xsl:attribute>
														<tr>
															<th>State Label</th>
															<th>Iso Code</th>
															<th>Integration Value</th>
															<th>Active?</th>
															<th>Standard?</th>
															<th>Visible?</th>
														</tr>
														<xsl:for-each select="sfdc:states">
															<tr>
																<td><xsl:value-of select="sfdc:label"/></td>
																<td><xsl:value-of select="sfdc:isoCode"/></td>
																<td><xsl:value-of select="sfdc:integrationValue"/></td>
																<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:active" /><xsl:with-param name="title" select="'Active?'" /></xsl:call-template></td>
																<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:standard" /><xsl:with-param name="title" select="'Standard?'" /></xsl:call-template></td>
																<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:visible" /><xsl:with-param name="title" select="'Visible?'" /></xsl:call-template></td>
															</tr>
														</xsl:for-each>
													</table>
												</td>
											</tr>
										</xsl:if>
									</xsl:for-each>
								</table>
							</xsl:for-each>
						</xsl:for-each>
					</div>
				</div>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>