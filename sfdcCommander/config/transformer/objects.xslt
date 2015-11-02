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
		<xsl:variable name="object"><xsl:value-of select="substring($file,0,string-length($file)-6)"/></xsl:variable>
		<html>
			<head>
				<xsl:call-template name="get-header"></xsl:call-template>
			</head>
			<body>
				<xsl:for-each select="sfdc:CustomObject">
					<div class="innerbody">
						<xsl:call-template name="get-content-header"><xsl:with-param name="file" select="$file" /></xsl:call-template>
						<div class="dynamiccontent">
							<h3><xsl:if test="sfdc:label!=''"><xsl:value-of select="sfdc:label"/></xsl:if><xsl:if test="sfdc:pluralLabel!=''"> / <xsl:value-of select="sfdc:pluralLabel"/></xsl:if></h3>
							
							<p>
								<ul class="nav nav-pills">
									<h3>Quick Navigation</h3>
									<xsl:if test="count(sfdc:fields)>0"><li><a target="_self" href="#fields">Fields</a></li></xsl:if>
									<xsl:if test="count(sfdc:recordTypes)>0"><li><a target="_self" href="#recordtypes">Record Types</a></li></xsl:if>
									<xsl:if test="count(sfdc:validationRules)>0"><li><a target="_self" href="#validationrules">Validation Rules</a></li></xsl:if>
									<li><a target="_self"><xsl:attribute name="href"><xsl:value-of select="concat('../index.html?category=workflows&amp;entity=', $object)"/></xsl:attribute>Workflows</a></li>
									<xsl:if test="count(sfdc:actionOverrides)>0"><li><a target="_self" href="#actionoverrides">Action Overrides</a></li></xsl:if>
									<xsl:if test="count(sfdc:searchLayouts)>0"><li><a target="_self" href="#searchlayouts">Search Layouts</a></li></xsl:if>
									<xsl:if test="count(sfdc:listViews)>0"><li><a target="_self" href="#listviews">List Views</a></li></xsl:if>
									<xsl:if test="count(sfdc:webLinks)>0"><li><a target="_self" href="#weblinks">Web Links</a></li></xsl:if>
								</ul>
							</p>
							
							<p>
								<b>Deployment Status: </b><xsl:value-of select="sfdc:deploymentStatus"/><br />
								<b>Object Sharing Model: </b><xsl:value-of select="sfdc:sharingModel"/><br />
								<b>Enable Activities?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableActivities" /></xsl:call-template><br />
								<b>Enable Feeds?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableFeeds" /></xsl:call-template><br />
								<b>Enable History?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableHistory" /></xsl:call-template><br />
								<b>Enable Reports?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableReports" /></xsl:call-template><br />
								<b>Enable Enhanced Lookup?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:enableEnhancedLookup" /></xsl:call-template><br />
								<b>Description: </b><span><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></span><br />
								<xsl:for-each select="sfdc:nameField">
									<b>Name Field: </b><xsl:value-of select="sfdc:label"/><br />
								</xsl:for-each>
							</p>
							
							<xsl:if test="count(sfdc:fields)>0">
							<h3><a name="fields">Fields</a></h3>
							<table class="table table-striped table-hover">
								<tr class="headline">
									<th>Field Name</th>
									<th>Label</th>
									<th>Custom?</th>
									<th>Required?</th>
									<th>External ID?</th>
									<th>Unique?</th>
									<th>Type</th>
									<th>Field specifics</th>
									<th>Help Text</th>
									<th>Description</th>
								</tr>
								<xsl:for-each select="sfdc:fields">
									<xsl:sort select="sfdc:fullName" case-order="lower-first" />
									<xsl:variable name="field" select='position()' />
									<tr>
										<td><a><xsl:attribute name="name"><xsl:value-of select='concat("f_",sfdc:fullName)' /></xsl:attribute><xsl:value-of select="sfdc:fullName"/></a></td>
										<td><xsl:value-of select="sfdc:label"/></td>
										<td class="icon">
										<xsl:choose>
											<xsl:when test="substring(sfdc:fullName,string-length(sfdc:fullName)-2,3)='__c'">
												<i class="glyphicon glyphicon-ok"></i>
											</xsl:when>
											<xsl:otherwise>
												<i class="glyphicon glyphicon-remove"></i>
											</xsl:otherwise>
										</xsl:choose>
										</td>
										<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:required" /><xsl:with-param name="title" select="'Required?'" /></xsl:call-template></td>
										<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:externalId" /><xsl:with-param name="title" select="'External ID?'" /></xsl:call-template></td>
										<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:unique" /><xsl:with-param name="title" select="'Unique?'" /></xsl:call-template></td>
										<td><xsl:if test="sfdc:type='Picklist'"><xsl:attribute name="id"><xsl:value-of select='$field' /></xsl:attribute><xsl:attribute name="class">fader</xsl:attribute></xsl:if><xsl:value-of select="sfdc:type"/></td>
										<td>
											<xsl:if test="sfdc:displayFormat!=''">Display Format: <xsl:value-of select="sfdc:displayFormat"/></xsl:if>
											<xsl:if test="count(sfdc:picklist)>0">
												<xsl:for-each select="sfdc:picklist">
													<table class="embedded table table-striped"><xsl:attribute name="id"><xsl:value-of select='concat("tab", $field)' /></xsl:attribute>
														<tr>
															<th>Value</th>
															<th>Default?</th>
														</tr>
														<xsl:for-each select="sfdc:picklistValues">
															<tr>
																<td><xsl:value-of select="sfdc:fullName"/></td>
																<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:default" /></xsl:call-template></td>
															</tr>
														</xsl:for-each>
													</table>
												</xsl:for-each>
											</xsl:if>
											
											<xsl:if test="sfdc:length!=''">Length: <xsl:value-of select="sfdc:length"/><br /></xsl:if>
											
											<xsl:if test="sfdc:referenceTo!=''">Reference To: <a><xsl:attribute name="href"><xsl:value-of select="concat(sfdc:referenceTo,'.html')"/></xsl:attribute><xsl:value-of select="sfdc:referenceTo"/></a><br /></xsl:if>
											<xsl:if test="sfdc:relationshipName!=''">Relationship Name: <xsl:value-of select="sfdc:relationshipName"/><br /></xsl:if>
											<xsl:if test="sfdc:relationshipLabel!=''">Relationship Label: <xsl:value-of select="sfdc:relationshipLabel"/><br /></xsl:if>
											<xsl:if test="sfdc:deleteConstraint!=''">Delete Constraint: <xsl:value-of select="sfdc:deleteConstraint"/></xsl:if>
											
											<xsl:if test="sfdc:scale!=''">Scale: <xsl:value-of select="sfdc:scale"/><br /></xsl:if>
											<xsl:if test="sfdc:precision!=''">Precision: <xsl:value-of select="sfdc:precision"/></xsl:if>
											
											<xsl:if test="sfdc:defaultValue!=''">Default Value: <xsl:value-of select="sfdc:defaultValue"/></xsl:if>
											
											<xsl:if test="sfdc:formula!=''">Formula: <xsl:value-of select="sfdc:formula"/><br /></xsl:if>
											<xsl:if test="sfdc:formulaTreatBlanksAs!=''">Formula Treat Blanks As: <xsl:value-of select="sfdc:formulaTreatBlanksAs"/></xsl:if>
										</td>
										<td><xsl:value-of select="sfdc:inlineHelpText"/></td>
										<td><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></td>
									</tr>
								</xsl:for-each>
							</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:recordTypes)>0">
							<h3><a name="recordtypes">Record Types</a></h3>
							<table class="table table-striped table-hover">
							<tr class="headline">
							<th>Name</th>
							<th>Label</th>
							<th>Active?</th>
							<th>Picklists</th>
							<th>Description</th>
							</tr>
							<xsl:for-each select="sfdc:recordTypes">
								<xsl:variable name="rt" select='position()' />
								<tr>
									<td><a><xsl:attribute name="name"><xsl:value-of select='concat("r_",sfdc:fullName)' /></xsl:attribute><xsl:value-of select="sfdc:fullName"/></a></td>
									<td><xsl:value-of select="sfdc:label"/></td>
									<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:active" /><xsl:with-param name="title" select="'Active?'" /></xsl:call-template></td>
									<td>
										<table>
											<tr>
												<th>Field</th>
												<th>Values</th>
											</tr>
											<xsl:for-each select="sfdc:picklistValues">
												<tr>
													<td class="fader"><xsl:attribute name="id"><xsl:value-of select='concat($rt, "_", position())' /></xsl:attribute><xsl:value-of select="sfdc:picklist"/></td>
													<td>
														<table class="embedded table table-striped"><xsl:attribute name="id"><xsl:value-of select='concat("tab", $rt, "_", position())' /></xsl:attribute>
															<tr>
																<th>Value</th>
																<th>Default?</th>
															</tr>
															<xsl:for-each select="sfdc:values">
																<tr>
																	<td><xsl:value-of select="sfdc:fullName"/></td>
																	<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:default" /><xsl:with-param name="title" select="'Default?'" /></xsl:call-template></td>
																</tr>
															</xsl:for-each>
														</table>
													</td>
												</tr>
											</xsl:for-each>
										</table>
									</td>
									<td><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></td>
								</tr>
							</xsl:for-each>
							</table>
							</xsl:if>
							
							<!-- Page layouts: link to external html -->
							
							<xsl:if test="count(sfdc:validationRules)>0">
								<h3><a name="validationrules">Validation Rules</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Active?</th>
										<th>Display field</th>
										<th>Error Condition</th>
										<th>Error Message</th>
										<th>Description</th>
									</tr>
									<xsl:for-each select="sfdc:validationRules">
										<tr>
											<td><xsl:value-of select="sfdc:fullName"/></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:active" /><xsl:with-param name="title" select="'Active?'" /></xsl:call-template></td>
											<td><xsl:value-of select="sfdc:errorDisplayField"/></td>
											<td><xsl:value-of select="sfdc:errorConditionFormula"/></td>
											<td><xsl:value-of select="sfdc:errorMessage"/></td>
											<td><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<h3>Workflows</h3>
							<a><xsl:attribute name="href"><xsl:value-of select="concat('../index.html?category=workflows&amp;entity=', $object)"/></xsl:attribute>View Object Workflows</a>
							
							<xsl:if test="count(sfdc:actionOverrides)>0">
							<h3><a name="actionoverrides">Action Overrides</a></h3>
							<table class="table table-striped table-hover">
							<tr class="headline">
							<th>Name</th>
							<th>Type</th>
							<th>Content</th>
							<th>Skip Record Type selection?</th>
							</tr>
							<xsl:for-each select="sfdc:actionOverrides">
								<tr>
									<td><xsl:value-of select="sfdc:actionName"/></td>
									<td><xsl:value-of select="sfdc:type"/></td>
									<td><xsl:value-of select="sfdc:content"/></td>
									<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:skipRecordTypeSelect" /></xsl:call-template></td>
								</tr>
							</xsl:for-each>
							</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:searchLayouts)>0">
							<h3><a name="searchlayouts">Search Layouts</a></h3>
							<table class="table table-striped table-hover">
							<tr class="headline">
							<th>Custom Tab List Additional Fields</th>
							<th>Lookup Dialogs Additional Fields</th>
							<th>Search Filter Fields</th>
							<th>Search Results Additional Fields</th>
							</tr>
							<xsl:for-each select="sfdc:searchLayouts">
								<tr>
									<td><xsl:for-each select="sfdc:customTabListAdditionalFields"><xsl:value-of select="."/><br /></xsl:for-each></td>
									<td><xsl:for-each select="sfdc:lookupDialogsAdditionalFields"><xsl:value-of select="."/><br /></xsl:for-each></td>
									<td><xsl:for-each select="sfdc:searchFilterFields"><xsl:value-of select="."/><br /></xsl:for-each></td>
									<td><xsl:for-each select="sfdc:searchResultsAdditionalFields"><xsl:value-of select="."/><br /></xsl:for-each></td>
								</tr>
							</xsl:for-each>
							</table>
							</xsl:if>
								
							<xsl:if test="count(sfdc:listViews)>0">
							<h3><a name="listviews">List Views</a></h3>
							<table class="table table-striped table-hover">
							<tr class="headline">
							<th>Name</th>
							<th>Label</th>
							<th>Language</th>
							<th>Filter Scope</th>
							<th>Columns</th>
							<th>Filters</th>
							</tr>
							<xsl:for-each select="sfdc:listViews">
								<tr>
									<td><xsl:value-of select="sfdc:fullName"/></td>
									<td><xsl:value-of select="sfdc:label"/></td>
									<td><xsl:value-of select="sfdc:language"/></td>
									<td><xsl:value-of select="sfdc:filterScope"/></td>
									<td><xsl:for-each select="sfdc:columns"><xsl:value-of select="."/><br /></xsl:for-each></td>
									<td>
										<xsl:for-each select="sfdc:filters">
											<xsl:value-of select="sfdc:field"/> - <xsl:value-of select="sfdc:operation"/> - <xsl:value-of select="sfdc:value"/><br />
										</xsl:for-each>
									</td>
								</tr>
							</xsl:for-each>
							</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:webLinks)>0">
							<h3><a name="weblinks">Web Links</a></h3>
							<table class="table table-striped table-hover">
							<tr class="headline">
							<th>Name</th>
							<th>Label</th>
							<th>Display type</th>
							<th>Open Type</th>
							<th>Availability</th>
							<th>Has Menubar?</th>
							<th>Has Scrollbars?</th>
							<th>Has Toolbar?</th>
							<th>Height</th>
							<th>Resizable?</th>
							<th>Position</th>
							<th>Protected?</th>
							<th>Shows Location?</th>
							<th>Shows Status?</th>
							<th>Require Row selection?</th>
							<th>Link Type</th>
							<th>Destination</th>
							<th>Description</th>
							</tr>
							<xsl:for-each select="sfdc:webLinks">
								<xsl:variable name="link" select='position()' />
								<tr>
									<td><xsl:value-of select="sfdc:fullName"/></td>
									<td><xsl:value-of select="sfdc:masterLabel"/></td>
									<td><xsl:value-of select="sfdc:displayType"/></td>
									<td><xsl:value-of select="sfdc:openType"/></td>
									<td><xsl:value-of select="sfdc:availability"/></td>
									<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:hasMenubar" /><xsl:with-param name="title" select="'Has Menubar?'" /></xsl:call-template></td>
									<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:hasScrollbars" /><xsl:with-param name="title" select="'Has Scrollbars?'" /></xsl:call-template></td>
									<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:hasToolbar" /><xsl:with-param name="title" select="'Has Toolbar?'" /></xsl:call-template></td>
									<td><xsl:value-of select="sfdc:height"/></td>
									<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:isResizable" /><xsl:with-param name="title" select="'Resizable?'" /></xsl:call-template></td>
									<td><xsl:value-of select="sfdc:position"/></td>
									<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:protected" /><xsl:with-param name="title" select="'Protected?'" /></xsl:call-template></td>
									<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:showsLocation" /><xsl:with-param name="title" select="'Shows Location?'" /></xsl:call-template></td>
									<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:showsStatus" /><xsl:with-param name="title" select="'Shows Status?'" /></xsl:call-template></td>
									<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:requireRowSelection" /><xsl:with-param name="title" select="'Require Row selection?'" /></xsl:call-template></td>
									<td><xsl:if test="sfdc:linkType='javascript'"><xsl:attribute name="id"><xsl:value-of select='concat("wl_", $link)' /></xsl:attribute><xsl:attribute name="class">fader</xsl:attribute></xsl:if><xsl:value-of select="sfdc:linkType"/></td>
									<td>
										<xsl:if test="sfdc:page!=''">Page: <a><xsl:attribute name="href"><xsl:value-of select="concat('../pages/', sfdc:page,'.page-meta.html')"/></xsl:attribute><xsl:value-of select="sfdc:page"/></a></xsl:if>
										<xsl:if test="sfdc:scontrol!=''">sControl: <a><xsl:attribute name="href"><xsl:value-of select="concat('../scontrols/', sfdc:scontrol,'.scf-meta.html')"/></xsl:attribute><xsl:value-of select="sfdc:scontrol"/></a></xsl:if>
										<xsl:if test="sfdc:url!=''">
										<xsl:choose>
											<xsl:when test="sfdc:linkType='javascript'">
												<span><xsl:attribute name="class">embedded</xsl:attribute><xsl:attribute name="id"><xsl:value-of select='concat("tab", "wl_", $link)' /></xsl:attribute>URL: <xsl:value-of select="sfdc:url"/></span>
											</xsl:when>
											<xsl:otherwise>
												URL: <xsl:value-of select="sfdc:url"/>
											</xsl:otherwise>
										</xsl:choose>
										</xsl:if>
									</td>
									<td><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></td>
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
