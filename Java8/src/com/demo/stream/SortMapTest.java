package com.demo.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.demo.employee.Employee;

public class SortMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("ten", 10);map.put("Seven", 7);map.put("eleven", 11);
		List<Entry<String, Integer>> list=new ArrayList<>(map.entrySet());
		Collections.sort(list,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		Map<Employee, Integer> employees=new TreeMap<>((o1,o2)->o1.getId()-o2.getId());
		employees.put(new Employee(2, "Thor3", 1000000), 3);employees.put(new Employee(3, "Thor1", 300000), 1);
		employees.put(new Employee(1, "Thor2", 500000), 2);System.out.println(employees);
		
		employees.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);
		employees.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed())).forEach(System.out::println);
	}

}
