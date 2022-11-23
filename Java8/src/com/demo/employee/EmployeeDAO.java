package com.demo.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	public List<Employee> getAll(){
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "Thor", 500000));list.add(new Employee(3, "Hulk", 300000));list.add(new Employee(2, "Marvel", 1000000));
		return list; 
	}

}
