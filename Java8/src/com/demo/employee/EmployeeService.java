package com.demo.employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
	
	public List<Employee> getStatus(String input){
		List<Employee> employees= new EmployeeDAO().getAll();
		return input.toUpperCase().equalsIgnoreCase("TAX") 
				?   employees.stream().filter(a->a.getSalary()>=500000).collect(Collectors.toList())
						:  employees.stream().filter(a->a.getSalary()<500000).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<Employee> employees= new EmployeeDAO().getAll();
		System.out.println(new EmployeeService().getStatus("tAx"));
		System.out.println(new EmployeeService().getStatus("nOntAx"));
		System.out.println(employees.size());
	}

}
