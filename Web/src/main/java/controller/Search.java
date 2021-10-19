package controller;

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
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    String format;
    String search;
    
    String data;
    String parameter;
    
    String name;
    String address="";
   
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.setHeader(, value);
		
		
		
		PrintWriter pw = response.getWriter();
		FilmDAO dao = new FilmDAO();
		Film film = new Film();
	//	FilmStore filmStore = new FilmStore();
	
		
		search = request.getParameter("search");
		format = request.getParameter("format");
		parameter = request.getParameter("parameter");
		
		
		
		if("id".equals(parameter)){
			
			int id = Integer.parseInt(search);
			film = dao.getFilmByID(id);
			
		}
		else if("name".equals(parameter)) {
			
			film = dao.getFilmByName(search);
			
		}
			
		
		if(format.equals("json")) {
			
			Gson gson = new Gson();
			data = gson.toJson(film);
			address = "json"; 
			request.setAttribute("json", data);
			response.setContentType("application/json");
			
				
			}
		else if(format.equals("xml")){
			
			request.setAttribute("film", film);	
			response.setContentType("application/xml");
			address = "xml";
			
//			filmStore.setFilm(film);
//		
//			try {
//				
//				JAXBContext context = JAXBContext.newInstance(FilmStore.class);
//		        Marshaller m = context.createMarshaller();
//		        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//
//		        // Print to
//		        m.marshal(filmStore, pw);
//		        // Write to File
//				
//			}
//			catch(Exception e){
//				System.out.print(e);
//			}
			
		}
		else if(format.equals("text")){
					
					response.setContentType("text/plain");
					request.setAttribute("film", film);
					address = "text";
					
				}
		
		
		
		StringWriter sw = new StringWriter();
	
		
		
		RequestDispatcher dispatcher =  request.getRequestDispatcher("jsp/"+ address + ".jsp");
		dispatcher.forward(request, response);
			
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
