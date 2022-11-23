package Remaining4_19072022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetFile {

	public static void main(String[] args) {
		
		URLConnection con;
		
		try {
			
			URL u=new URL(" http://www.google.com/index.html");
			
			con=u.openConnection();
			
			BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			FileWriter fw=new FileWriter("google.html");
			
			char c[]=new char[128];
			
			int a=0;
			
			while((a=br.read(c))!=-1) {
				
				fw.write(c, 0, a);
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}
