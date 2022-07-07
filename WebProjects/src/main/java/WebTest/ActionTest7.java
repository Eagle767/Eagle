package WebTest;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ActionTest7")
public class ActionTest7 extends HttpServlet {
	
	@Override
	public void init(ServletConfig con) throws ServletException {
		
		ServletContext scon=con.getServletContext();
		
		System.out.println("New Obj Created............");
		
		System.out.println("The Action7Test value....."+scon.getAttribute("World"));
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Service Started.............");
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("Old obj deleted.............");
		
	}

}
