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
		<xsl:variable name="object"><xsl:value-of select='substring($file,0,string-length($file)-8)' /></xsl:variable>
		<html>
			<head>
				<xsl:call-template name="get-header"></xsl:call-template>
			</head>
			<body>
				<xsl:for-each select="sfdc:Workflow">
					<div class="innerbody">
						<xsl:call-template name="get-content-header"><xsl:with-param name="file" select="$file" /></xsl:call-template>
						<div class="dynamiccontent">
							<p>
								<ul class="nav nav-pills">
									<h3>Quick Navigation</h3>
									<xsl:if test="count(sfdc:rules)>0"><li><a target="_self" href="#rules">Rules</a></li></xsl:if>
									<xsl:if test="count(sfdc:fieldUpdates)>0"><li><a target="_self" href="#fieldupdates">Field Updates</a></li></xsl:if>
									<xsl:if test="count(sfdc:alerts)>0"><li><a target="_self" href="#alerts">Alerts</a></li></xsl:if>
									<xsl:if test="count(sfdc:tasks)>0"><li><a target="_self" href="#tasks">Tasks</a></li></xsl:if>
								</ul>
							</p>
							<xsl:if test="count(sfdc:rules)=0 and count(sfdc:fieldUpdates)=0 and count(sfdc:alerts)=0 and count(sfdc:tasks)=0">
								<p><b>No workflows defined for object!</b></p>
							</xsl:if>
							
							<xsl:if test="count(sfdc:rules)>0">
								<h3><a name="rules">Rules</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Trigger Type</th>
										<th>Active?</th>
										<th>Criteria</th>
										<th>Actions</th>
										<th>Time Trigger</th>
										<th>Description</th>
									</tr>
									<xsl:for-each select="sfdc:rules">
										<tr>
											<td><xsl:value-of select="sfdc:fullName"/></td>
											<td><xsl:value-of select="sfdc:triggerType"/></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:active" /><xsl:with-param name="title" select="'Active?'" /></xsl:call-template></td>
											<td><xsl:for-each select="sfdc:criteriaItems"><xsl:value-of select="sfdc:field"/> - <xsl:value-of select="sfdc:operation"/> - <xsl:value-of select="sfdc:value"/><br /></xsl:for-each></td>
											<td>
												<xsl:for-each select="sfdc:actions">
													<xsl:choose>
														<xsl:when test="sfdc:type='FieldUpdate'">
															<xsl:value-of select="sfdc:type"/>: <a><xsl:attribute name="href"><xsl:value-of select="concat('#fu_', sfdc:name)"/></xsl:attribute><xsl:value-of select="sfdc:name"/></a><br />
														</xsl:when>
														<xsl:when test="sfdc:type='Alert'">
															<xsl:value-of select="sfdc:type"/>: <a><xsl:attribute name="href"><xsl:value-of select="concat('#al_', sfdc:name)"/></xsl:attribute><xsl:value-of select="sfdc:name"/></a><br />
														</xsl:when>
														<xsl:otherwise>
															<xsl:value-of select="sfdc:type"/>: <xsl:value-of select="sfdc:name"/><br />
														</xsl:otherwise>
													</xsl:choose>
												</xsl:for-each>
											</td>
											<td>
												<xsl:for-each select="sfdc:workflowTimeTriggers">
													<xsl:for-each select="sfdc:actions"><xsl:value-of select="sfdc:type"/>: <xsl:value-of select="sfdc:name"/><br /></xsl:for-each><br />
													<xsl:if test="sfdc:offsetFromField!=''">Offset From Field: <xsl:value-of select="sfdc:offsetFromField"/><br /></xsl:if>
													<xsl:if test="sfdc:timeLength!=''">Time Length: <xsl:value-of select="sfdc:timeLength"/> .<xsl:value-of select="sfdc:workflowTimeTriggerUnit"/></xsl:if>
												</xsl:for-each>
											</td>
											<td><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:fieldUpdates)>0">
								<h3><a name="fieldupdates">Field Updates</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Label</th>
										<th>Field</th>
										<th>Operation</th>
										<th>Operation Details</th>
										<th>Protected?</th>
										<th>Notify Assignee?</th>
										<th>Description</th>
									</tr>
									<xsl:for-each select="sfdc:fieldUpdates">
										<tr>
											<td><a><xsl:attribute name="name"><xsl:value-of select="concat('fu_', sfdc:fullName)"/></xsl:attribute><xsl:value-of select="sfdc:fullName"/></a></td>
											<td><xsl:value-of select="sfdc:name"/></td>
											<td><a><xsl:attribute name="href"><xsl:value-of select="concat('../objects/',$object,'.html#f_',sfdc:field)"/></xsl:attribute><xsl:value-of select="sfdc:field"/></a></td>
											<td><xsl:value-of select="sfdc:operation"/></td>
											<td>
												<xsl:if test="sfdc:lookupValueType!=''">Lookup Value Type: <xsl:value-of select="sfdc:lookupValueType"/><br /></xsl:if>
												<xsl:if test="sfdc:lookupValue!=''">Lookup Value: <xsl:value-of select="sfdc:lookupValue"/></xsl:if>
												
												<xsl:if test="sfdc:literalValue!=''">Literal Value: <xsl:value-of select="sfdc:literalValue"/></xsl:if>
												
												<xsl:if test="sfdc:formula!=''">Formula: <xsl:value-of select="sfdc:formula"/><br /></xsl:if>
											</td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:protected" /><xsl:with-param name="title" select="'Protected?'" /></xsl:call-template></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:notifyAssignee" /><xsl:with-param name="title" select="'Notify Assignee?'" /></xsl:call-template></td>
											<td><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:alerts)>0">
								<h3><a name="alerts">Alerts</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Template</th>
										<th>Sender Type</th>
										<th>Recipients</th>
										<th>Protected?</th>
										<th>Description</th>
									</tr>
									<xsl:for-each select="sfdc:alerts">
										<tr>
											<td><a><xsl:attribute name="name"><xsl:value-of select="concat('al_', sfdc:fullName)"/></xsl:attribute><xsl:value-of select="sfdc:fullName"/></a></td>
											<td><xsl:value-of select="sfdc:template"/></td>
											<td><xsl:value-of select="sfdc:senderType"/></td>
											<td>
												<table>
													<tr>
														<th>Type</th>
														<th>Recipient</th>
													</tr>
													<xsl:for-each select="sfdc:recipients">
														<tr>
															<td><xsl:value-of select="sfdc:type"/></td>
															<td><xsl:value-of select="sfdc:recipient"/></td>
														</tr>
													</xsl:for-each>
												</table>
											</td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:protected" /><xsl:with-param name="title" select="'Protected?'" /></xsl:call-template></td>
											<td><xsl:call-template name="highlight-description"><xsl:with-param name="field" select="sfdc:description" /></xsl:call-template></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:tasks)>0">
								<h3><a name="tasks">Tasks</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Assign To Type</th>
										<th>Assign To</th>
										<th>Notify Assignee?</th>
										<th>Subject</th>
										<th>Status</th>
										<th>Priority</th>
										<th>Offset From Field</th>
										<th>Due Date Offset</th>
										<th>Protected?</th>
										<th>Description</th>
									</tr>
									<xsl:for-each select="sfdc:tasks">
										<tr>
											<td><xsl:value-of select="sfdc:fullName"/></td>
											<td><xsl:value-of select="sfdc:assignedToType"/></td>
											<td><xsl:value-of select="sfdc:assignedTo"/></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:notifyAssignee" /><xsl:with-param name="title" select="'Notify Assignee?'" /></xsl:call-template></td>
											<td><xsl:value-of select="sfdc:subject"/></td>
											<td><xsl:value-of select="sfdc:status"/></td>
											<td><xsl:value-of select="sfdc:priority"/></td>
											<td><xsl:value-of select="sfdc:offsetFromField"/></td>
											<td><xsl:value-of select="sfdc:dueDateOffset"/></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:protected" /><xsl:with-param name="title" select="'Protected?'" /></xsl:call-template></td>
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