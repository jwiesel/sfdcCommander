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
				<xsl:for-each select="sfdc:Translations">
					<div class="innerbody">
						<xsl:call-template name="get-content-header"><xsl:with-param name="file" select="$file" /></xsl:call-template>
						<div class="dynamiccontent">
							<p>
								<ul class="nav nav-pills">
									<h3>Quick Navigation</h3>
									<xsl:if test="count(sfdc:customApplications)>0"><li><a target="_self" href="#customapplications">Custom Applications</a></li></xsl:if>
									<xsl:if test="count(sfdc:customTabs)>0"><li><a target="_self" href="#customtabs">Custom Tabs</a></li></xsl:if>
									<xsl:if test="count(sfdc:customLabels)>0"><li><a target="_self" href="#customlabels">Custom Labels</a></li></xsl:if>
									<xsl:if test="count(sfdc:customPageWebLinks)>0"><li><a target="_self" href="#custompageweblinks">Custom Page WebLinks</a></li></xsl:if>
									<xsl:if test="count(sfdc:scontrols)>0"><li><a target="_self" href="#scontrols">sControls</a></li></xsl:if>
									<xsl:if test="count(sfdc:reportTypes)>0"><li><a target="_self" href="#reporttypes">Report Types</a></li></xsl:if>
								</ul>
							</p>
							
							<xsl:if test="count(sfdc:customApplications)>0">
								<h3><a name="customapplications">Custom Applications</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Label</th>
									</tr>
									<xsl:for-each select="sfdc:customApplications">
										<tr>
											<td><xsl:value-of select="sfdc:name"/></td>
											<td><xsl:value-of select="sfdc:label"/></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>

							<xsl:if test="count(sfdc:customTabs)>0">
								<h3><a name="customtabs">Custom Tabs</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Label</th>
									</tr>
									<xsl:for-each select="sfdc:customTabs">
										<tr>
											<td><a><xsl:attribute name="href"><xsl:value-of select="concat('../tabs/',sfdc:name,'.html')"/></xsl:attribute><xsl:value-of select="sfdc:name"/></a></td>
											<td><xsl:value-of select="sfdc:label"/></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:customLabels)>0">
								<h3><a name="customlabels">Custom Labels</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Label</th>
									</tr>
									<xsl:for-each select="sfdc:customLabels">
										<tr>
											<td><xsl:value-of select="sfdc:name"/></td>
											<td><xsl:value-of select="sfdc:label"/></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:customPageWebLinks)>0">
								<h3><a name="custompageweblinks">Custom Page WebLinks</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Label</th>
									</tr>
									<xsl:for-each select="sfdc:customPageWebLinks">
										<tr>
											<td><xsl:value-of select="sfdc:name"/></td>
											<td><xsl:value-of select="sfdc:label"/></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:scontrols)>0">
								<h3><a name="scontrols">sControls</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Label</th>
									</tr>
									<xsl:for-each select="sfdc:scontrols">
										<tr>
											<td><xsl:value-of select="sfdc:name"/></td>
											<td><xsl:value-of select="sfdc:label"/></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:reportTypes)>0">
								<h3><a name="reporttypes">Report Types</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Label</th>
										<th>Sections</th>
										<th>Description</th>
									</tr>
									<xsl:for-each select="sfdc:reportTypes">
										<tr>
											<td><xsl:value-of select="sfdc:name"/></td>
											<td><xsl:value-of select="sfdc:label"/></td>
											<td>
												<table>
													<tr>
														<th>Name</th>
														<th>Label</th>
													</tr>
													<xsl:for-each select="sfdc:sections">
														<tr>
															<td><xsl:value-of select="sfdc:name"/></td>
															<td><xsl:value-of select="sfdc:label"/></td>
														</tr>
													</xsl:for-each>
												</table>
											</td>
											<td><xsl:value-of select="sfdc:description"/></td>
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