package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDeadLock implements Runnable {
	void hi() {}
	public static void main(String[] args) {
		ExecutorService e=Executors.newFixedThreadPool(2);
		ThreadDeadLock a= new ThreadDeadLock();
		ThreadDeadLock b= new ThreadDeadLock();
		ThreadDeadLock c= new ThreadDeadLock();
		try {
			e.execute(a.call());
		} catch (Exception e1) {
			
		}
		e.shutdown();
	}
	
	public Runnable call() throws Exception {
		Runnable a =new ThreadDeadLock();;
		// TODO Auto-generated method stub
		return a;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
