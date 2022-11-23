package webTest672022;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Example4MySqlConnectinWeb")
public class Example4MySqlConnectinWeb extends HttpServlet {
	
	Connection con;
	
	PreparedStatement ps;
	
	@Override
	public void init() throws ServletException {
		
		System.out.println("The New Obj is Created............");
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="insert into emp values(?,?)";
			
			ps=con.prepareStatement(query);
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Service Method is Called.........");
		
		response.setContentType("text/html");
		
		String a=request.getParameter("name");
		
		String b=request.getParameter("age");
		
		int c=Integer.parseInt(b);
		
		PrintWriter pw=response.getWriter();
		
		pw.println("Welcome..........");
		
		try {
			
			ps.setString(1, a);
			
			ps.setInt(2, c);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		pw.println("Bye..........");
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("The Old Obj is Deleted..............");
		
	}

}
