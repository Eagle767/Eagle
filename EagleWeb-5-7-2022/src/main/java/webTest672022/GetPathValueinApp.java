package webTest672022;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetPathValueinApp")
public class GetPathValueinApp extends HttpServlet {
	
	@Override
	public void init(ServletConfig con) throws ServletException {
		
		System.out.println("The New Obj is Created............");
		
		ServletContext app=con.getServletContext();
		
		System.out.println("The Second Servlet Attribute is......:"+app.getAttribute("Bird"));
		
		System.out.println(app.getRealPath(""));
		
		try {
		
		String path=app.getRealPath("/META-INF/bird.properties");
		
		Properties p=new Properties();
		
		p.load(new FileInputStream(path));
		
		System.out.println(p.get("Bird"));
		
		}catch(Exception e) {
			
			System.out.println(e);
			
		}
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Service Method is Called.........");
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("The Old Obj is Deleted..............");
		
	}

}
