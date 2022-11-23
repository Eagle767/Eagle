package labWork2;

import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

		public class DefaultValues {
			static Logger logger=Logger.getLogger(DefaultValues.class);
		    static int i;
		    static byte j;
		    static short k;
		    static long l;
		    static float o;
		    static double p;
		    static char m;
		    static String n;
		    static boolean b;
		    public static void main(String[] args) {
				//String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4jConfigFile";
				//PropertyConfigurator.configure(log4jConfigFile);
				String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
				PropertyConfigurator.configure(log4jConfigFile);
			//logger.info(i);
				logger.info(i);
				logger.info(j);
				logger.info(k);
				logger.info(l);
				logger.info(m);
				logger.info(n);
				logger.info(o);
				logger.info(p);
				logger.info(b);

	}
}
