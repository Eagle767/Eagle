package Access;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//https://fluvid.com/videos/detail/AZX-wTOO7ZIpg1kLD#.YnyNk-7Me0A.link
public class LuckyDraw {
	static Logger logger=Logger.getLogger(LuckyDraw.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		
	}
}