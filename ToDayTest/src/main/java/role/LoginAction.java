package role;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import LastTwo19072022.CheckUserNameandPassword;

public class LoginAction extends Action{

	@Override
	public String process(ServletRequest request, ServletResponse response) {
		
		CheckUserNameandPassword c=new CheckUserNameandPassword();
		
		boolean a=c.checkUser(request.getParameter("uname"),request.getParameter("upass"));
		
		if(a==true) {
			
			return "Success";
			
		}else {
		
		return "Fail";
		
		}
		
	}

}
