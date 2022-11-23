package model;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction3 extends ActionSupport{
	private String msg="This message is from action class...";
	private String nextPage;
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
