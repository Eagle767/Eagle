package com.example.demo;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@WebListener
public class SessionDestroyerListener implements HttpSessionListener {
	
	@Autowired
	private ServiceTest st;

    public ServiceTest getSt() {
		return st;
	}

	public void setSt(ServiceTest st) {
		this.st = st;
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		
        System.out.println("session ready.........");
		
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		
    	HttpSession hs=se.getSession();
    	
    	Object obj=hs.getAttribute("name");
    	
    	Object obj1=hs.getAttribute("pass");
    	
    	if(obj!=null && obj1!=null) {
    		
    		String name=obj.toString(),pass=obj1.toString();
    		
    		getSt().updateFlag(0, name, pass);
    	
    	}
    	
         System.out.println("session ended........");
		
	}
	
}
