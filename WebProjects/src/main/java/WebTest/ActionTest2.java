package WebTest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class ActionTest2 extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		
		System.out.println("The Intialization is processing.........");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Service method is called............");
		
	}
	
    @Override
    public void destroy() {

    	System.out.println("The Obj is Deleted..........");

    }
	
}
