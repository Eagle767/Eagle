package WebTest;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns = "/Action7Test",
		initParams = {
				@WebInitParam(name = "Driver25",value = "Hoe is it")
		}
		)
public class Action7Test extends HttpServlet {
	
	@Override
	public void init(ServletConfig con) throws ServletException {
		
		System.out.println("New Obj Created............");
		
		String myDriver=con.getInitParameter("Driver25");
		
		System.out.println(myDriver);
		
		System.out.println(con.getInitParameter("Driver25"));
		
		ServletContext app=con.getServletContext();
		
		app.setAttribute("World", "air");
		
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
