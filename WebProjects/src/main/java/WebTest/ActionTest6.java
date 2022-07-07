package WebTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns = "/act64",
		initParams = {
				@WebInitParam(name="Driver1",value="HelloWorld"),
				@WebInitParam(name="Driver2",value="WhoAreYou"),
				@WebInitParam(name="Driver3",value="WhoAreYou2")
		}
		)
public class ActionTest6 extends HttpServlet {
	
	@Override
	public void init(ServletConfig seti) throws ServletException {
		
		String myDriver=seti.getInitParameter("Driver1");
		
		System.out.println(myDriver);
		
		System.out.println(seti.getInitParameter("Driver3"));
		
		System.out.println("The New Obj is Ready.........");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	       String name=request.getParameter("uname");
			
			String pass=request.getParameter("upass");
			
			PrintWriter pw=response.getWriter();
			
			if(name.equals("raju")){
				
				pw.println("<h1>Welcome Raja........</h2>");
				
			}else{
				
	            RequestDispatcher rd=request.getRequestDispatcher("error.html");
				
				rd.forward(request, response);
				
			}
		
		System.out.println("Service is Ready.............");
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("The Old Obj is Deleted..........");
		
	}

}
