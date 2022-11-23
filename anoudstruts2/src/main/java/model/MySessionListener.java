package model;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
public class MySessionListener implements HttpSessionListener {

    
    public void sessionCreated(HttpSessionEvent arg0)  { 
       System.out.println("session created.....");
       HttpSession session=arg0.getSession();
       session.setAttribute("name", "somu");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
       System.out.println("session destroyed...");
       HttpSession session=arg0.getSession();
       Object name=session.getAttribute("myname");
       if(name!=null) {
    	   String n=name.toString();
    	   System.out.println("The session value is...:"+name);
       }
       
       
    }
	
}
