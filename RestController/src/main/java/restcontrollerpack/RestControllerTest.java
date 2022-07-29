package restcontrollerpack;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@XmlRootElement
class Customer{
	
	private String cname;
	
	private int cid;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
}

@Repository
class CustomerRepo{
	
	public Customer getElementById(int id) {
		
		Customer c=new Customer();
		
		c.setCid(id);
		
		c.setCname("Eagle");
		
		return c;
		
	}
	
	public List<Customer> getAll() {
		
		Customer c=new Customer();
		
		c.setCid(10);
		
		c.setCname("Eagle");
		
		Customer c1=new Customer();
		
		c1.setCid(20);
		
		c1.setCname("Muthu");
		
		List<Customer> l=new ArrayList<>();
		
		l.add(c1);
		
		l.add(c);
		
		return l;
		
	}
	
	public Customer delete(int id) {
		
		System.out.println("Deleted......");
		
		return new Customer();
		
	}
	
	public Customer search(String name) {
		
		Customer c=new Customer();
		
		c.setCid(30);
		
		c.setCname(name);
		
		return c;
		
	}
	
	public void store(Customer c) {
		
		System.out.println("Stored........");
		
	}
	
}

@RestController
public class RestControllerTest {
	
	@Autowired
	CustomerRepo cr;
	
	@GetMapping("/rest/customer/get/{id}")
	public Customer getElementById(@PathVariable("id") int id) {
		
		return cr.getElementById(id);
		
	}
	
	@RequestMapping("/rest/customer/getAll")
	public List<Customer> getAll() {
		
		return cr.getAll();
		
	}
	
	@DeleteMapping("/rest/customer/delete/{id}")
	public Customer delete(@PathVariable("id") int id) {
		
		return cr.delete(id);
		
	}
	
	@PostMapping("/rest/customer/create")
	public Customer create(@RequestBody Customer c) {
		
		cr.store(c);
		
		return c;
		
	}
	
	@GetMapping("/rest/customer/search/{name}")
	public Customer search(@PathVariable("name") String name) {
		
		return cr.search(name);
		
	}

}
