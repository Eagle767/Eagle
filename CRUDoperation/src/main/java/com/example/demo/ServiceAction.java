package com.example.demo;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServiceAction {
	
	@Autowired
	private DataDAO d;

	public DataDAO getD() {
		return d;
	}

	public void setD(DataDAO d) {
		this.d = d;
	}

	public void database(Data da) {
		
		getD().save(da);
		
	}
	
	public List<Data> data(String city){
		
		return getD().findBycity(city);
		
	}
	
	public List<Data> data1(int age){
		
		return getD().findByageGreaterThan(age);
		
	}
	
	public List<Data> data2(String city){
		
		return getD().findBycitySorted(city);
		
	}

}
