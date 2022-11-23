package com.example.demo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<Customers,Integer>{
	
	@Query("from Customers where name=?1 and pass=?2")
	public List<Customers> CheckUser(String name,String pass);
	
	@Query("from Customers order by uid ASC")
	public List<Customers> checkUID(Customers d);

}
