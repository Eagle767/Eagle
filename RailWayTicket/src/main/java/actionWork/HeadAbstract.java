package actionWork;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class HeadAbstract {

	public HeadAbstract() {
		
	}
	
	public abstract String execute(HttpServletRequest request,HttpServletResponse response); 
	
}
