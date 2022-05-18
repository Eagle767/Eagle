package Day1;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class TypeCasting {
	static Logger logger=Logger.getLogger(TypeCasting.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		int a=500;
		logger.info(a);
		//byte b=a;   int convert to byte
		byte b=(byte)a;
		logger.info(b);
		//char c=a;    int convert to char 
		char c=(char)a;
		logger.info(c);
		//char d=b;  byte convert to char
		char d=(char)b;
		logger.info(d);
		b=(byte)d;  //char convert to byte
		logger.info(b);
		a=c;   //char convert to int
		logger.info(a);
	}

}
