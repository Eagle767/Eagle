package work;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Work1 extends HeadWork{

	@Override
	public String working(HttpServletResponse response, HttpServletRequest request) {
		
		return "success";
		
		//return "error";
		
	}

}
