<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="2.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
xmlns:sfdc="http://soap.sforce.com/2006/04/metadata">

	<xsl:output
		method="html"
		doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		omit-xml-declaration="yes"
		encoding="UTF-8"
		indent="yes" />

	<xsl:template match="/">
		<html>
			<head>
				<title>sfdcCommander System Documentation</title>
				<script type="text/javascript" src="script/script.js"></script>
				<script type="text/javascript" src="script/jquery-1.11.2.min.js"></script>
				<script src="script/bootstrap.min.js" type="text/javascript"></script>
				<script>
				$(document).ready(function(){init();});
				</script>
				<link rel="stylesheet" href="css/wrapper.css" type="text/css" id="styleiframe" />
				<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" id="style" />
				<meta charset="utf-8" />
				<meta http-equiv="X-UA-Compatible" content="IE=edge" />
				<meta name="viewport" content="width=device-width, initial-scale=1" />
			</head>
			<body>
				<script type="text/javascript">
				<![CDATA[
				$(document).ready(function(){
					if(getUrlParameter('category') != undefined && getUrlParameter('entity') != undefined) {
						//Update iframe content
						console.log(window.location.hash.substring(1));
						if(window.location.hash.substring(1) != '') {
							$('.contentframe').attr('src', getUrlParameter('category') + '/' + getUrlParameter('entity') + '.html#' + window.location.hash.substring(1));
						} else {
							$('.contentframe').attr('src', getUrlParameter('category') + '/' + getUrlParameter('entity') + '.html');
						}
					}
				});
				]]>
				</script>
				<xsl:for-each select="sfdc:Files">
					<div class="container-fluid">
						<div class="row">
							<div class="col-md-12">
									<h1><a href="index.html">sfdcCommander</a> System Documentation</h1>
									<h2>salesforce.com Organization: <span class="label label-success"><xsl:value-of select="sfdc:system"/></span></h2>
									<p>Last updated on <span class="badge"><xsl:value-of select="format-dateTime(current-dateTime(),'[Y0001]-[M01]-[D01] [H]:[m]:[s]')"/></span></p>
							</div>
						</div>
						<div class="row content">
							<div class="col-md-3">
								<xsl:variable name="entity" select="sfdc:entity" />
								<div class="panel panel-primary">
									<div class="panel-heading">
										<h3 class="panel-title">Navigation</h3>
									</div>
									<div class="panel-body">
										<ul class="nav nav-pills nav-stacked">
											<xsl:for-each select="sfdc:file">
												<xsl:variable name="link"><xsl:value-of select="concat('index.html?category=lists&amp;entity=' ,.)"/></xsl:variable>
												<li>
													<a data-toggle="tooltip" data-placement="top">
														<xsl:attribute name="href"><xsl:value-of select="$link"/></xsl:attribute>
														<xsl:attribute name="data-original-title">View <xsl:value-of select="."/></xsl:attribute>
														<xsl:value-of select="."/>
													</a>
												</li>
											</xsl:for-each>
										</ul>
									</div>
								</div>
							</div>
							<div class="col-md-9">
								<div class="panel panel-primary">
									<iframe class="contentframe" name="content" onLoad="init();"><xsl:attribute name="src"><xsl:value-of select="concat('lists/' ,sfdc:file[1] , '.html')"/></xsl:attribute>
										<p>Your browser does not support iframes</p>
									</iframe>
								</div>
							</div>
						</div>
					</div>
				</xsl:for-each>
			</body>
		</html>
	</xsl:template>

</xsl:stylesheet>
