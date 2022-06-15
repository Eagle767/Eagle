package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demon extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("It is Demon......");
		}
		else {
			System.out.println("It is not Demon..........");
		}
	}
	public static void main(String[] args) {
		ExecutorService e=Executors.newFixedThreadPool(1);
		Thread a=new Thread();
		//Thread aa=new Thread();
		//Thread aaa=new Thread();
		Demon c=new Demon();
		Demon d=new Demon();
		//a.start();
		c.setDaemon(true);
		c.start();
		d.start();
		//c.Hello();
		//c.Hello();
		//aa.start();
		//aa.isDaemon();
		//c.Hello();
       // aaa.start();	
	//	e.shutdown();
	}
}
