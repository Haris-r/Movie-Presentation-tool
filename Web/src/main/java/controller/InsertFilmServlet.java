package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Film;
import model.FilmDAO;

/**
 * Servlet implementation class InsertFilmServlet
 */
@WebServlet("/InsertFilmServlet")
public class InsertFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertFilmServlet() {
        super();
        // TODO Auto-generated constructor stub
           
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		Film film = new Film();
		String format = request.getParameter("data-format");
		
		
	        try {
	        	
	        	FilmDAO dao = new FilmDAO();		
		
		String filmId = request.getParameter("fId1");
		String filmName = request.getParameter("fTitle1");
		String filmYear = request.getParameter("fYear1");
		String filmDirector = request.getParameter("fDirector1");
		String filmStars = request.getParameter("fStars1");
		String filmReview = request.getParameter("fReview1");
		
		int fId= Integer.parseInt(filmId);
		int fYear= Integer.parseInt(filmYear);
	
		dao.postCreateFilm(fId, filmName, fYear, filmDirector, filmStars, filmReview);
		
		PrintWriter out = response.getWriter(); 
        out.println("Successfully Inserted"); 
	        } 
	        catch (Exception e) { 
	            e.printStackTrace(); 
	        } 
		doGet(request, response);
	}

}
