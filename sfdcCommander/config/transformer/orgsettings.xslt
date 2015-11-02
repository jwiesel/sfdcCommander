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
				<xsl:for-each select="sfdc:SecuritySettings">
					<div class="innerbody">
						<xsl:call-template name="get-content-header"><xsl:with-param name="file" select="$file" /></xsl:call-template>
						<div class="dynamiccontent">
							<p>
								<ul class="nav nav-pills">
									<h3>Quick Navigation</h3>
									<xsl:if test="count(sfdc:networkAccess)>0"><li><a target="_self" href="#networkaccess">Network Access</a></li></xsl:if>
									<xsl:if test="count(sfdc:passwordPolicies)>0"><li><a target="_self" href="#passwordpolicies">Password Policies</a></li></xsl:if>
									<xsl:if test="count(sfdc:sessionSettings)>0"><li><a target="_self" href="#sessionsettings">sessionSettings</a></li></xsl:if>
								</ul>
							</p>
							
							<xsl:if test="count(sfdc:networkAccess)>0">
								<h3><a name="networkaccess">Network Access</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Start IP-Address</th>
										<th>End IP-Address</th>
									</tr>
									<xsl:for-each select="sfdc:networkAccess">
										<xsl:sort select="sfdc:ipRanges/start" data-type="number" order="ascending"/>
										<xsl:sort select="sfdc:ipRanges/end" data-type="number" order="ascending"/>
										<xsl:for-each select="sfdc:ipRanges">
											<tr>
												<td><xsl:value-of select="sfdc:start"/></td>
												<td><xsl:value-of select="sfdc:end"/></td>
											</tr>
										</xsl:for-each>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:passwordPolicies)>0">
								<h3><a name="passwordpolicies">Password Policies</a></h3>
								<xsl:for-each select="sfdc:passwordPolicies">
									<p>
										<b>Complexity: </b><xsl:value-of select="sfdc:complexity"/><br />
										<b>Expiration: </b><xsl:value-of select="sfdc:expiration"/><br />
										<b>History Restriction: </b><xsl:value-of select="sfdc:historyRestriction"/><br />
										<b>Lockout Interval: </b><xsl:value-of select="sfdc:lockoutInterval"/><br />
										<b>Max Login Attempts: </b><xsl:value-of select="sfdc:maxLoginAttempts"/><br />
										<b>Min Password Length: </b><xsl:value-of select="sfdc:minPasswordLength"/><br />
										<b>Question Restriction: </b><xsl:value-of select="sfdc:questionRestriction"/>
									</p>
								</xsl:for-each>
							</xsl:if>
							
							<xsl:if test="count(sfdc:sessionSettings)>0">
								<h3><a name="sessionsettings">Session Settings</a></h3>
								<xsl:for-each select="sfdc:sessionSettings">
									<p>
										<b>Disable Timeout Warning?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:disableTimeoutWarning" /></xsl:call-template><br />
										<b>Enable Cache And Autocomplete?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableCacheAndAutocomplete" /></xsl:call-template><br />
										<b>Enable SMS Identity?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableSMSIdentity" /></xsl:call-template><br />
										<b>Force Relogin?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:forceRelogin" /></xsl:call-template><br />
										<b>Lock Sessions To Ip?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:lockSessionsToIp" /></xsl:call-template><br />
										<b>Session Timeout: </b><xsl:value-of select="sfdc:sessionTimeout"/>
									</p>
								</xsl:for-each>
							</xsl:if>
						</div>
					</div>
				</xsl:for-each>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>