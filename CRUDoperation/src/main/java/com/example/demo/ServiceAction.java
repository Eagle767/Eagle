package com.example.demo;

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

}
