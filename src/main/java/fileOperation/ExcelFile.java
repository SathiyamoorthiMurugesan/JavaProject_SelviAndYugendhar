package fileOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String user = ReadExcel("Sheet1",1,0);
		String pass = ReadExcel("Sheet1",1,1);
		System.out.println("username is : "+user+" password is : "+pass);
		System.out.println();
		writeExcel("Sheet1",1,2,"Login Sucess");
		
	}
	
	
	
	public static String writeExcel(String SheetName,int rNum,int cNum,String Data1)
	{
		
		String data="";
		try
		{
		FileInputStream fis=new FileInputStream("C:\\Users\\YUGANDHAR\\Documents\\excel\\LoginSheet.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(SheetName);
		Row r=s.getRow(rNum);
		Cell c= r.createCell(cNum);
		c.setCellValue(Data1);
		FileOutputStream fos =new FileOutputStream("C:\\\\Users\\\\YUGANDHAR\\\\Documents\\\\excel\\\\LoginSheet.xlsx");
		wb.write(fos);	
		
		
		}catch(Exception e) {
			System.out.println("Read catch Excel Block");
			e.printStackTrace();
		}
		
		
		return data;
	}
	
public static String ReadExcel(String SheetName,int rNum,int cNum)
{
	
	String data="";
	try
	{
	FileInputStream fis=new FileInputStream("C:\\Users\\YUGANDHAR\\Documents\\excel\\LoginSheet.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	Sheet s = wb.getSheet(SheetName);
	Row r=s.getRow(rNum);
	Cell c=r.getCell(cNum);
	data =c.getStringCellValue();
	
	
	}catch(Exception e) {
		System.out.println("Read catch Excel Block");
		e.printStackTrace();
	}
	
	
	return data;
}

}
