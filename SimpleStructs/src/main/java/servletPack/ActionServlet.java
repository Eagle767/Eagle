package servletPack;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class ActionServlet extends HttpServlet {
	
	Response r;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		r=new Response();
		
		String path=config.getServletContext().getRealPath("/WEB-INF/config.properties");
		
		config.getServletContext().setAttribute("path", path);
		
		System.out.println(path);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		r.process(request, response);
		
	}
	
	@Override
	public void destroy() {
		
	}

}
