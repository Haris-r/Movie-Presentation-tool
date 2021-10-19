/**
 * 
 */


$('#dynamicBtn').on('click', function (event){
	
	let dataFormat = $('#format option:selected').text();
	let search = $('#search').val();	
	let dataType =$("input[name='parameter']:checked").val();
	
	var colour = $('#colourId').css("background-color", "#8B0000");

	var id = $('#filmId')
	var title = $('#title')
	var year = $('#year')
	var director = $('#director')
	var stars = $('#stars')
	var review = $('#review')
	
	var updateId = $('#updateId');
	var updateTitle = $('#updateTitle');
	var updateYear = $('#updateYear');
	var updateDirector = $('#updateDirector');
	var updateStars = $('#updateStars');
	var updateReview = $('#updateReview');
	
	var rawFilms = $('#rawid');
	var normalData = $('#normalData');
	
	
	event.preventDefault();
	
	var txtApp;
	let jsonXml;


	$.ajax({
		
		type: 'GET',
	    url: `/Search?search=${search}&parameter=${dataType}&format=${dataFormat}`,
		contentType: `${txtApp}; charset=UTF-8`,
		formats : `${jsonXml}`,
		success: function(data){
			
		if(id.val() === undefined || title.val() === undefined){
			
			alert("this you have input does not exist");
		}
		
		
			if(dataFormat == 'json'){
			
			
				var jsonFilms = JSON.parse(data);
				console.log(jsonFilms);
				
				
				
				id.text(jsonFilms.id);
				title.text(jsonFilms.title);
				year.text("YEAR:  " + jsonFilms.year);
				director.text("DIRECTOR:  " + jsonFilms.director);
				stars.text("STARS:  " + jsonFilms.stars);
				review.text("REVIEW:  " + jsonFilms.review);
				
				
				
				
				updateId.val(jsonFilms.id);
				updateTitle.val(jsonFilms.title);
				updateYear.val(jsonFilms.year);
				updateDirector.val(jsonFilms.director);
				updateStars.val(jsonFilms.stars);
				updateReview.val(jsonFilms.review);
				
				jsonXml = "json";
				txtApp = "application/json"
				
				rawFilms.html(data).hide();
				normalData.show();
				}
				
			else if(dataFormat == 'xml'){
			
			var xml = new XMLSerializer();
			var xmlToStr = xml.serializeToString(data);
				
			let parse =  new DOMParser();
			xmlDoc = parse.parseFromString(xmlToStr, "text/xml");
			
			console.log(xmlDoc);
				
			let parsedId = xmlDoc.getElementsByTagName("id")[0].childNodes[0].nodeValue;
			let parsedTitle = xmlDoc.getElementsByTagName("title")[0].childNodes[0].nodeValue;
			let parsedYear = xmlDoc.getElementsByTagName("year")[0].childNodes[0].nodeValue;
			let parsedDirector = xmlDoc.getElementsByTagName("director")[0].childNodes[0].nodeValue;
			let parsedStars = xmlDoc.getElementsByTagName("star")[0].childNodes[0].nodeValue;
			let parsedReview = xmlDoc.getElementsByTagName("review")[0].childNodes[0].nodeValue;
			
				id.text(parsedId);
				title.text(parsedTitle);
				year.text("YEAR:  "+parsedYear);
				director.text("DIRECTOR:  "+parsedDirector);
				stars.text("STARS:  "+parsedStars);
				review.text("REVIEW:  "+parsedReview);
				
				updateId.val(parsedId);
				updateTitle.val(parsedTitle);
				updateYear.val(parsedYear);
				updateDirector.val(parsedDirector);
				updateStars.val(parsedStars);
				updateReview.val(parsedReview);
				
				jsonXml = "xml";
				txtApp = "text/xml";
				
				rawFilms.text(xmlToStr).hide();
			}
			
			else if(dataFormat == 'text'){
			
				var filmArray = data.split("#");
				
				console.log(filmArray);
				
				id.text(filmArray[0]);
				title.text(filmArray[1]);
				year.text(filmArray[2]);
				director.text(filmArray[3]);
				stars.text(filmArray[4]);
				review.text(filmArray[5]);
				
				updateId.val(filmArray[0]);
				updateTitle.val(filmArray[1]);
				updateYear.val(filmArray[2]);
				updateDirector.val(filmArray[3]);
				updateStars.val(filmArray[4]);
				updateReview.val(filmArray[5]);
				
				jsonXml = "text";
				txtApp = "text/plain";
			
			  rawFilms.text(filmArray).hide();
			}
							
			
		},
		error: function(err){
		console.log(err)
		}
		

	});
	
});


//readFilms();