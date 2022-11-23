package WebTest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionTest1")
public class SessionTest1 extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		
		System.out.println("The New Obj is Created............");
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Service Method is Called.........");
		
		int count=1;
		
		HttpSession session=request.getSession();
		
		Object obj=session.getAttribute("Counter");
		
		if(obj==null) {
			
			System.out.println("You enter the site in First Time..........");
			
			session.setAttribute("Counter", ++count);
			
		}else {
			
			int c=Integer.parseInt(obj.toString());
			
			System.out.println("You enter the site in "+c+" time..........");
			
			session.setAttribute("Counter", ++c);
			
		}
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("The Old Obj is Deleted..............");
		
	}

}
