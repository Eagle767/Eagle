package test472022;

import java.net.URL;

import java.net.URLConnection;

public class Web472022 {
	
	public static void main(String[] args) throws Exception {
		
		URL url=new URL("http://localhost:8080/EagleWeb-5-7-2022/gd.do");
		
		URLConnection uc=url.openConnection();
		
		uc.getInputStream();
		
	}

}
