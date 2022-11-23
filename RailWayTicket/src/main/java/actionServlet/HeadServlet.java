package actionServlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.do")
public class HeadServlet extends HttpServlet {
	
	Response r;
	
	@Override
	public void init(ServletConfig con) throws ServletException {
		
		r=new Response();
		
		String path=con.getServletContext().getRealPath("/WEB-INF/config.properties");
		
		con.getServletContext().setAttribute("path", path);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		r.process(request, response);
		
	}

}
