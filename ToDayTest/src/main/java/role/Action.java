package role;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class Action {
	
	public Action() {
		
	}

	public abstract String process(ServletRequest request,ServletResponse response);
	
}
