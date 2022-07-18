package servletPack;

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

@WebFilter("/FilterFunction")
public class FilterFunction extends HttpFilter implements Filter {
  
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Filter Funtion is started........");
		
		HttpServletRequest req=(HttpServletRequest) request;
		
		HttpServletResponse res=(HttpServletResponse) response;
		
		HttpSession hs=req.getSession();
		
		if(hs.isNew()) {
			
			String action=req.getParameter("action");
			
			if(action.equals("login")) {
				
				chain.doFilter(request, response);
				
			}else {
				
				res.sendRedirect("error.jsp");
				
			}
			
		}else {
			
			chain.doFilter(request, response);
			
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("Started.........");
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("Destroyed.........");
		
	}

}
