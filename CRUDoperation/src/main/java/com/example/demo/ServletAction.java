package com.example.demo;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/con")
public class ServletAction {

	@Autowired
	private ServiceAction sa;

	public ServiceAction getSa() {
		return sa;
	}

	public void setSa(ServiceAction sa) {
		this.sa = sa;
	}

	private Data d;
	
	public Data getD() {
		return d;
	}

	public void setD(Data d) {
		this.d = d;
	}

	@RequestMapping("/update")
	public void database() {
		
		System.out.println("before......");
		
		Data d=new Data();
		
		d.setAge(22);
		
		d.setUid(13);
		
		d.setName("Hello");
		
		d.setCity("Chennai");
		
		sa.database(d);
		
		System.out.println("After......");
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/forms")
	public String websearch() {
		
		return "form";
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/forms")
	public ModelAndView met(HttpServletRequest request) {
		
		ModelAndView mv=new ModelAndView();
		
		String ssd=request.getParameter("city");
		
		System.out.println(request.getParameter("city"));
		
		List<Data> l=sa.data(ssd);
		
		Iterator<Data> itr=l.iterator();
		
		System.out.println(l);
		
		String s="";
		
		while(itr.hasNext()) {
			
			Data d=itr.next();
			
			String ss=d.getUid()+":"+d.getName()+":"+d.getAge();
			
			if(ss!=null) {
				
				s=s+","+ss;
				
			}
			
			System.out.println(d);
			
			System.out.println(d.getAge()+":"+d.getUid()+":"+d.getName());
			
		}
		
		request.setAttribute("names", s);
		
		mv.setViewName("name");
		
		return mv;
		
	}
	
	@RequestMapping("/up1")
	public ModelAndView met1(@RequestParam("age") int age,HttpServletRequest request) {
		
		ModelAndView mv=new ModelAndView();
		
		List<Data> l=sa.data1(age);
		
		String s="";
		
		Iterator<Data> itr=l.iterator();
		
		System.out.println(l);
		
		while(itr.hasNext()) {
			
			Data d=itr.next();
			
			String ss=d.getUid()+":"+d.getName()+":"+d.getCity();
			
			if(ss!=null) {
				
				s=s+","+ss;
				
			}
			
			System.out.println(d.getCity()+":"+d.getName()+":"+d.getUid());
			
		}
		
		request.setAttribute("names", s);
		
		mv.setViewName("name");
		
		return mv;
		
	}
	
	@RequestMapping("/up2")
	public ModelAndView met2(@RequestParam("city") String city,HttpServletRequest request) {
		
		ModelAndView mv=new ModelAndView();
		
		List<Data> l=sa.data2(city);
		
		Iterator<Data> itr=l.iterator();
		
		System.out.println(l);
		
		String s="";
		
		while(itr.hasNext()) {
			
			String ss=itr.next().getName();
			
			if(ss!=null) {
				
				s=s+","+ss;
				
			}
			
			System.out.println(ss);
			
		}
		
		System.out.println(s);
		
		request.setAttribute("names", s);
		
		mv.setViewName("name");
		
		return mv;
		
	}
	
}
