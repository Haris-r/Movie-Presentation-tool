package model;

import java.util.Collection;

public interface FilmInfo {
	 public void postCreateFilm (int id, String title, int year, String director, String stars, String review);
	 public void updateFilm (int id, String title, int year, String director, String stars, String review);
	 public void deleteFilmById(int id);
	 public Film getFilmByName(String name);
	 public Collection getAllFilms();
	}
