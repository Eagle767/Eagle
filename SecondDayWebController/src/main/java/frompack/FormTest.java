package frompack;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form")
public class FormTest {
	
	@RequestMapping(method = RequestMethod.GET, value = "/forms")
	public ModelAndView websearch() {
		
		ModelAndView mv=new ModelAndView();
		
		Data d=new Data();
		
		mv.addObject("user", d);
		
		mv.setViewName("form");
		
		return mv;
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/forms")
	public ModelAndView welcome(@Valid@ModelAttribute("user") Data d, BindingResult rs) {
		
		ModelAndView mv=new ModelAndView();
		
		if(rs.hasErrors()) {
			
			mv.setViewName("form");
			
			return mv;
			
		}else {
		
		System.out.println(d.getName());
		
		d.setName(d.getName()+"Kumar");
		
		mv.addObject("user", d);
		
		mv.setViewName("welcome");
		
		return mv;
		
		}
		
	}

}
