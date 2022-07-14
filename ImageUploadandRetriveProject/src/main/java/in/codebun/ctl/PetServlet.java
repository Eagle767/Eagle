package in.codebun.ctl;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.DbDoc;
import in.codebun.DbConnect.DBConnection;

@MultipartConfig(maxFileSize=16177215)
@WebServlet("*.do")
public class PetServlet extends HttpServlet {

 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  response.setContentType("image/jpeg");
  int id = Integer.parseInt(request.getParameter("id"));
  Connection conn = DBConnection.getConn();
  String sql = "SELECT * FROM PETTABLE WHERE ID ="+id;
  PreparedStatement ps;
  try {
   ps = conn.prepareStatement(sql);
   ResultSet rs = ps.executeQuery();
   if(rs.next()){
    byte [] imageData = rs.getBytes("petphoto"); // extract byte data from the resultset..
    OutputStream os = response.getOutputStream(); // output with the help of outputStream 
             os.write(imageData);
             os.flush();
             os.close();
   }
  } catch (SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
   response.getOutputStream().flush();
   response.getOutputStream().close();
  }
  
 }
 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String petName = request.getParameter("petName");
  String petOwner = request.getParameter("petOwner");
  String petBreed = request.getParameter("petBreed");
  InputStream inputStream = null ;//input stream of uploaded file
  Part part = request.getPart("photo");
  if(part!=null){
   System.out.println(part.getName());
            System.out.println(part.getSize());
            System.out.println(part.getContentType());
            inputStream = part.getInputStream();
  }
  // Now Create a connection and send it to DB...
  Connection conn = DBConnection.getConn();
  String sql = "INSERT INTO PETTABLE (PETNAME,PETOWNER, PETBREED, PETPHOTO) VALUES (?,?,?,?)";
  try {
   PreparedStatement ps = conn.prepareStatement(sql);
   ps.setString(1,petName);
   ps.setNString(2, petOwner);
   ps.setString(3, petBreed);
   ps.setBlob(4, inputStream);
   int i = ps.executeUpdate();
   if(i > 0){
    request.setAttribute("success", "Pet Added Successfully");
    request.getRequestDispatcher("index.jsp").forward(request, response);
   }
  } catch (SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  
  
 }
}