package com.example.demo;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/con")
public class ServletTest {
	
	@Autowired
	MessageSource ms;
	
	@Autowired
	private ServiceTest st;

	public ServiceTest getSt() {
		return st;
	}

	public void setSt(ServiceTest st) {
		this.st = st;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/forms")
	public ModelAndView websearch() {
		
		ModelAndView mv=new ModelAndView();
		
		Customers d=new Customers();
		
		d.setFlag(0);
		
		int a=d.getUid()+1;
		
		d.setUid(a);
		
		mv.addObject("user", d);
		
		mv.setViewName("register");
		
		return mv;
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/forms")
	public ModelAndView welcome(@Valid@ModelAttribute("user") Customers d, BindingResult rs ,HttpServletRequest request) {
		
		ModelAndView mv=new ModelAndView();
		
		System.out.println(d.getName());
		
		String pass1=request.getParameter("pass1");
		
		String pass2=request.getParameter("pass2");
		
		if(pass1.equals(pass2)) {
		
		List<Customers> a=st.checkUID(d);
		
		Iterator<Customers> itr=a.iterator();
		
		int b=0;
		
		while(itr.hasNext()) {
			
			b=itr.next().getUid();
			
		}
		
		System.out.println(b);
		
		d.setUid(b+1);
		
		d.setPass(pass2);
		
		mv.addObject("user", d);
		
		st.saveData(d);
		
		mv.setViewName("welcome");
		
		return mv;
		
		}else {
			
			mv.setViewName("error");
			
			return mv;
			
		}
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/forms1")
	public ModelAndView websearch1() {
		
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("login");
		
		return mv;
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/forms1")
	public ModelAndView welcome1(HttpServletRequest request) {
		
		ModelAndView mv=new ModelAndView();
		
		String name=request.getParameter("name");
		
		String pass=request.getParameter("pass");
		
		System.out.println(name+":"+pass);
		
		List<Customers> c=st.checkUser(name, pass);
		
		Iterator<Customers> itr=c.iterator();
		
		while(itr.hasNext()) {
			
			mv.setViewName("welcome");
			
			return mv;
			
		}
		
		mv.setViewName("error");
		
		return mv;
		
	}

}
