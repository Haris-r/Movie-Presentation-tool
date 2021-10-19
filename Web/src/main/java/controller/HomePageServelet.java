package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.google.gson.Gson;

import model.Film;
import model.FilmDAO;
import model.FilmStore;

/**
 * Servlet implementation class HomePageServelet
 */
@WebServlet("/Home")
public class HomePageServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
       
	String format;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomePageServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		format = request.getParameter("data-format");
		//String allFilm =  request.getParameter("allFilms");
		
		// connect the database to get all films
		
		PrintWriter pw = response.getWriter();
		//Film films = new Film();
		FilmDAO dao = new FilmDAO();
		ArrayList<Film> allFilms = dao.getAllFilms();
		
		
		String data = "", address ="";
		
		
		FilmStore filmStore = new FilmStore();
		StringWriter sw = new StringWriter();

	
		
		
		
		if(format.equals("json")) {
			Gson gson = new Gson();
			data = gson.toJson(allFilms);
			// convert the arraylist to JSON
			address = "jsp/json.jsp"; 
			response.setContentType("application/json");
			request.setAttribute("json", data);
			RequestDispatcher dispatcher =  request.getRequestDispatcher(address);
			dispatcher.forward(request, response);
			
		}
		else if(format.equals("xml")) {
			
			
			 response.setContentType("text/xml");
			 filmStore.setFilmList(allFilms);
				try {
					
					JAXBContext context = JAXBContext.newInstance(FilmStore.class);
			        Marshaller m = context.createMarshaller();
			        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			        // Print to
			        m.marshal(filmStore, pw);

			        // Write to File
			      
				}
				catch(Exception e){
					System.out.print(e);
				}
				
				
				
		}
		else if(format.equals("text")){
			
			address = "jsp/text-all.jsp";
			response.setContentType("text/plain");
			request.setAttribute("film", allFilms);
			RequestDispatcher dispatcher =  request.getRequestDispatcher(address);
			dispatcher.forward(request, response);
			
			
		}
		
		
		//output to browser

		
	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		doGet(request, response);
	}

}
