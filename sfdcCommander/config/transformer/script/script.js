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
	
}
var getUrlParameter = function getUrlParameter(sParam) {
    var sPageURL = decodeURIComponent(window.location.search.substring(1)),
        sURLVariables = sPageURL.split('&'),
        sParameterName,
        i;

    for (i = 0; i < sURLVariables.length; i++) {
        sParameterName = sURLVariables[i].split('=');

        if (sParameterName[0] === sParam) {
            return sParameterName[1] === undefined ? true : sParameterName[1];
        }
    }
};
