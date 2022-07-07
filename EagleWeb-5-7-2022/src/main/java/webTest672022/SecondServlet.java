package webTest672022;

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
		urlPatterns = "/SecondServlet",
		initParams = {
				@WebInitParam(name = "Root", value = "Fly in the Sky")
		}
		)
public class SecondServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig con) throws ServletException {
		
		System.out.println("The New Obj is Created............");
		
		String myDrive=con.getInitParameter("Root");
		
		System.out.println(myDrive);
		
		ServletContext app=con.getServletContext();
		
		app.setAttribute("Bird", "Fly");
		
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
