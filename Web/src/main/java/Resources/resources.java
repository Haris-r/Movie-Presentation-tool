package Resources;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import model.Film;
import model.FilmDAO;


@Path("/films")

public class resources {
	
	
//	FilmDAO dao = new FilmDAO();
	Film film = new Film();
	
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Film> getAllFilms() {
		
		
	List<Film> films = new ArrayList<Film>();
	
	films = FilmDAO.getSingletonCam().getAllFilms();
	
	return films;
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Film postCreateFilm(Film f){
			
		FilmDAO.getSingletonCam().postCreateFilm(f.getId(), f.getTitle(), f.getYear(), f.getDirector(), f.getStars(), f.getReview());
		//dao.postCreateFilm();
		
		film = FilmDAO.getSingletonCam().getFilmByID(f.getId());
		//film = dao.getFilmByID(f.getId());
		
		return film;

	}
	
	@PUT
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Film updateFilm(Film f){
		
		
		FilmDAO.getSingletonCam().updateFilm(f.getId(), f.getTitle(), f.getYear(), f.getDirector(), f.getStars(), f.getReview());
		
		film = FilmDAO.getSingletonCam().getFilmByID(f.getId());
		
		return film;

		
	}
	
	@DELETE
	@Path("{filmId}")
	public void deleteFilmById(@PathParam("filmId") int id){
		
		
		FilmDAO.getSingletonCam().deleteFilmById(id);
		film = FilmDAO.getSingletonCam().getFilmByID(id);

		
	}
	

}
