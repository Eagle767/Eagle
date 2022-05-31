package Test1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class InheriDemo {
	//https://fluvid.com/videos/detail/dagdEhZG2qF8L_X6q#.YpWcHmK03-4.link
		public static void main(String[] args) {
			String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
			
			PropertyConfigurator.configure(log4jConfigFile);
//			ShakthiPlug indianPlug=new ShakthiPlug();
			AmericanPlug americanPlug=new LenovoPlug();
			
			ShakthiSocket indianSocket=new ShakthiSocket();
			IndianAdapter adapter=new IndianAdapter(americanPlug);
			indianSocket.roundPinHole(adapter);
		}
	}
	abstract class IndianPlug{
		static Logger logger=Logger.getLogger(Dominos.class);
		public abstract void roundPin();
	}
	abstract class IndianSocket{
		public abstract void roundPinHole(IndianPlug ip);
	}
	abstract class AmericanPlug{
		static Logger logger=Logger.getLogger(Dominos.class);
		public abstract void slabPin();
	}
	abstract class AmericanSocket{
		public abstract void slabPinHole(AmericanPlug ap);
	}
	class ShakthiPlug extends IndianPlug{
		@Override
		public void roundPin() {
			logger.info("shakthi plug working....");
		}
	}
	class ShakthiSocket extends IndianSocket{
		@Override
		public void roundPinHole(IndianPlug ip) {
			ip.roundPin();
		}
	}
	class IndianAdapter extends IndianPlug{
		AmericanPlug ap;
		public IndianAdapter() {
			// TODO Auto-generated constructor stub
		}
		public IndianAdapter(AmericanPlug ap) {
			this.ap=ap;
		}
		@Override
		public void roundPin() {
			ap.slabPin();
		}
	}
	class LenovoPlug extends AmericanPlug{
		
		@Override
		public void slabPin() {
			logger.info("american slab pin plug working....");
		}
	}