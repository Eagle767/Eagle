package chapter6to10;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PassByReferenceDemo {
	
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		MyBank sbi=new MyBank();
		
		Money myMoney=new Money();
		
		sbi.acceptMoney(myMoney);
		
		sbi.TransferMoney(10000, new Account());
	}
}
class MyBank{
	public void acceptMoney(Money m) {
		
	}
	
	public void TransferMoney(int amt, Account acct) {
		acct.credit(100);
		acct.debit(200);
	}
}
class Money{
	
}
class Account{
	static Logger logger=Logger.getLogger(PassByReferenceDemo.class);
	public void debit(int drid) {
		logger.info("debited...:"+drid);
	}
	public void credit(int crdid) {
		logger.info("credited...:"+crdid);
	}
	
}