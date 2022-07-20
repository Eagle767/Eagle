package actionWork;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBaseConnection.DBCon;

public class Register extends HeadAbstract{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		DBCon con=new DBCon();
		
		boolean b=con.checkUser(request.getParameter("rname"), request.getParameter("rpass"));
		
		if(b==false) {
		
		boolean a=con.registerUser(request.getParameter("rname"), request.getParameter("rpass"));
		
		if(a==true) {
		
		return "rsuccess";
		
		}else {
			
			return "register";
			
		}
		
		}else {
			
			return "register";
			
		}
			
	}

}
