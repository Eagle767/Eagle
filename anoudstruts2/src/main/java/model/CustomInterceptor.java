package model;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class CustomInterceptor implements Interceptor{

	@Override
	public void destroy() {
		System.out.println("destroy of custom interceptor called....");
	}

	@Override
	public void init() {
		System.out.println("init of custom interceptor called....");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		
		ActionContext ctx=arg0.getInvocationContext();
		Map session=ctx.getSession();
		Object obj=ctx.get("user");
		System.out.println(obj);
		Object n=session.get("name");
		if(n!=null)
		{
		String name=n.toString(); 	
		if(name.equals("somu"))
		{
			System.out.println("its ramu its ramu its ramu...");
		}
		}
		else {
			System.out.println("the session value is null.....");
		}
		// TODO Auto-generated method stub
		System.out.println("interceptor called............");
		return arg0.invoke();
	}

}
