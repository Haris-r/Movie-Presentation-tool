package model;

public class FilmDAOProxy implements model.FilmDAO {
  private String _endpoint = null;
  private model.FilmDAO filmDAO = null;
  
  public FilmDAOProxy() {
    _initFilmDAOProxy();
  }
  
  public FilmDAOProxy(String endpoint) {
    _endpoint = endpoint;
    _initFilmDAOProxy();
  }
  
  private void _initFilmDAOProxy() {
    try {
      filmDAO = (new model.FilmDAOServiceLocator()).getFilmDAO();
      if (filmDAO != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)filmDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)filmDAO)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (filmDAO != null)
      ((javax.xml.rpc.Stub)filmDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public model.FilmDAO getFilmDAO() {
    if (filmDAO == null)
      _initFilmDAOProxy();
    return filmDAO;
  }
  
  public model.Film[] getAllFilms() throws java.rmi.RemoteException{
    if (filmDAO == null)
      _initFilmDAOProxy();
    return filmDAO.getAllFilms();
  }
  
  public model.Film getFilmByID(int id) throws java.rmi.RemoteException{
    if (filmDAO == null)
      _initFilmDAOProxy();
    return filmDAO.getFilmByID(id);
  }
  
  public model.Film getFilmByName(java.lang.String name) throws java.rmi.RemoteException{
    if (filmDAO == null)
      _initFilmDAOProxy();
    return filmDAO.getFilmByName(name);
  }
  
  public model.Film postCreateFilm(int id, java.lang.String title, int year, java.lang.String director, java.lang.String stars, java.lang.String review) throws java.rmi.RemoteException{
    if (filmDAO == null)
      _initFilmDAOProxy();
    return filmDAO.postCreateFilm(id, title, year, director, stars, review);
  }
  
  public model.Film deleteFilmById(int id) throws java.rmi.RemoteException{
    if (filmDAO == null)
      _initFilmDAOProxy();
    return filmDAO.deleteFilmById(id);
  }
  
  public model.Film updateFilm(int id, java.lang.String title, int year, java.lang.String director, java.lang.String stars, java.lang.String review) throws java.rmi.RemoteException{
    if (filmDAO == null)
      _initFilmDAOProxy();
    return filmDAO.updateFilm(id, title, year, director, stars, review);
  }
  
  
}