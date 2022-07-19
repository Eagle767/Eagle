package servletPack;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dataBaseConnect.DBCon;

@WebServlet("*.do")
public class Action extends HttpServlet {
	
	ResponseWork rw;
	
	DBCon db;
	
	@Override
	public void init(ServletConfig con) throws ServletException {
		
		db=new DBCon();
		
		rw=new ResponseWork();
		
		String path=con.getServletContext().getRealPath("/WEB-INF/config.properties");
		
		con.getServletContext().setAttribute("path", path);
		
		System.out.println("started servelet......");
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		rw.process(response, request);
		
		HttpSession hs=request.getSession();
		
		Object o=hs.getAttribute("intertime");
		
		int a=(int) o;
		
		hs.setMaxInactiveInterval(a*60);
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("The Old is Deleted...............");
		
	}

}
