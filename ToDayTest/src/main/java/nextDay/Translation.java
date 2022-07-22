package nextDay;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Translation {
    public static void main(String[] args) {                
    	
		try {
	    BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("C://Users//muthukumar.m//Documents/thirukural.txt"), "utf-8"));
    	String line;
    	while ((line = in.readLine()) != null) {
    	    System.out.println(line);
    	}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    }
}