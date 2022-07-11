package listen;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import dBConnect.DBConnect;

@WebListener
public class SessionDestroyer implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se)  { 
    	
        System.out.println("session ready.........");
        
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	
    	DBConnect db=new DBConnect();
    	
    	HttpSession hs=se.getSession();
    	
    	Object obj=hs.getAttribute("cname");
    	
    	if(obj!=null) {
    		
    		String name=obj.toString();
    	
    	db.updateFlag(name, 0);
    	
    	}
    	
         System.out.println("session ended.......");
         
    }
	
}
