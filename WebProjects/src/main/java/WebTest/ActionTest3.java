package WebTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@WebServlet("/action123")

public class ActionTest3 extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		
		System.out.println("The New Obj is Created............");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("uname");
		
		String pass=request.getParameter("upass");
		
		PrintWriter pw=response.getWriter();
		
		if(name.equals("raja") && pass.equals("raja")) {
			
			pw.println("<h1>Welcome Raja.........</h2>");
			
		}else{
			
			response.sendRedirect("error.html");
			
		}
		
		System.out.println("The Service Method is Called..............");
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("The Old Obj is Deleted...............");
		
	}

}
