package sun;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class NumberChecking extends TagSupport{

	@Override
	public int doEndTag() throws JspException {
		
		JspWriter jw=pageContext.getOut();
		
		int num=Integer.parseInt(number);
		
		if(num%2==0) {
			
			try {
				
				jw.println("<h1>Even Number........</h1>");
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			
		}else {
			
			try {
				
				jw.println("<h1>Odd Number........</h1>");
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		return super.doEndTag();
	}
	
	String number;
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
