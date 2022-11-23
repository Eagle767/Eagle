package sessionpack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sess")
public class SessionCheck {
	
	@RequestMapping("/req")
	public void req(HttpServletRequest request) {
		
		System.out.println("the req is : "+request);
		
		HttpSession hs=request.getSession();
		
		hs.setAttribute("abc", "Find out");
		
		System.out.println("the session is : "+hs.getId());
		
		String s=hs.getAttribute("abc").toString();
		
		System.out.println("The abc value is : "+s);
		
	}
	
	@RequestMapping("/req1")
	public void req(HttpSession hs) {
		
		System.out.println("the session is : "+hs.getId());
		
		String s=hs.getAttribute("abc").toString();
		
		System.out.println("The abc value is : "+s);
		
	}

}
