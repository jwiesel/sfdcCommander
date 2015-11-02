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
				<xsl:for-each select="sfdc:PermissionSet">
					<div class="innerbody">
						<xsl:call-template name="get-content-header"><xsl:with-param name="file" select="$file" /></xsl:call-template>
						<div class="dynamiccontent">
							<p>
								<ul class="nav nav-pills">
									<h3>Quick Navigation</h3>
									<xsl:if test="count(sfdc:applicationVisibilities)>0"><li><a target="_self" href="#applicationvisibilities">Application Visibilities</a></li></xsl:if>
									<xsl:if test="count(sfdc:tabSettings)>0"><li><a target="_self" href="#tabsettings">Tab Settings</a></li></xsl:if>
									<xsl:if test="count(sfdc:classAccesses)>0"><li><a target="_self" href="#classaccesses">Class Accesses</a></li></xsl:if>
									<xsl:if test="count(sfdc:pageAccesses)>0"><li><a target="_self" href="#pageaccesses">Page Accesses</a></li></xsl:if>
									<xsl:if test="count(sfdc:userPermissions)>0"><li><a target="_self" href="#userpermissions">User Permissions</a></li></xsl:if>
									<xsl:if test="count(sfdc:recordTypeVisibilities)>0"><li><a target="_self" href="#recordtypevisibilities">RecordType Visibilities</a></li></xsl:if>
									<xsl:if test="count(sfdc:fieldPermissions)>0"><li><a target="_self" href="#fieldpermissions">Field Permissions</a></li></xsl:if>
								</ul>
							</p>
							
							<p>
								<b>Label: </b><xsl:value-of select="sfdc:label"/><br />
								<b>User License: </b><xsl:value-of select="sfdc:userLicense"/><br />
								<b>Description: </b><span><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></span>
							</p>
							
							<xsl:if test="count(sfdc:applicationVisibilities)>0">
								<h3><a name="applicationvisibilities">Application Visibilities</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Application</th>
										<th>Visible?</th>
									</tr>
									<xsl:for-each select="sfdc:applicationVisibilities">
										<tr>
											<td><a><xsl:attribute name="href"><xsl:value-of select="concat('../index.html?category=applications&amp;entity=', sfdc:application)"/></xsl:attribute><xsl:value-of select="sfdc:application"/></a></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:visible" /><xsl:with-param name="title" select="'Visible?'" /></xsl:call-template></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:tabSettings)>0">
								<h3><a name="tabsettings">Tab Settings</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Tab</th>
										<th>Visibility</th>
									</tr>
									<xsl:for-each select="sfdc:tabSettings">
										<tr>
											<td><a><xsl:attribute name="href"><xsl:value-of select="concat('../index.html?category=tabs&amp;entity=', sfdc:tab)"/></xsl:attribute><xsl:value-of select="sfdc:tab"/></a></td>
											<td><xsl:value-of select="sfdc:visibility"/></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:classAccesses)>0">
								<h3><a name="classaccesses">Class Accesses</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Apex Class</th>
										<th>Enabled?</th>
									</tr>
									<xsl:for-each select="sfdc:classAccesses">
										<tr>
											<td><a><xsl:attribute name="href"><xsl:value-of select="concat('../classes/', sfdc:apexClass,'.cls-meta.html')"/></xsl:attribute><xsl:value-of select="sfdc:apexClass"/></a></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enabled" /><xsl:with-param name="title" select="'Enabled?'" /></xsl:call-template></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:pageAccesses)>0">
								<h3><a name="pageaccesses">Page Accesses</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Apex Page</th>
										<th>Enabled?</th>
									</tr>
									<xsl:for-each select="sfdc:pageAccesses">
										<tr>
											<td><a><xsl:attribute name="href"><xsl:value-of select="concat('../index.html?category=pages&amp;entity=', sfdc:apexPage,'.page-meta')"/></xsl:attribute><xsl:value-of select="sfdc:apexPage"/></a></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enabled" /><xsl:with-param name="title" select="'Enabled?'" /></xsl:call-template></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:userPermissions)>0">
								<h3><a name="userpermissions">User Permissions</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Enabled?</th>
									</tr>
									<xsl:for-each select="sfdc:userPermissions">
										<tr>
											<td><xsl:value-of select="sfdc:name"/></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enabled" /><xsl:with-param name="title" select="'Enabled?'" /></xsl:call-template></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:recordTypeVisibilities)>0">
								<h3><a name="recordtypevisibilities">RecordType Visibilities</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>RecordType</th>
										<th>Visible?</th>
									</tr>
									<xsl:for-each select="sfdc:recordTypeVisibilities">
										<tr>
											<td><xsl:value-of select="sfdc:recordType"/></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:visible" /><xsl:with-param name="title" select="'Enabled?'" /></xsl:call-template></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:fieldPermissions)>0">
								<h3><a name="fieldpermissions">Field Permissions</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Field</th>
										<th>Readable?</th>
										<th>Editable?</th>
									</tr>
									<xsl:for-each select="sfdc:fieldPermissions">
										<tr>
											<td><xsl:value-of select="sfdc:field"/></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:readable" /><xsl:with-param name="title" select="'Readable?'" /></xsl:call-template></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:editable" /><xsl:with-param name="title" select="'Editable?'" /></xsl:call-template></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
						</div>
					</div>
				</xsl:for-each>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>