package ioPack;

import java.io.File;

import java.io.FileInputStream;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class ByteIODemo {

	static Logger logger=Logger.getLogger(ByteIODemo.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.info("Start.............");
		
		try {
			
			try (FileInputStream fi = new FileInputStream("C:\\Users\\muthukumar.m\\Desktop\\Muthu.txt")) {
				
				logger.debug(fi.available());
				
				logger.debug((char)fi.read());
				
				logger.debug((char)fi.read());
				
				logger.debug((char)fi.read());
				
				logger.debug((char)fi.read());
				
			}
			
		}catch(Exception e) {logger.error(e);}
		
		try {
			
			try (FileInputStream fl = new FileInputStream("C:\\Users\\muthukumar.m\\Desktop\\Muthu.txt")) {
				
				int av=fl.available();
				
				byte[] b=new byte[av];
				
				fl.read(b);
				
				String s=new String(b, 0,av);
				
				logger.debug(s);
				
			}
			
		}catch(Exception e) {logger.error(e);}
		
		try {
			
			try (FileInputStream fs = new FileInputStream("C:\\Users\\muthukumar.m\\Desktop\\Muthu.txt")) {
				
				byte[] c=new byte[4];
				
				int no=0;
				
				while((no=fs.read(c))!=-1) {
					
					logger.warn(no);
					
					String ss=new String(c,0,no);
					
					logger.debug(ss);
					
				}
				
			}
			
		}catch(Exception e) {logger.error(e);}
		
		logger.info("End................");
		
	}
	
}
