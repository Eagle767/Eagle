package xel;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XelToSql {
	
	public XelToSql() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet values(int a) {
		
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			String query="select * from quest where sno=?";
			PreparedStatement ss=con.prepareStatement(query);
			ss.setInt(1, a);
			ResultSet rs=ss.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public String values1(int a) {
		
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			String query="select * from quest where sno=?";
			PreparedStatement ss=con.prepareStatement(query);
			ss.setInt(1, a);
			ResultSet rs=ss.executeQuery();
			while(rs.next()) {
				return rs.getString(a);
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
 
    public void addvlues() {
 
        try {
             
            FileInputStream inputStream = new FileInputStream("C:\\Users\\muthukumar.m\\Downloads\\questions.xlsx");
 
            Workbook workbook = new XSSFWorkbook(inputStream);
 
            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = firstSheet.iterator();
 
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
            con.setAutoCommit(false);
  
            String sql = "INSERT INTO quest VALUES (?, ?, ?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(sql);    
             
            int count = 0,count1=0;
             
            rowIterator.next();
             
            while (rowIterator.hasNext()) {
            	
                Row nextRow = rowIterator.next();
                
                Iterator<Cell> cellIterator = nextRow.cellIterator();
                
                count1=count1+1;
                
                   statement.setInt(1, count1);
                   
                while (cellIterator.hasNext()) {
                    Cell nextCell = cellIterator.next();
 
                    int columnIndex = nextCell.getColumnIndex();
 
                    switch (columnIndex) {
                    case 0:{
                        String name = nextCell.getStringCellValue();
                        statement.setString(2, name);
                        break;
                    }
                    case 1:{
                        String name = nextCell.getStringCellValue();
                        statement.setString(3, name);
                        break;
                    }
                    case 2:{
                        String name = nextCell.getStringCellValue();
                        statement.setString(4, name);
                        break;
                    }
                    case 3:{
                        String name = nextCell.getStringCellValue();
                        statement.setString(5, name);
                        break;
                    }   
                    case 4:{
                        String name = nextCell.getStringCellValue();
                        statement.setString(6, name);
                        break;
                    }
                    case 5:{
                        String name = nextCell.getStringCellValue();
                        statement.setString(7, name);
                        break;
                    } 
                    }
 
                }
                 
                statement.addBatch();
                 
                if (count % 102 == 0) {
                    statement.executeBatch();
                }              
 
            }
 
            workbook.close();
             
            // execute the remaining queries
            statement.executeBatch();
  
            con.commit();
            con.close();
             
        } catch (Exception ex1) {
            ex1.printStackTrace();
        }
 
    }
}