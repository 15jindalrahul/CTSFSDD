                                     //  servlet file  to be made after pojo class is made

    

package servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ListLeagueService extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private List<League> lt=null; 
    

	@Override
	public void init() throws ServletException {
		lt=new ArrayList<League>();
		super.init();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		processRequest(request, response);
		
		
		
	}
	
	
protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	response.setContentType("text/html");
	
	PrintWriter Out=response.getWriter();
	
	lt.add(new League(UUID.randomUUID().toString(),"abc","2020","autumn"));
	lt.add(new League(UUID.randomUUID().toString(),"DEF","2021","sUMMER"));
	lt.add(new League(UUID.randomUUID().toString(),"GHI","2022","autumn"));
	lt.add(new League(UUID.randomUUID().toString(),"JKL","2023","autumn"));
	
	Out.println("<html><head><title> add league </title></head><body>");
	Out.println(" <table border=1><tr><td> league id</td><td> league Name</td> <td> leagueYear</td><td> leagueSession</td>");
	
		
		lt.forEach(l->
		{
			Out.println("<tr><td>"+l.getLeagueId()+"</td><td>"+l.getLeagueName()
			+"</td><td>"+l.getLeagueId()+"</td><td>"+l.getLeagueYear()+"</td></tr>");
		
		
	});
		Out.println("</table></body></html>");

}
}
