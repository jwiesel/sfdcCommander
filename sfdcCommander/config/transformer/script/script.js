function init(){
	/*$('tr.dataline:nth-child(2n+2)').addClass('blue');
	$('tr.dataline:nth-child(2n+1)').addClass('white');
	$('ul.quicknav li:nth-child(2n+2)').addClass('blue');
	$('ul.quicknav li:nth-child(2n+1)').addClass('white');*/
	$('.fader').click(function(event){
		$('#tab' + $(this).attr('id')).fadeToggle();
	});
	$(function () {
	  $('[data-toggle="tooltip"]').tooltip()
	});
	
	$('.togglesidebar').click(function(){
		//TODO
	});
	
	$('#original').click(function (){
		$('link#style').attr('href','css/styles.css');
		var iframe = $('.contentframe');
		$('link#styleiframe', iframe.contents()).attr('href','../css/styles.css');
	});
	$('#green').click(function (){
		$('link#style').attr('href','css/styles-green.css');
		var iframe = $('.contentframe');
		$('link#styleiframe', iframe.contents()).attr('href','../css/styles-green.css');
	});
	$('#grey').click(function (){
		$('link#style').attr('href','css/styles-grey.css');
		var iframe = $('.contentframe');
		$('link#styleiframe', iframe.contents()).attr('href','../css/styles-grey.css');
	});
	if($('link#style').attr('href')=='css/styles-green.css') {
		$('#green').trigger('click');
	}
	if($('link#style').attr('href')=='css/styles-grey.css') {
		$('#grey').trigger('click');
	}
}