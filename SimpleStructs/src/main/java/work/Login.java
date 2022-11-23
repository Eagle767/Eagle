package work;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datapack.Data;
import dbconpack.DBcon;

public class Login extends Head{

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		
		DBcon con=new DBcon();
		
		Data d=new Data();
		
		String a=request.getParameter("uname");
		
		d.setUname(a);
		
		String b=request.getParameter("upass");
		
		d.setUpass(b);
		
		boolean c=con.checkUser(d.getUname(), d.getUpass());
		
		if(c==true) {
			
			return "success";
			
		}else {
			
			return "fail";
			
		}
		
	}

}
