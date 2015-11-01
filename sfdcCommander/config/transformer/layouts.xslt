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
		<xsl:variable name="object"><xsl:value-of select="substring-before($file,'-')"/></xsl:variable>
		<html>
			<head>
				<xsl:call-template name="get-header"></xsl:call-template>
			</head>
			<body>
				<xsl:for-each select="sfdc:Layout">
					<div class="innerbody">
						<xsl:call-template name="get-content-header"><xsl:with-param name="file" select="$file" /></xsl:call-template>
						<div class="dynamiccontent">
							<p>
								<ul class="nav nav-pills">
									<h3>Quick Navigation</h3>
									<xsl:if test="count(sfdc:customButtons)>0 or count(sfdc:excludeButtons)>0"><li><a href="#buttons">Buttons</a></li></xsl:if>
									<xsl:if test="count(sfdc:layoutSections)>0"><li><a href="#layoutsections">Layout Sections</a></li></xsl:if>
									<xsl:if test="count(sfdc:relatedLists)>0"><li><a href="#relatedlists">Related Lists</a></li></xsl:if>
								</ul>
							</p>
							
							<p>
								<b>Related Objects???: </b><xsl:value-of select="sfdc:relatedObjects"/><br />
								<b>Show Email Checkbox: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:showEmailCheckbox" /></xsl:call-template><br />
								<b>Show Highlights Panel: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:showHighlightsPanel" /></xsl:call-template><br />
								<b>Show Interaction Log Panel: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:showInteractionLogPanel" /></xsl:call-template><br />
								<b>Show Run Assignment Rules Checkbox: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:showRunAssignmentRulesCheckbox" /></xsl:call-template><br />
								<b>Show Submit And Attach Button: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:showSubmitAndAttachButton" /></xsl:call-template><br />
							</p>
							
							<xsl:if test="count(sfdc:customButtons)>0 or count(sfdc:excludeButtons)>0">
								<h3><a name="buttons">Buttons</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Exclude Buttons</th>
										<th>Custom Buttons</th>
									</tr>
									<tr>
										<td>
											<xsl:for-each select="sfdc:excludeButtons">
												<div class="button exclude"><xsl:value-of select="."/></div>
											</xsl:for-each>
										</td>
										<td>
											<xsl:for-each select="sfdc:customButtons">
												<div class="button"><xsl:value-of select="."/></div>
											</xsl:for-each>
										</td>
									</tr>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:layoutSections)>0">
								<h3><a name="layoutsections">Layout Sections</a></h3>
								<table class="layoutsection">
									<xsl:for-each select="sfdc:layoutSections">
										<tr class="layoutheadline">
											<th colspan="2"><xsl:value-of select="sfdc:label"/> (Custom Label? <xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:customLabel" /></xsl:call-template>)</th>
										</tr>
										<!-- if styles TwoColumnsLeftToRight, TwoColumnsTopToBottom, OneColumn, CustomLinks -->
										<tr><xsl:attribute name="class"><xsl:value-of select="concat('layoutcontent ', sfdc:style)"/></xsl:attribute>
											<xsl:for-each select="sfdc:layoutColumns">
											<td>
												<xsl:for-each select="sfdc:layoutItems">
													<xsl:if test="sfdc:field!=''">
														<div class="f-label"><a><xsl:attribute name="href"><xsl:value-of select="concat('../index.html?category=objects&amp;entity=',$object,'#f_',sfdc:field)"/></xsl:attribute><xsl:value-of select="sfdc:field"/></a></div>
														<div><xsl:attribute name="class"><xsl:value-of select="concat('field ', sfdc:behavior)"/></xsl:attribute></div>
													</xsl:if>
													
													
													<xsl:if test="sfdc:scontrol!=''">sControl: <xsl:value-of select="sfdc:scontrol"/><br /></xsl:if>
													
													<xsl:if test="sfdc:page!=''">Page: <xsl:value-of select="sfdc:page"/><br /></xsl:if>
													
													<xsl:if test="sfdc:width!=''">Width: <xsl:value-of select="sfdc:width"/><br /></xsl:if>
													<xsl:if test="sfdc:height!=''">Height: <xsl:value-of select="sfdc:height"/><br /></xsl:if>
													<xsl:if test="sfdc:showLabel!=''">Show Label? <xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:showLabel" /></xsl:call-template><br /></xsl:if>
													<xsl:if test="sfdc:showScrollbars!=''">Show Toolbars? <xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:showScrollbars" /></xsl:call-template><br /></xsl:if>
													
													<xsl:if test="sfdc:customLink!=''">Custom Link: <xsl:value-of select="sfdc:customLink"/><br /></xsl:if>
												</xsl:for-each>
											</td>
											</xsl:for-each>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<!-- Mini Layout? -->
							
							<xsl:if test="count(sfdc:relatedLists)>0">
								<h3><a name="relatedlists">Related Lists</a></h3>
								<xsl:for-each select="sfdc:relatedLists">
									<table class="relatedlist">
										<tr class="listheader">
											<th colspan="100">
												<div><xsl:value-of select="sfdc:relatedList"/><xsl:text>     </xsl:text></div>
												<xsl:if test="sfdc:excludeButtons!=''"><xsl:for-each select="sfdc:excludeButtons"><div class="button exclude"><xsl:value-of select="."/></div></xsl:for-each></xsl:if>
											</th>
										</tr>
										<tr class="listcolumns">
											<xsl:for-each select="sfdc:fields"><td><xsl:value-of select="."/></td></xsl:for-each>
										</tr>
									</table><br />						
								</xsl:for-each>
							</xsl:if>
						</div>
					</div>
				</xsl:for-each>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>