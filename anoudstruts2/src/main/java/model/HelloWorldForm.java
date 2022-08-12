package model;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldForm extends ActionSupport implements SessionAware{

	Map<String,String> mysession;
	
	@Override
	public void setSession(Map arg0) {
		this.mysession=arg0;
		mysession.put("name", "this is custome value...");
	}
	
	private User user;

	public Map<String, String> getMysession() {
		return mysession;
	}

	public void setMysession(Map<String, String> mysession) {
		this.mysession = mysession;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("execute method called....");
		return "success";
	}
	
	@Override
	public void validate() {
		System.out.println("validate is called by default....");
		System.out.println("validate is called by default....");
	 	if(user.getUname().equals("ramu"))
	 	{
	 		addFieldError("invaliduser",getText("invalid"));
	 	}
	}
}
