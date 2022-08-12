package model;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction4 extends ActionSupport implements SessionAware{
	private String msg="This message is from action class...";
	private String nextPage;
	Map<String,String> mysession;
	@Override
	public void setSession(Map map) {
		// TODO Auto-generated method stub
		this.mysession=map;
		this.mysession.put("myname", "anoud technologies...");
	}
	public String getNextPage() {
		return nextPage;
	}
	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String add() {
		setNextPage("welcome1.jsp");
		return "success";
	}
	
	public String del() {
		setNextPage("welcome2.jsp");
		return "success";
	}
	
	public String edit() {
		setNextPage("welcome3.jsp");
		return "success";
	}
}
