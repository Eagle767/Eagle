package examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/enmeth")
public class EnumarationMeth extends HttpServlet {
	
	@Override
		public void init() throws ServletException {
		
		System.out.println("The Obj is Created..................");
		
		}
	
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		doPost(req, resp);
		
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		Enumeration<String> enuma=request.getParameterNames();
		
		PrintWriter pw=response.getWriter();
		
		while (enuma.hasMoreElements()) {
			
			String hname=(String) enuma.nextElement();
			
			String name=request.getParameter(hname);
			
			pw.println(hname +":"+ name);
			
		}
		
		pw.close();
		
		System.out.println("The Serive is Ready..........");
		
	}
	
	@Override
		public void destroy() {
			
		System.out.println("The old Obj is Deleted.............");
		
		}

}
