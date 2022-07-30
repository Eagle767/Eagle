package com.example.demo;

	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

	@Repository
	public interface DataDAO extends JpaRepository<Data, Integer>{
		
		public List<Data> findBycity(String city);
		
		public List<Data> findByageGreaterThan(int age);
		
		@Query("from Data where city='Chennai' order by name")
		public List<Data> findBycitySorted(String city);

	}