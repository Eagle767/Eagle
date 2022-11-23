package com.demo.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.employee.Employee;
import com.demo.employee.EmployeeDAO;

public class SortListTest {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);list.add(4);list.add(3);list.add(7);
		
		Collections.sort(list);System.out.println(list);
		
		Collections.reverse(list);System.out.println(list);
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(a->System.out.println(a));
		
		List<Employee> employees=new EmployeeDAO().getAll();
		
		Collections.sort(employees, new MyComparator());System.out.println(employees);
		
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getId()-o1.getId();
			}});System.out.println(employees);
		
		Collections.sort(employees,(o1,o2)->o2.getName().compareTo(o1.getName()));System.out.println(employees);
		
		employees.stream().sorted((o1,o2)->o1.getName().compareTo(o2.getName())).forEach(System.out::println);
		
		employees.stream().sorted(Comparator.comparing(emp->emp.getId())).forEach(System.out::println);
		
		employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		
	}
	
}
	
	class MyComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getSalary()-o2.getSalary();
		}
		
	}

