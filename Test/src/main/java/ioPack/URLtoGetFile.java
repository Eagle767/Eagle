package ioPack;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class URLtoGetFile {

	static Logger logger=Logger.getLogger(URLtoGetFile.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start............");
		
		
		
		try {
			
			URL u=new URL("https://www.javatpoint.com/java-util-calendar#:~:text=Java%20Calendar%20Class%20Example.%201%20import%20java.util.Calendar%3B%202,%2B%20calendar.getTime%20%28%29%29%3B%2010%20calendar.add%20%28Calendar.YEAR%2C%202%29%3B%20");
			
			URLConnection uc=u.openConnection();
			
			BufferedInputStream bi=new BufferedInputStream(uc.getInputStream());
			
			FileOutputStream os=new FileOutputStream("GetJavapoint.html");
			
			int no=0;
			
		   byte[] b=new byte[128];
		   
		   while((no=bi.read(b))!=-1) {
			   
			   os.write(b,0,no);
			   
		   }
			
		} catch (Exception e) {e.printStackTrace();}
		
		logger.warn("End..............");
		
	}
	
}
