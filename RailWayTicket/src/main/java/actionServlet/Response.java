package actionServlet;

import java.io.FileInputStream;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import actionWork.HeadAbstract;

public class Response {
	
	public void process(HttpServletRequest request,HttpServletResponse response) {
		
		String path=request.getServletContext().getAttribute("path").toString();
		
		String action=request.getParameter("action");
		
		Properties prop=new Properties();
		
		try {
			
			prop.load(new FileInputStream(path));
			
			String actionclass=prop.getProperty(action);
			
			HeadAbstract ha=(HeadAbstract) Class.forName(actionclass).getConstructor().newInstance();
			
			String a=ha.execute(request, response);
			
			String b=prop.getProperty(a);
			
			RequestDispatcher rd=request.getRequestDispatcher(b);
			
			rd.forward(request, response);
			
		} catch (Exception e) {
		
			e.printStackTrace();
			
		}
		
	}

}
