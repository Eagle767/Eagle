package servletPack;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dataPack.Data;

@WebServlet("*.do")
public class Action extends HttpServlet {
	
	ResponseWork rw;
	
	Data d;
	
	@Override
	public void init(ServletConfig con) throws ServletException {
		
		rw=new ResponseWork();
		
		d=new Data();
		
		String path=con.getServletContext().getRealPath("/WEB-INF/config.properties");
		
		con.getServletContext().setAttribute("path", path);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		rw.process(response, request);
		
		HttpSession hs=request.getSession();
		
		hs.setMaxInactiveInterval(d.getIntertime()*60);
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("The Old is Deleted...............");
		
	}

}
