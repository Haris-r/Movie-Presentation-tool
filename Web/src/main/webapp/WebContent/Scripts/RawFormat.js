/**
 * 
 */

 $("#rawFormatBtn").hide()
	$("#cleanBtn").hide()
	
$("#dynamicBtn").on('click', function(){
         
	$("#rawFormatBtn").show();
	$("#cleanBtn").show();
         
 });

$("#rawFormatBtn").on('click', function(){
	
	
	var rawFilms = $('#rawid');
	var normalData = $('#normalData');
	var colour = $('#colourId').css("background-color", "#2E8B57");
	
	normalData.hide();
	rawFilms.show();
	
	
	
	});
	
	$("#cleanBtn").on('click', function(){
	
	
	var rawFilms = $('#rawid');
	var normalData = $('#normalData');
	
	var ncolour = $('#normalData').css("background-color", "#00CED1");
	
	normalData.show();
	rawFilms.hide();
	
	
	
	});

