package comppack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import servicepack.ServiceTest;

@Component("muthu")
public class ComponentTest {
	
	@Autowired
	private ServiceTest st;

	public ServiceTest getSt() {
		return st;
	}

	public void setSt(ServiceTest st) {
		this.st = st;
	}
	
	public void comp() {
		
		System.out.println("Component Method is called.........");
		
		st.service();
		
	}

}
