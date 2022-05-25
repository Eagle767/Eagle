package Day1;
<<<<<<< HEAD

public class AvarageNumber extends Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 b=new Test1();
		b.avg();
=======
import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class AvarageNumber extends Test1 {
	static Logger logger=Logger.getLogger(AvarageNumber.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);

		// TODO Auto-generated method stub
		Test1 b=new Test1();
		b.Avg();
>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
	}

}
