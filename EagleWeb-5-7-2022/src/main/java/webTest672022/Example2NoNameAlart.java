package webTest672022;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Example2NoNameAlart")
public class Example2NoNameAlart extends HttpServlet {
	
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
		
		response.getWriter().println("Your Name is "+name);
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("The Old Obj is Deleted..............");
		
	}

}
