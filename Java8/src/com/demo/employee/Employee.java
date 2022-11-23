package com.demo.employee;

public class Employee {
	
	private String name;private Integer id,salary;

	public Employee(Integer id,String name,Integer salary) {
		this.id=id; this.name=name; this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "id:"+id+",name:"+name+",salary:"+salary;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	

}
