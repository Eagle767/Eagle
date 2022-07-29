package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping("/update")
	public void database() {
		
		System.out.println("before......");
		
		Data d=new Data();
		
		d.setAge(22);
		
		d.setUid(11);
		
		d.setName("Hello");
		
		d.setCity("Chennai");
		
		sa.database(d);
		
		System.out.println("After......");
		
	}
	
}
