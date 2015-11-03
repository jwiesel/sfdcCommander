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
				<xsl:for-each select="sfdc:CustomApplication">
				<div class="innerbody">
						<xsl:call-template name="get-content-header"><xsl:with-param name="file" select="$file" /></xsl:call-template>
						<div class="dynamiccontent">
						
							<p>
								<ul class="nav nav-pills">
									<h3>Quick Navigation</h3>
									<xsl:if test="count(sfdc:tab)>0"><li><a target="_self" href="#tab">Tabs</a></li></xsl:if>
									<xsl:if test="count(sfdc:keyboardShortcuts)>0"><li><a target="_self" href="#defaultshortcuts">Default Shortcuts</a></li></xsl:if>
									<xsl:if test="count(sfdc:workspaceMappings)>0"><li><a target="_self" href="#workspacemappings">Workspace Mappings</a></li></xsl:if>
								</ul>
							</p>
						
							<p>
								<b>Label: </b><xsl:value-of select="sfdc:label"/><br />
								<b>Description: </b><span><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></span><br />
								<b>Default Landing Tab: </b><xsl:value-of select="sfdc:defaultLandingTab"/><br />
								<b>Detail Page Refresh Method: </b><xsl:value-of select="sfdc:detailPageRefreshMethod"/><br />
								<b>Enable Customize My Tabs?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableCustomizeMyTabs" /><xsl:with-param name="title" select="'Enable Customize My Tabs?'" /></xsl:call-template><br />
								<b>Enable Keyboard Shortcuts?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableKeyboardShortcuts" /><xsl:with-param name="title" select="'Enable Keyboard Shortcuts?'" /></xsl:call-template><br />
								<b>Enable Multi Monitor Components?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableMultiMonitorComponents" /><xsl:with-param name="title" select="'Enable Multi Monitor Components?'" /></xsl:call-template><br />
								<b>Enable Pin Tabs?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enablePinTabs" /><xsl:with-param name="title" select="'Enable Pin Tabs?'" /></xsl:call-template><br />
								<b>Is Service Cloud Console?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:isServiceCloudConsole" /><xsl:with-param name="title" select="'Is Service Cloud Console?'" /></xsl:call-template><br />
								<b>ListPlacement Location: </b><xsl:for-each select="sfdc:listPlacement"><xsl:value-of select="sfdc:location"/></xsl:for-each><br />
								<b>List Refresh Method: </b><xsl:value-of select="sfdc:listRefreshMethod"/><br />
								<b>Save User Sessions?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:saveUserSessions" /><xsl:with-param name="title" select="'Save User Sessions?'" /></xsl:call-template><br />
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
														<a><xsl:attribute name="href"><xsl:value-of select="concat('../index.html?category=tabs&amp;entity=', encode-for-uri(.))"/></xsl:attribute><xsl:value-of select="."/></a>
													</xsl:otherwise>
												</xsl:choose>
											</td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:keyboardShortcuts)>0">
								<xsl:for-each select="sfdc:keyboardShortcuts">
									<h3><a name="defaultshortcuts">Default Shortcuts</a></h3>
									<table class="table table-striped table-hover">
										<tr class="headline">
											<th>Action</th>
											<th>Key Command</th>
											<th>Active?</th>
										</tr>
										<xsl:for-each select="sfdc:defaultShortcut">
											<tr>
												<td><xsl:value-of select="sfdc:action"/></td>
												<td><xsl:value-of select="sfdc:keyCommand"/></td>
												<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:active" /><xsl:with-param name="title" select="'Active?'" /></xsl:call-template></td>
											</tr>
										</xsl:for-each>
									</table>
								</xsl:for-each>
							</xsl:if>
							
							<xsl:if test="count(sfdc:workspaceMappings)>0">
								<xsl:for-each select="sfdc:workspaceMappings">
									<h3><a name="workspacemappings">Workspace Mappings</a></h3>
									<table class="table table-striped table-hover">
										<tr class="headline">
											<th>Tab</th>
											<th>Field Name</th>
										</tr>
										<xsl:for-each select="sfdc:mapping">
											<tr>
												<td><xsl:value-of select="sfdc:tab"/></td>
												<td><xsl:value-of select="sfdc:fieldName"/></td>
											</tr>
										</xsl:for-each>
									</table>
								</xsl:for-each>
							</xsl:if>
						</div>
					</div>
				</xsl:for-each>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>
