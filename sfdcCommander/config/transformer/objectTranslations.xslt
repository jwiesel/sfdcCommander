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
				<xsl:for-each select="sfdc:CustomObjectTranslation">
					<div class="innerbody">
						<xsl:call-template name="get-content-header"><xsl:with-param name="file" select="$file" /></xsl:call-template>
						<div class="dynamiccontent">
							<p>
								<ul class="nav nav-pills">
									<h3>Quick Navigation</h3>
									<xsl:if test="count(sfdc:caseValues)>0"><li><a href="#casevalues">Case Values</a></li></xsl:if>
									<xsl:if test="count(sfdc:fields)>0"><li><a href="#fields">Fields</a></li></xsl:if>
									<xsl:if test="count(sfdc:layouts)>0"><li><a href="#layouts">Layouts</a></li></xsl:if>
									<xsl:if test="count(sfdc:recordTypes)>0"><li><a href="#recordtypes">Record Types</a></li></xsl:if>
									<xsl:if test="count(sfdc:validationRules)>0"><li><a href="#validationrules">Validation Rules</a></li></xsl:if>
									<xsl:if test="count(sfdc:webLinks)>0"><li><a href="#weblinks">Web Links</a></li></xsl:if>
								</ul>
							</p>
							
							<p>
								<b>Gender: </b><xsl:value-of select="sfdc:gender"/><br />
								<b>Name Field Label: </b><xsl:value-of select="sfdc:nameFieldLabel"/><br />
							</p>
							
							<xsl:if test="count(sfdc:caseValues)>0">
								<h3><a name="casevalues">Case Values</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Case Type</th>
										<th>Plural?</th>
										<th>Possessive</th>
										<th>Value</th>
									</tr>
									<xsl:for-each select="sfdc:caseValues">
										<tr>
											<td><xsl:value-of select="sfdc:caseType"/></td>
											<td class="icon"><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:plural" /></xsl:call-template></td>
											<td><xsl:value-of select="sfdc:possessive"/></td>
											<td><xsl:value-of select="sfdc:value"/></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:fields)>0">
								<h3><a name="fields">Fields</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Label</th>
										<th>Field Specifics</th>
										<th>Help Text</th>
									</tr>
									<xsl:for-each select="sfdc:fields">
										<xsl:variable name="actfield" select='position()' />
										<tr>
											<td><xsl:value-of select="sfdc:name"/></td>
											<td><xsl:value-of select="sfdc:label"/></td>
											<td>
												<xsl:if test="sfdc:relationshipLabel!=''">Relationship Label: <xsl:value-of select="sfdc:relationshipLabel"/><br /></xsl:if>
												
												<xsl:if test="count(sfdc:picklistValues)>0">
													<div class="fader"><xsl:attribute name="id"><xsl:value-of select='$actfield' /></xsl:attribute>Picklist</div>
													<table class="embedded table table-striped"><xsl:attribute name="id"><xsl:value-of select='concat("tab", $actfield)' /></xsl:attribute>
														<tr>
															<th>Master Label</th>
															<th>Translation</th>
														</tr>
														<xsl:for-each select="sfdc:picklistValues">
															<tr>
																<td><xsl:value-of select="sfdc:masterLabel"/></td>
																<td><xsl:value-of select="sfdc:translation"/></td>
															</tr>
														</xsl:for-each>
													</table>
												</xsl:if>

											</td>
											<td><xsl:value-of select="sfdc:help"/></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:layouts)>0">
								<h3><a name="layouts">Layouts</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Section</th>
									</tr>
									<xsl:for-each select="sfdc:layouts">
										<tr>
											<td><xsl:value-of select="sfdc:layout"/></td>
											<td>
												<xsl:if test="count(sfdc:sections)>0">
													<table class="embedded_visible table table-striped">
														<tr>
															<th>Name</th>
															<th>Label</th>
														</tr>
														<xsl:for-each select="sfdc:sections">
															<tr>
																<td><xsl:value-of select="sfdc:section"/></td>
																<td><xsl:value-of select="sfdc:label"/></td>
															</tr>
														</xsl:for-each>
													</table>
												</xsl:if>

											</td>
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
									</tr>
									<xsl:for-each select="sfdc:recordTypes">
										<tr>
											<td><xsl:value-of select="sfdc:name"/></td>
											<td><xsl:value-of select="sfdc:label"/></td>
										</tr>
									</xsl:for-each>
								</table>
							</xsl:if>
							
							<xsl:if test="count(sfdc:validationRules)>0">
								<h3><a name="validationrules">Validation Rules</a></h3>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Name</th>
										<th>Error Message</th>
									</tr>
									<xsl:for-each select="sfdc:validationRules">
										<tr>
											<td><xsl:value-of select="sfdc:name"/></td>
											<td><xsl:value-of select="sfdc:errorMessage"/></td>
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
									</tr>
									<xsl:for-each select="sfdc:webLinks">
										<tr>
											<td><xsl:value-of select="sfdc:name"/></td>
											<td><xsl:value-of select="sfdc:label"/></td>
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