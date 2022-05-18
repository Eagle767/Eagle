package Day1;
//import Day1.test;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
class Test{
	static Logger logger=Logger.getLogger(Test.class);
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
	//logger.info(i);
	System.out.println(i);
	System.out.println(j);
	System.out.println(k);
	System.out.println(l);
	System.out.println(m);
	System.out.println(n);
	System.out.println(o);
	System.out.println(p);
	System.out.println(b);
	/*logger.info(i);
	logger.info(i);
	logger.info(i);
	logger.info(i);
	logger.info(i);*/
		}}