package valuetojsppack;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("value")
@SessionAttributes({"hello"})
public class ValueToJsp {
	
	@RequestMapping("/v1")
	public String value() {
		
		return "home";
		
	}
	
	@RequestMapping("/v2")
	public String value(HttpServletRequest request) {
		
		request.setAttribute("hello", "request Hello........");
		
		return "home";
		
	}
	
	@RequestMapping("/v3")
	public String value(Model m) {
		
		m.addAttribute("hello", "I am Model......");
		
		return "home";
		
	}
	
	@RequestMapping("/v4")
	public String value(Model m,HttpServletRequest request) {
		
		request.setAttribute("hello", "request Hello........");
		
		m.addAttribute("hello", "I am Model......");
		
		return "home";
		
	}
	
	@RequestMapping("/v5")
	public ModelAndView value1() {
		
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("hello", "How are you");
		
		mv.setViewName("home");
		
		return mv;
		
	}

}
