package actionWork;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBaseConnection.DBCon;

public class BookTicket extends HeadAbstract{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		DBCon con=new DBCon();
		
		boolean f=con.checkUser(request.getParameter("uname"), request.getParameter("upass"));
		
		if(f==true) {
		
	    int a=con.bookTickets(request.getParameter("tname"));
	    
	    if(a!=0) {
			
			int c=con.checkavaiTicketNo(request.getParameter("tname"))-1;
	    	
	    	con.updateTicket(request.getParameter("uname"), request.getParameter("upass"), request.getParameter("pname"), Integer.parseInt(request.getParameter("age")), a, request.getParameter("tname"));
	    	
	    	con.availableupdateTicket(c, request.getParameter("tname"));
	    	
	    	return "success";
	    	
	    }else {
	    	
	    	return "Fail";
	    	
	    }
	    
		}else {
			
			return "book";
			
		}
		
	}

}
