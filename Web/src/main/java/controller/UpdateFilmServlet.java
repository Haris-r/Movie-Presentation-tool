package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FilmDAO;

/**
 * Servlet implementation class UpdateFilmServlet
 */
@WebServlet("/UpdateFilmServlet")
public class UpdateFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFilmServlet() {
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
		
			try {
	        	
	        	FilmDAO dao = new FilmDAO();
		
		String filmId = request.getParameter("uId");
		String filmName = request.getParameter("uTitle");
		String filmYear = request.getParameter("uYear");
		String filmDirector = request.getParameter("uDirector");
		String filmStars = request.getParameter("uStars");
		String filmReview = request.getParameter("uReview");
		
		int fId= Integer.parseInt(filmId);
		int fYear= Integer.parseInt(filmYear);
	
		dao.updateFilm(fId, filmName, fYear, filmDirector, filmStars, filmReview);
	
		PrintWriter out = response.getWriter(); 
	    out.println("Successfully Updated"); 
	        } 
	        catch (Exception e) { 
	            e.printStackTrace(); 
	        } 
		doGet(request, response);
	}
		
		
}
