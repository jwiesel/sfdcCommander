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
						<xsl:for-each select="sfdc:AutoResponseRules">
							<xsl:for-each select="sfdc:autoResponseRule">
								<h3>Auto Response Rule - <xsl:value-of select="sfdc:fullName"/></h3>
								<p>
									<b>Active?: </b><xsl:call-template name="show-boolean"><xsl:with-param name="field" select="sfdc:active" /><xsl:with-param name="title" select="'Active?'" /></xsl:call-template>
								</p>
								<h4>Rule Entries</h4>
								<table class="table table-striped table-hover">
									<tr class="headline">
										<th>Sender Name</th>
										<th>Sender Email</th>
										<th>Template</th>
										<th>Criteria Items</th>
										<th>Formula</th>
									</tr>
									<xsl:for-each select="sfdc:ruleEntry">
										<tr>
											<td><xsl:value-of select="sfdc:senderName"/></td>
											<td><xsl:value-of select="sfdc:senderEmail"/></td>
											<td><xsl:value-of select="sfdc:template"/></td>
											<td>
												<xsl:if test="count(sfdc:criteriaItems)>0">
													<table class="table table-striped table-hover">
														<tr>
															<th>Field</th>
															<th>Operation</th>
														</tr>
														<xsl:for-each select="sfdc:criteriaItems">
															<tr>
																<td><xsl:value-of select="sfdc:field"/></td>
																<td><xsl:value-of select="sfdc:operation"/></td>
															</tr>
														</xsl:for-each>
													</table>
												</xsl:if>
											</td>
											<td><xsl:value-of select="sfdc:formula"/></td>
										</tr>
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