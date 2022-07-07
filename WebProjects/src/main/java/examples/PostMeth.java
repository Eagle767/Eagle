package examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/postmeth")
public class PostMeth extends HttpServlet {
	
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
		
		String name=request.getParameter("uname");
		
		PrintWriter pw=response.getWriter();
		
		pw.println("<html>");
		
		pw.println("<Head>");
		
		pw.println("<title>Hello World</title>");
		
		pw.println("</Head>");
		
		pw.println("<body>");
		
		pw.println("<h1>Hello "+name+"..........</h1>");
		
		pw.println("<h1>Hello <blink>"+name+"<blink>..........</h1>");
		
		pw.println("</body>");
		
		pw.println("</html>");
		
		System.out.println("The Serive is Ready..........");
		
	}
	
	@Override
		public void destroy() {
			
		System.out.println("The old Obj is Deleted.............");
		
		}

}
