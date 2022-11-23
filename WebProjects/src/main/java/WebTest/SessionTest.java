package WebTest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionTest")
public class SessionTest extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		
		System.out.println("The New Obj is Created............");
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Service Method is Called.........");
		
        HttpSession session1=request.getSession(false);
		
		System.out.println(session1);
		
		HttpSession session2=request.getSession();
		
		System.out.println(session2);
		
        HttpSession session3=request.getSession(false);
		
		System.out.println(session3);
		
		HttpSession session4=request.getSession(true);
		
		System.out.println(session4);
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("The Old Obj is Deleted..............");
		
	}

}
