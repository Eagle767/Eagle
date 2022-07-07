package WebTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/act")
public class ActionTest4 extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		
		System.out.println("The Obj is Ready.............");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("uname");
		
		String pass=request.getParameter("upass");
		
		PrintWriter pw=response.getWriter();
		
		if(name.equals("raju")){
			
			pw.println("<h1>Welcome Raja.........</h2>");
			
		}else{
			
            RequestDispatcher rd=request.getRequestDispatcher("error.html");
			
			rd.forward(request, response);
			
		}
		
		System.out.println("The Service is Ready..............");
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("old obj deleted...........");
		
	}

}
