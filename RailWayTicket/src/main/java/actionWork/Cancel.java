package actionWork;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBaseConnection.DBCon;

public class Cancel extends HeadAbstract{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		DBCon d=new DBCon();
		
		boolean a=d.checkUser(request.getParameter("uname"), request.getParameter("upass"));
		
		if(a==true) {
			
			boolean b=d.cancelTicket(request.getParameter("uname"), Integer.parseInt(request.getParameter("tno")));
			
			if(b==true) {
				
				String e=d.findTrain(Integer.parseInt(request.getParameter("tno")), request.getParameter("uname"));
				
				d.cancelupdateTicket(Integer.parseInt(request.getParameter("tno")));
				
				int c=d.checkavaiTicketNo(e)+1;
				
				d.availableupdateTicket(c, e);
			
			return "csuccess";
			
			}else {
				
				return "cfail";
				
			}
			
		}else {
		
		return "cfail";
		
		}
		
	}

}
