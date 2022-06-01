package Test1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class InterFaceeDemo {
	static Logger logger=Logger.getLogger(InterFaceeDemo.class);
	//https://fluvid.com/videos/detail/L-Bg1Trvz_Uv3p_76#.Ypb9DwXSoxI.link
		public static void main(String[] args) {
			String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
			
			PropertyConfigurator.configure(log4jConfigFile);
			//1. Anonymous 2. Method Referencing 3. Lambda 4. Muthur teacher
			
			//1. Anonymous inner class implementation
			new FInterOne() {			
				@Override
				public void met() {
					logger.info("anonymous inner class met called..");				
				}
			}.met();
			
			//Method Referencing...
			FInterOne one=InterFaceeDemo::mymethod;
			one.met();
			
			//Lambda
			FInterOne oneLambda=()->{logger.info("logic in lambda called...");};
			
			oneLambda.met();
			
			//muthu teacher style
			FInterOne oneMuthu=new MyFInterOneImpl();
			oneMuthu.met();
			
			//PART 2
			//Anonymous
			int value=new FInterTwo() {
				
				@Override
				public int met() {
					// TODO Auto-generated method stub
					return 100;
				}
			}.met();
			logger.info("Value of first inter...anonymous.:"+value);
			
			//Method referencing
			FInterTwo two=new InterFaceeDemo()::mymethod2;
			value=two.met();
			logger.info("Value of first inter-method ref..:"+value);
			
			FInterTwo twoLambda=()->{return 1000;};
			value=twoLambda.met();
			logger.info("Value of first inter ---lambda :"+value);
			
			//Muthu style
			FInterTwo twoMuthu=new MyFInterTwoImpl();
			value=twoMuthu.met();
			logger.info("value of first inter...muthu..:"+value);
			
			//PART 3
			//Anonymous
			String val=new FInterThree() {			
				@Override
				public String met(int i, String s) {
					// TODO Auto-generated method stub
					return i+":"+s;
				}
			}.met(10, "anonymous");
			logger.info("Value....:"+val);
			
			//Method Referencing
			FInterThree three=new InterFaceeDemo()::mymethod3;
			val=three.met(1000, "method ref");
			logger.info("value...:"+val);
			//Lambda
			FInterThree threeLambda=(int num,String str)->{return num+":"+str;};
			val=threeLambda.met(101010, "lambda world");
			logger.info("value..:"+val);
			
			//PART 4
			//Anonymous
			MyAccount myaccount=new MyAccount();
			myaccount.balance=1000;
			MyAccount my=new FInterFour() {
				
				@Override
				public MyAccount transfer(MyAccount act, int amt) {
					// TODO Auto-generated method stub
					act.balance=(act.balance-amt);
					return act;
				}
			}.transfer(myaccount,500);
			logger.info("Balance..:"+my.balance);
			
			//Method Referencing
			FInterFour four=new InterFaceeDemo()::mymethod4;
			MyAccount ac=four.transfer(myaccount, 100);
			logger.info("Method ref...:"+ac.balance);
			
			//Lambda
			FInterFour fourLambda=(myc,amt)->{
				myc.balance=(myc.balance-amt);
				return myc;
			};
			ac=fourLambda.transfer(myaccount, 200);
			logger.info("value..lambda..:"+ac.balance);
			
		}
		public static void mymethod() {
			logger.info("my method called...");
		}
		public int mymethod2() {
			return 1000;
		}
		public String mymethod3(int i,String s) {
			return i+":"+s;
		}
		public MyAccount mymethod4(MyAccount act,int amt) {
			act.balance=(act.balance-amt);
			return act;
		}
	}
	class MyFInterOneImpl implements FInterOne{
		static Logger logger=Logger.getLogger(MyFInterOneImpl.class);
		@Override
		public void met() {
			logger.info("met normal old implementation called...");
		}
	}
	class MyFInterTwoImpl implements FInterTwo{
		@Override
		public int met() {
			return 10000;
		}
	}
	//Functional interfaces - Interface with only one method
	interface FInterOne{
		public void met();
	}
	interface FInterTwo{
		public int met();
	}
	interface FInterThree{
		public String met(int i,String s);
	}
	interface FInterFour{
		public MyAccount transfer(MyAccount act,int amt);
	}
	class MyAccount {
		int balance;
	}