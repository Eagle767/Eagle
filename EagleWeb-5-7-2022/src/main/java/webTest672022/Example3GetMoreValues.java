package webTest672022;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Example3GetMoreValues")
public class Example3GetMoreValues extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		
		System.out.println("The New Obj is Created............");
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Service Method is Called.........");
		
		response.setContentType("text/html");
		
		Enumeration<String> e=request.getParameterNames();
		
		while(e.hasMoreElements()) {
			
			String name=e.nextElement();
			
			String value=request.getParameter(name);
			
			response.getWriter().println(name +":"+ value);
			
		}
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("The Old Obj is Deleted..............");
		
	}

}
