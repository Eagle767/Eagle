package Day1;
import Day1.Test;
import java.io.File;
import org.apache.log4j.Logger;
//import org.apache.log4j.Day1.test;
import org.apache.log4j.PropertyConfigurator;
/*class test{
	static Logger logger=Logger.getLogger(test.class);
    int i;
	byte j;
	short k;
	long l;
	float o;
	double p;
	char m;
	String n;
	boolean b;
	public void print() {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4jConfigFile";
		PropertyConfigurator.configure(log4jConfigFile);
	logger.info(i);
	System.out.println(i);
	/*logger.info(i);
	logger.info(i);
	logger.info(i);
	logger.info(i);
	logger.info(i);
		}}*/
		public class DefaultValues extends Test{
			static Logger logger=Logger.getLogger(Test.class);
		public static void main(String[] args) {
			String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4jConfigFile";
			PropertyConfigurator.configure(log4jConfigFile);
			Test a=new Test();
			a.print();
	}
}
