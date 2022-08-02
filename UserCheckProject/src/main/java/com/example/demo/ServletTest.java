package com.example.demo;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/con")
public class ServletTest {
	
	@Autowired
	private ServiceTest st;
	
	@Autowired
	MessageSource ms;

	public ServiceTest getSt() {
		return st;
	}

	public void setSt(ServiceTest st) {
		this.st = st;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/forms")
	public ModelAndView websearch(Customers d) {
		
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("user", d);
		
		mv.setViewName("register");
		
		return mv;
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/forms")
	public ModelAndView websearch(@Valid@ModelAttribute("user") Customers d, BindingResult rs,HttpServletRequest request) {
		
		ModelAndView mv=new ModelAndView();
		
		if(rs.hasErrors()) {
			
			mv.setViewName("register");	
			
			return mv;
			
		}else {
		
		String pass1=request.getParameter("pass1"),pass2=d.getPass();
		
		if(pass1.equals(pass2)) {
		
		List<Customers> a=st.checkUID(d);
		
		Iterator<Customers> itr=a.iterator();
		
		int b=0;
		
		while(itr.hasNext()) { b=itr.next().getUid();	}
		
		d.setUid(b+1);	d.setFlag(0);
		
		mv.addObject("user", d);	st.saveData(d);
		
		mv.setViewName("welcome");	return mv;
		
		}else {
			
			mv.setViewName("register");	return mv;
			
		}
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/forms1")
	public ModelAndView websearch5(Customers d,HttpServletRequest request) {
		
        ModelAndView mv=new ModelAndView();
		
		mv.addObject("user", d);
		
		mv.setViewName("login");
		
		return mv;
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/forms1")
	public ModelAndView websearch1(@ModelAttribute("user") Customers d,HttpServletRequest request) {
		
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("names",d.getName());
		
		mv.addObject("passs",d.getPass());
		
		String name=d.getName(),pass=d.getPass();
		
		List<Customers> c=st.checkUser(name, pass);
		
		Iterator<Customers> itr=c.iterator();
		
		while(itr.hasNext()) {
			
			if(itr.next().getFlag()==0) {
			
				mv.setViewName("welcome"); st.updateFlag(1, name,pass);  return mv;	}
			
		}
		
		mv.setViewName("error");	return mv;
		
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/log")
	public ModelAndView logout(Customers d,HttpServletRequest request) {
		
		st.updateFlag(0, request.getParameter("name"), request.getParameter("pass"));
		
	     return websearch5(d,request);
		
	}
	
}
