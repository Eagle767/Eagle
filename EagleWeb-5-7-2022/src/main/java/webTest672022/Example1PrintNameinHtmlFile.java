package webTest672022;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Example1PrintNameinHtmlFile")
public class Example1PrintNameinHtmlFile extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		
		System.out.println("The New Obj is Created............");
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Service Method is Called.........");
		
		String name=request.getParameter("name");
		
		PrintWriter pw=response.getWriter();
		
		pw.println("<html><head><title>HEllo World</title></head><body><h1>Your name is "+name+"</h1><body></html>");
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("The Old Obj is Deleted..............");
		
	}

}
