package Test1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class InterfaceDem {
	static Logger logger=Logger.getLogger(InterfaceDem.class);
	//https://fluvid.com/videos/detail/P5OY2Tn-2yIPnwpZK#.YpXyUYVSMGg.link
		public static void main(String[] args) {
String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
			
			PropertyConfigurator.configure(log4jConfigFile);
		SevaiMaiyam sevai=new SevaiMaiyam();
		sevai.executeCommand(1);
		
		Corporation corporation=new Corporation();
		Health health=new Health();
		Police police=new Police();
		
		Command deathCommand=new DeathCertificateCommand(corporation,health,police);
		
		sevai.setCommand(deathCommand, 4);
		
		sevai.executeCommand(4);
	}
	}
	final class Health{
		static Logger logger=Logger.getLogger(Health.class);
		public void doPostMortem() {
			logger.info("post mortem done...");
		}
	}
	final class Police{
		static Logger logger=Logger.getLogger(Police.class);
		public void doInvestigation() {
			logger.info("police investigation done...");
		}
	}
	final class Corporation{
		static Logger logger=Logger.getLogger(Corporation.class);
		public void deathCertificate() {
			logger.info("death certificate given...");
		}
	}
	class SevaiMaiyam{
		Command[] command=new Command[5];
		DummyCommand[] s=new DummyCommand[3];
		public SevaiMaiyam() {
			for(int i=0;i<command.length;i++) {
				command[i]=new DummyCommand();
			}
		}
		public void setCommand(Command command, int slot) {
			this.command[slot]=command;
		}
		public void executeCommand(int slot) {
			command[slot].execute();
		}
	}
	interface Command{
		public void execute();
	}
	class DummyCommand implements Command{
		static Logger logger=Logger.getLogger(DummyCommand.class);
		public void execute() {
			logger.info("I am dummy I am yet to be operational...");
		}
	}
	class DeathCertificateCommand implements Command{
		static Logger logger=Logger.getLogger(DeathCertificateCommand.class);
		Corporation corporation;
		Health health;
		Police police;
		
		public DeathCertificateCommand() {
		}
		public DeathCertificateCommand(Corporation corporation,Health health,Police police) {
			
			this.corporation=corporation;
			this.health=health;
			this.police=police;
		}
		@Override
		public void execute() {
			logger.info("death certificate process started...");
			health.doPostMortem();
			police.doInvestigation();
			corporation.deathCertificate();
			logger.info("Take the death certificate....");		
		}
}
