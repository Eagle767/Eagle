package Remaining4_19072022;

import java.io.FileInputStream;

import java.util.Properties;

public class PropertiesRead {

	public static void main(String[] args) {
		
		String path="C:/Users/muthukumar.m/git/StructsProject/TaxiServiceProject/src/main/webapp/WEB-INF/config.properties";
		
		Properties prop=new Properties();
		
		String a="login";
		
		try {
			
			prop.load(new FileInputStream(path));
			
			System.out.println(prop.getProperty(a));
			
//			String path=request.getServletContext().getAttribute("path").toString();
//			
//			String action=request.getParameter("action");
//			
//			Properties p=new Properties();
//			
//			p.load(new FileInputStream(path));
//			
//			String a=p.getProperty(action);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}
