package servletPack;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import dataBaseConnect.DBCon;

@WebListener
public class SessionDestroyer implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se)  { 
    	
         System.out.println("Session is Created...........");
         
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	
    	DBCon con=new DBCon();
    	
    	HttpSession hs=se.getSession();
    	
    	Object o=hs.getAttribute("customerid");
    	
    	if(o!=null) {
    		
    		String customerid=o.toString();
    		
    		String taxiname=con.findCustomerTaxi(customerid);
    		
    		con.updateFlag(taxiname,0);
    		
    	}

    	System.out.println("session is deleted..........");
    	
    }
	
}
