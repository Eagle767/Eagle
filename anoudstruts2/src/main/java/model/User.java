package model;

import java.io.Serializable;

public class User implements Serializable{
	private String uname;
	private String upass;
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUpass() {
		return upass;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUname() {
		return uname;
	}
}
