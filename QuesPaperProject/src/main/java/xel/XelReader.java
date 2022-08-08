package xel;
import java.io.File;  
import java.io.FileInputStream;  
import java.util.Iterator;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
public class XelReader  
{  
public static void main(String[] args)   
{  
try  
{  
File file = new File("C:\\Users\\muthukumar.m\\Downloads\\questions.xlsx");
FileInputStream fis = new FileInputStream(file); 
try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
	XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object  
	Iterator<Row> itr = sheet.iterator();    //iterating over excel file  
	while (itr.hasNext())                 
	{  
	Row row = itr.next();  
	Iterator<Cell> cellIterator = row.cellIterator();
	while (cellIterator.hasNext())   
	{  
	Cell cell = cellIterator.next();  
	System.out.println(cell.getStringCellValue());
//	switch (cell.getCellType())               
//	{  
//	case Cell.CELL_TYPE_STRING:
//	System.out.print(cell.getStringCellValue() + "\t\t\t");  
//	break;  
//	case Cell.CELL_TYPE_NUMERIC:
//	System.out.print(cell.getNumericCellValue() + "\t\t\t");  
//	break;  
//	default:  
//	}  
	}  
	System.out.println("");  
	}
}  
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
}  