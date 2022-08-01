package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServiceTest {
	
	@Autowired
	private CustomerDao dao;

	public CustomerDao getDao() {
		return dao;
	}

	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}
	
	public void saveData(Customers c) {
		
		getDao().save(c);
		
	}
	
	public List<Customers> checkUser(String name,String pass){
		
		return getDao().CheckUser(name, pass);
		
	}
	
	public List<Customers> checkUID(Customers d) {
		
		return getDao().checkUID(d);
		
	}

}
