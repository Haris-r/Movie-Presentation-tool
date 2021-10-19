/**
 * 
 */


$('#allFilms').on('click', function(){
	let dataFormat = $('#format option:selected').text();
	$.ajax({
		
		type: 'GET',
	    url: `Home?data-format=${dataFormat}`,
		success: function(data){
			
			window.location.href = `Home?data-format=${dataFormat}`;
			
		},
		error: function(err){
		console.log(err)
		}
			
});

});



$('#postFilm').on('click', function(event){
	
	event.preventDefault();
	let dataFormat1 =$("input[name='format']:checked").val();
	
	var txtApp;
	let jsonXml;
	var xmlJsonData;
	
	
	if(dataFormat1 == 'json'){
		
	let data = {
		
		 id : $('#fId').val(),
		 title : $('#fTitle').val(),
		 year : $('#fYear').val(),
		 director : $('#fDirector').val(),
		 stars : $('#fStars').val(),
		 review : $('#fReview').val(),
	
		}
	var stringJson = JSON.stringify(data);
	
		jsonXml = "json";
		txtApp = "application/json"
		xmlJsonData = stringJson;
		
	}else if(dataFormat1 == 'xml'){
		
	var postId = $('#fId').val();
	var postTitle = $('#fTitle').val();
	var postYear = $('#fYear').val();
	var postDirector = $('#fDirector').val();
	var postStars = $('#fStars').val();
	var postReview = $('#fReview').val();
		
		var xml = `<film>
        <id>${postId}</id>
        <title>${postTitle}</title>
        <year>${postYear}</year>
        <director>${postDirector}</director>
        <stars>${postStars}</stars>
        <review>${postReview}</review>
    	</film>`;
		
		jsonXml = "xml";
		txtApp = "application/xml";
	    xmlJsonData = xml;

	}

	$.ajax({
		
		type: 'POST',
	    url: `/rest/films/`,
		data: xmlJsonData,
		contentType: `${txtApp}; charset=UTF-8`,
		formats : `${jsonXml}`,
		success: function(data){
			
			console.log(data);
			alert("Your movie has been created successfully");
			
		}
			
	
});

});

$('#updateFilm').on('click', function(event){
	
	event.preventDefault();
	
	let dataFormat1 = $("input[name='jxFormat']:checked").val();
	
	var txtApp;
	let jsonXml;
	var xmlJsonData;
	
	if(dataFormat1 == 'json'){
	
	let data = {
		
		 id : $('#updateId').val(),
		 title : $('#updateTitle').val(),
		 year : $('#updateYear').val(),
		 director : $('#updateDirector').val(),
		 stars : $('#updateStars').val(),
		 review : $('#updateReview').val(),
	
		}
		var stringJson = JSON.stringify(data);
		jsonXml = "json";
		txtApp = "application/json"
		xmlJsonData = stringJson;
	}
	else if(dataFormat1 == 'xml'){
		
	var updateId = $('#updateId').val();
	var updateTitle = $('#updateTitle').val();
	var updateYear = $('#updateYear').val();
	var updateDirector = $('#updateDirector').val();
	var updateStars = $('#updateStars').val();
	var updateReview = $('#updateReview').val();
		
		var xml = `<film>
        <id>${updateId}</id>
        <title>${updateTitle}</title>
        <year>${updateYear}</year>
        <director>${updateDirector}</director>
        <stars>${updateStars}</stars>
        <review>${updateReview}</review>
    	</film>`;
		
		jsonXml = "xml";
		txtApp = "application/xml";
	    xmlJsonData = xml;

	}
	
	$.ajax({
		
		type: 'PUT',
	    url: `/rest/films/`,
		data:xmlJsonData,
		contentType: `${txtApp}; charset=UTF-8`,
		formats : `${jsonXml}`,
		success: function(data){
			
			
			alert(`this movie has been updated!`);
			
		}
			
	
});

});
 
$('#deleteFilm').on('click', function(event){
	
	event.preventDefault();
	
	var readOnlyId = $('#updateId').val();
	

	console.log(id);
	
	$.ajax({
		
		type: 'DELETE',
	    url: `/rest/films/${readOnlyId}`,
		success: function(data){

			alert(`THE SELECTED MOVIE HAS BEEN DELETED!`);
			
		}
			
});

});

 $("#stylebtn2").hide()
           
          
 $("#dynamicBtn").on('click', function(){
         
	
	$("#stylebtn2").show();
         
  
 });
       

