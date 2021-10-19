/**
 * FilmDAO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package model;

public interface FilmDAO extends java.rmi.Remote {
    public model.Film[] getAllFilms() throws java.rmi.RemoteException;
    public model.Film getFilmByID(int id) throws java.rmi.RemoteException;
    public model.Film getFilmByName(java.lang.String name) throws java.rmi.RemoteException;
    public model.Film postCreateFilm(int id, java.lang.String title, int year, java.lang.String director, java.lang.String stars, java.lang.String review) throws java.rmi.RemoteException;
    public model.Film deleteFilmById(int id) throws java.rmi.RemoteException;
    public model.Film updateFilm(int id, java.lang.String title, int year, java.lang.String director, java.lang.String stars, java.lang.String review) throws java.rmi.RemoteException;
}
