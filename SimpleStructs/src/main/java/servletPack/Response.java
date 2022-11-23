package servletPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import work.Head;

public class Response {

	public void process(HttpServletRequest request,HttpServletResponse response) {
		
		String path=request.getServletContext().getAttribute("path").toString();
		
		String action=request.getParameter("action");
		
		Properties prop=new Properties();
		
		try {
			
			prop.load(new FileInputStream(path));
			
			String actionclass=prop.getProperty(action);
			
			Head h=(Head) Class.forName(actionclass).getConstructor().newInstance();
			
			String a=h.run(request, response);
			
			String b=prop.getProperty(a);
			
			RequestDispatcher rd=request.getRequestDispatcher(b);
			
			rd.forward(request, response);
		
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}
