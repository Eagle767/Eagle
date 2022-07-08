package WebTest;
import java.sql.*;

public class dbConn
  {
    // Member Variables
    private String m_DBLoc = "jdbc:mysql://localhost:3306/muthu";
   private String m_DBDriver = "com.mysql.cj.jdbc.Driver"; 
    private ResultSet m_RS = null;  // RecordSet Variable
    private Connection m_conn = null; 
    
    public String setData(String name, int age)	{
	String sqlInsSt = "INSERT INTO EMP VALUES('" + name + 
                                           "'," + age + ")" ;
	int n = 0;
    	if(m_conn == null) // if Connection has not been set
		return "Connection failed" ;
	
	try {
             Statement  s = m_conn.createStatement();
             n = s.executeUpdate(sqlInsSt);
            }catch (SQLException e) {} // if a SQL error occurs
        
    	if(n !=0) 
	 	return "Data is successfully inserted" ;
	else
		return "Data insertion is failed" ;
	}	
    public ResultSet getData()	{
    	String sqlStatement = "SELECT name,phone FROM emp" ;
        	ResultSet temp = executeQuery(sqlStatement);  	
    	return temp;		
    	}

        //-------------------------------------------------------
        // Method executeQuery -- for executing queries.  Returns 
        //  a ResultSet (RecordSet) kind of like in ADO
        //-------------------------------------------------------
        public ResultSet executeQuery(String stmt)
        { 
            if(m_conn == null) // if Connection has not been set
              m_RS = null; 
            else
            {  try {
                 Statement  s = m_conn.createStatement();
                 m_RS = s.executeQuery(stmt);
               }
               catch (SQLException e) {} // if a SQL error occurs
            }
            return(m_RS);
        }
      //-----------------------------------------------------
        // Method DBConnect -- must connect to the DB before a 
        //  query can be executed.  Returns an error message
        //  to be printed by the caller if there is an error.
        //-----------------------------------------------------
        public String DBConnect()
        { 
          String retVal = ""; // there are no errors yet
          //Connection conn = null;
          try // try to connect to the database
          {  Class.forName(m_DBDriver);
             m_conn = DriverManager.getConnection(m_DBLoc,"root","root");
          } 
          // if the driver class isn't found
          catch (ClassNotFoundException e) {retVal = e.toString();}
          catch (SQLException e) {retVal = e.toString();} // if a SQL error occurs
       
          return(retVal); // returns error messages or an empty string 
                          // that the caller must print.
        }
    }
