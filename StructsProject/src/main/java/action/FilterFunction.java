package action;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("*.do")
public class FilterFunction extends HttpFilter implements Filter {

	public void destroy() {
		
		System.out.println("The filter is destroyed.....");
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("The Filter option is Do go........");
		
		HttpServletRequest hreq=(HttpServletRequest) request;
		
		HttpServletResponse hres=(HttpServletResponse) response;
		
		HttpSession hs=hreq.getSession();
		
		if(hs.isNew()) {
			
			String action=hreq.getParameter("action");
			
			if(action.equals("login")) {
				
				chain.doFilter(request, response);
				
			}else {
				
				hres.sendRedirect("Expiry.jsp");
				
			}
			
		}else {
			
		chain.doFilter(request, response);
		
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("The Filter Started......");
		
	}

}
