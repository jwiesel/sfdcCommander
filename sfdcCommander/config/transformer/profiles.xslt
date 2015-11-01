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
				<xsl:for-each select="sfdc:Profile">
					<div class="innerbody">
						<xsl:call-template name="get-content-header"><xsl:with-param name="file" select="$file" /></xsl:call-template>
						<div class="dynamiccontent">
							<p>
								<ul class="nav nav-pills">
									<h3>Quick Navigation</h3>
									<xsl:if test="count(sfdc:tabVisibilities)>0"><li><a href="#tabvisibilities">Tab Visibilities</a></li></xsl:if>
									<xsl:if test="count(sfdc:objectPermissions)>0"><li><a href="#objectpermissions">Object Permissions</a></li></xsl:if>
									<xsl:if test="count(sfdc:recordTypeVisibilities)>0"><li><a href="#recordtypevisibilities">Record Type Visibilities</a></li></xsl:if>
									<xsl:if test="count(sfdc:layoutAssignments)>0"><li><a href="#layoutassignments">Layout Assignments</a></li></xsl:if>
									<xsl:if test="count(sfdc:fieldPermissions)>0"><li><a href="#fieldpermissions">Field Permissions</a></li></xsl:if>
								</ul>
							</p>
							
							<p>
								<b>User License: </b><xsl:value-of select="sfdc:userLicense"/><br />
							</p>
							
							<xsl:if test="count(sfdc:tabVisibilities)>0">
								<h3><a name="tabvisibilities">Tab Visibilities</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Tab</th>
										<th>Default Visibility</th>
									</tr>
									<xsl:for-each select="sfdc:tabVisibilities">
										<tr>
											<td>
												<xsl:choose>
													<xsl:when test="starts-with(sfdc:tab,'standard-')">
														<xsl:value-of select="sfdc:tab"/>
													</xsl:when>
													<xsl:otherwise>
														<a><xsl:attribute name="href"><xsl:value-of select="concat('../tabs/', sfdc:tab, '.html')"/></xsl:attribute><xsl:value-of select="sfdc:tab"/></a>
													</xsl:otherwise>
												</xsl:choose>
											</td>
											<td class="icon"><xsl:call-template name="show-power"><xsl:with-param name="field" select="sfdc:visibility" /></xsl:call-template></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:objectPermissions)>0">
								<h3><a name="objectpermissions">Object Permissions</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Object</th>
										<th>Allow Create?</th>
										<th>Allow Read?</th>
										<th>Allow Edit?</th>
										<th>Allow Delete?</th>
										<th>Allow View All?</th>
										<th>Allow Modify All?</th>
									</tr>
									<xsl:for-each select="sfdc:objectPermissions">
										<tr>
											<td><a><xsl:attribute name="href"><xsl:value-of select="concat('../index.html?category=objects&amp;entity=',sfdc:object)"/></xsl:attribute><xsl:value-of select="sfdc:object"/></a></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:allowCreate" /><xsl:with-param name="title" select="'Allow Create?'" /></xsl:call-template></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:allowRead" /><xsl:with-param name="title" select="'Allow Read?'" /></xsl:call-template></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:allowEdit" /><xsl:with-param name="title" select="'Allow Edit?'" /></xsl:call-template></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:allowDelete" /><xsl:with-param name="title" select="'Allow Delete?'" /></xsl:call-template></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:viewAllRecords" /><xsl:with-param name="title" select="'Allow View All?'" /></xsl:call-template></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:modifyAllRecords" /><xsl:with-param name="title" select="'Allow Modify All?'" /></xsl:call-template></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:recordTypeVisibilities)>0">
								<h3><a name="recordtypevisibilities">Record Type Visibilities</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Record Type</th>
										<th>Visible?</th>
										<th>Default?</th>
										<th>personAccountDefault???</th>
									</tr>
									<xsl:for-each select="sfdc:recordTypeVisibilities">
										<tr>
											<xsl:variable name="robject"><xsl:value-of select="substring-before(sfdc:recordType,'.')"/></xsl:variable>
											<xsl:variable name="rtype"><xsl:value-of select="substring-after(sfdc:recordType,'.')"/></xsl:variable>
											<td><a><xsl:attribute name="href"><xsl:value-of select="concat('../index.html?category=objects&amp;entity=',$robject,'#r_',$rtype)"/></xsl:attribute><xsl:value-of select="sfdc:recordType"/></a></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:visible" /><xsl:with-param name="title" select="'Visible?'" /></xsl:call-template></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:default" /><xsl:with-param name="title" select="'Default?'" /></xsl:call-template></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:personAccountDefault" /><xsl:with-param name="title" select="'personAccountDefault?'" /></xsl:call-template></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:layoutAssignments)>0">
								<h3><a name="layoutassignments">Layout Assignments</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Layout</th>
										<th>Record Type</th>
									</tr>
									<xsl:for-each select="sfdc:layoutAssignments">
										<tr>
											<td><a><xsl:attribute name="href"><xsl:value-of select="concat('../index.html?category=layouts&amp;entity=',sfdc:layout)"/></xsl:attribute><xsl:value-of select="sfdc:layout"/></a></td>
											<td><xsl:value-of select="sfdc:recordType"/></td>
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
											<xsl:variable name="object"><xsl:value-of select="substring-before(sfdc:field,'.')"/></xsl:variable>
											<xsl:variable name="field"><xsl:value-of select="substring-after(sfdc:field,'.')"/></xsl:variable>
											<td><a><xsl:attribute name="href"><xsl:value-of select="concat('../index.html?category=objects&amp;entity=',$object,'#f_',$field)"/></xsl:attribute><xsl:value-of select="sfdc:field"/></a></td>
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