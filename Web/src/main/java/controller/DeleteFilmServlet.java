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
 * Servlet implementation class DeleteFilmServlet
 */
@WebServlet("/DeleteFilmServlet")
public class DeleteFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFilmServlet() {
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
        	
        	String delete = request.getParameter("deleteFilm");
        	
        	int deleteId = Integer.parseInt(delete);
        	
        	dao.deleteFilmById(deleteId);
        			
		PrintWriter out = response.getWriter(); 
        out.println("Successfully Deleted"); 
	        } 
	        catch (Exception e) { 
	            e.printStackTrace(); 
	        } 
	        
	        
		doGet(request, response);
	}

}
