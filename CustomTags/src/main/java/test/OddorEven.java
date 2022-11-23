package test;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class OddorEven extends TagSupport{
	
	String n;

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}
	
	@Override
	public int doEndTag() throws JspException {
		
		JspWriter jw=pageContext.getOut();
		
		if(Integer.parseInt(n)%2==0) {
			
			try {
				
				jw.println("<h1>Even Number.........</h1>");
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
		}else {
			
			try {
			
			jw.println("<h1>Odd Number.........</h1>");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		}
		
		return super.doEndTag();
		
	}

}
