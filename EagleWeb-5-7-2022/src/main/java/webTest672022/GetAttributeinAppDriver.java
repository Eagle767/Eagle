package webTest672022;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetAttributeinAppDriver")
public class GetAttributeinAppDriver extends HttpServlet {
	
	@Override
	public void init(ServletConfig con) throws ServletException {
		
		System.out.println("The New Obj is Created............");
		
		ServletContext app=con.getServletContext();
		
		System.out.println("The Second Servelet Attribute is......:"+app.getAttribute("Bird"));
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Service Method is Called.........");
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("The Old Obj is Deleted..............");
		
	}

}
