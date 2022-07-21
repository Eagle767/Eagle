package Remaining4_19072022;

import java.io.FileInputStream;

import java.util.Properties;

public class PropertiesRead {

	public static void main(String[] args) {
		
		String path="C:\\Users\\muthukumar.m\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\TaxiServiceProject\\WEB-INF\\config.properties";
		
		Properties prop=new Properties();
		
		String a="success";
		
		try {
			
			prop.load(new FileInputStream(path));
			
			System.out.println(prop.getProperty(a));
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}
