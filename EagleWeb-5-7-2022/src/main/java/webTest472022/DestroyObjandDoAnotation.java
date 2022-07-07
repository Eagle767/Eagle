package webTest472022;

import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")

public class DestroyObjandDoAnotation extends HttpServlet {
	
	@Override
	public void init() throws ServletException {

		System.out.println("The New Information added and new Obj Created.............");
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
		System.out.println("To Get Method to get the Messages.......");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("To Post to post the Messages............");
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("The Changes are Applied and Old Obj is Deleted.............");
		
	}

}
