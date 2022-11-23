package WebTest;

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

@WebServlet("/ActionTest8")
public class ActionTest8 extends HttpServlet {
	
	@Override
	public void init(ServletConfig con) throws ServletException {
		
		ServletContext app=con.getServletContext();
		
		System.out.println("New Obj Created............");
		
		System.out.println("The Action7Test value....."+app.getAttribute("World"));
		
		try {
			
			String path=app.getRealPath("/META-INF/config.properties");
			
			Properties p=new Properties();
			
			p.load(new FileInputStream(path));
			
			System.out.println(p.get("Name"));
			
		} catch (Exception e) {
			
			System.out.println(e);
		
		}
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Service Started.............");
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("Old obj deleted.............");
		
	}

}
