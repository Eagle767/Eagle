package com.example.demo;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping("/up")
	public void met(@RequestParam("city") String city) {
		
		List<Data> l=sa.data(city);
		
		Iterator<Data> itr=l.iterator();
		
		System.out.println(l);
		
		while(itr.hasNext()) {
			
			Data d=itr.next();
			
			System.out.println(d);
			
			System.out.println(d.getAge()+":"+d.getUid()+":"+d.getName());
			
		}
		
	}
	
	@RequestMapping("/up1")
	public void met1(@RequestParam("age") int age) {
		
		List<Data> l=sa.data1(age);
		
		Iterator<Data> itr=l.iterator();
		
		System.out.println(l);
		
		while(itr.hasNext()) {
			
			Data d=itr.next();
			
			System.out.println(d.getCity()+":"+d.getName()+":"+d.getUid());
			
		}
		
	}
	
	@RequestMapping("/up2")
	public void met2(@RequestParam("city") String city) {
		
		List<Data> l=sa.data2(city);
		
		Iterator<Data> itr=l.iterator();
		
		System.out.println(l);
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next().getName());
			
		}
		
	}
	
}
