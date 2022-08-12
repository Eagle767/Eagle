package model;

import com.opensymphony.xwork2.ActionSupport;

public class ErrorDemo extends ActionSupport{
	@Override
	public String execute() throws Exception {
		int i=1/0;
		return "success";
	}
}
