package role;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import dBConnect.DBConnect;

public class LogoutAction extends ServiceAction{
	
	@Override
	public String executeService(HttpServletRequest request, HttpServletResponse response) {
		
	    String name=request.getSession().getAttribute("cname").toString();
	    
		DBConnect con=new DBConnect();
		
		boolean a=con.updateFlag(name, 0);
		
		if(a) {
			
			return "Logout-Success";
			
		}else {
		
		return "Logout-Fail";
		
		}
		
	}

}
