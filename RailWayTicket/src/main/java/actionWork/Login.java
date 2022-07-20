package actionWork;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBaseConnection.DBCon;

public class Login extends HeadAbstract{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		DBCon con=new DBCon();
		
		boolean b=con.checkUser(request.getParameter("uname"), request.getParameter("upass"));
		
		if(b) {
			
			return "book";
			
		}else {
		
		return "register";
		
		}
		
	}

}
