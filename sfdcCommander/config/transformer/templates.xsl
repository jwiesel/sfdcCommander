<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
xmlns:sfdc="http://soap.sforce.com/2006/04/metadata">

	<!-- Header inclusions -->
	<xsl:template name="get-header">
		<script type="text/javascript" src="../script/script.js"></script>
		<script type="text/javascript" src="../script/jquery-1.11.2.min.js"></script>
		<script src="../script/bootstrap.min.js" type="text/javascript"></script>
		<script>
		$(document).ready(function(){init();});
		</script>
		<link rel="stylesheet" href="../css/content.css" type="text/css" />
		<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css" id="style" />
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
	</xsl:template>
	
	<!-- Substring after Last Template -->
	<xsl:template name="substring-after-last">
		<xsl:param name="string" />
		<xsl:param name="delimiter" />
		<xsl:choose>
			<xsl:when test="contains($string, $delimiter)">
				<xsl:call-template name="substring-after-last">
					<xsl:with-param name="string" select="substring-after($string, $delimiter)" />
					<xsl:with-param name="delimiter" select="$delimiter" />
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$string" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<!-- Show Boolean value template -->
	<xsl:template name="show-boolean">
		<xsl:param name="field" />
		<xsl:param name="title" />
		<xsl:choose>
			<xsl:when test="$field = 'true'">
				<i class="glyphicon glyphicon-ok"></i>
			</xsl:when>
			<xsl:otherwise>
				<i class="glyphicon glyphicon-remove"></i>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<!-- Show Power Icons if "DefaultOn" -->
	<xsl:template name="show-power">
		<xsl:param name="field" />
		<xsl:choose>
			<xsl:when test="$field = 'DefaultOn'">
				<img src="../images/power-on.PNG" />
			</xsl:when>
			<xsl:otherwise>
				<img src="../images/power-off.PNG" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<!-- Highlight Description template -->
	<xsl:template name="highlight-description">
		<xsl:param name="field" />
		<xsl:choose>
			<xsl:when test="string-length($field)> 24">
				<xsl:value-of select="$field" />
			</xsl:when>
			<xsl:when test="string-length($field)> 0">
				<span class="label label-warning">Please update the description:</span> <xsl:value-of select="$field" />
			</xsl:when>
			<xsl:otherwise>
				<span class="label label-danger">Please add a description!</span>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

</xsl:stylesheet>
