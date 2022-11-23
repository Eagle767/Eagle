package model;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction2 extends ActionSupport{
	private String msg="This message is from action class...";
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String add() {
		return "add.success";
	}
	
	public String del() {
		return "del.success";
	}
	
	public String edit() {
		return "edit.success";
	}
}
