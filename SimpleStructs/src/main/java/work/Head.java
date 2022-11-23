package work;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Head {
	
	public Head() {
		
	}
	
	public abstract String run(HttpServletRequest request,HttpServletResponse response);

}
