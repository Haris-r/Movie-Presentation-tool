package model;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlRootElement(namespace = "model")

public class FilmStore {
	
	  // XmLElementWrapper generates a wrapper element around XML representation
    @XmlElementWrapper(name = "films")
    // XmlElement sets the name of the entities
    @XmlElement(name = "film")
    private ArrayList<Film> films;
    
    Film film = new Film();
    
    public void setFilmList(ArrayList<Film> films){
        
    	this.films = films;
    }
    
   public void setFilm(Film film){
	   
	   this.film = film;
	   
   }
   
   public Film getFilm(){
	   return film;
   }

    public ArrayList<Film> getFilms(){
        return films;
   }

}
