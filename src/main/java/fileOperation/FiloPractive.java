package fileOperation;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FiloPractive {

	public static void main(String[] args) throws FilloException {
		// TODO Auto-generated method stub
		
		writeExcelUpdate();
		
		

		
	}
	
	public static void writeExcel() throws FilloException
	{
		Fillo file=new Fillo();
		Connection conn1=file.getConnection("C:\\Users\\YUGANDHAR\\Documents\\excel\\LoginSheet.xlsx");
		String strquery2="Username";
		String strquery3="P@$$w0rd";
		String strquery4="PASS";
		String strQuery1="INSERT into Sheet1(Username,Password,LoginStatus) VALUES ('"+strquery2+"','"+strquery3+"','"+strquery4+"')";
		
		conn1.executeUpdate(strQuery1);
		conn1.close();
		
		
	}
	
	public static void writeExcelUpdate() throws FilloException
	{
		Fillo file=new Fillo();
		Connection conn1=file.getConnection("C:\\Users\\YUGANDHAR\\Documents\\excel\\LoginSheet.xlsx");

		String strQuery1="Update Sheet1 set Password='Yugandhar' where Username='Username_10'";
		
		conn1.executeUpdate(strQuery1);
		conn1.close();
		
	}
	
	
	public static void readExcel() throws FilloException
	{
		Fillo file=new Fillo();
		Connection conn=file.getConnection("C:\\Users\\YUGANDHAR\\Documents\\excel\\LoginSheet.xlsx");
		String strQuery="Select * from Sheet1 where LoginStatus like 'FA%' ";
		Recordset rs=conn.executeQuery(strQuery);
		System.out.println("UserName     "+"Password      "+"Status     ");
		System.out.println("----------------------------------------------------------");
		while(rs.next())
		{
			System.out.println(rs.getField("Username")+"   "+rs.getField("Password")+ "   "+rs.getField("LoginStatus"));
		}
		
		System.out.println("Total Rows = "+rs.getCount());
		rs.moveLast();
		System.out.println(rs.getField("Username")+"   "+rs.getField("Password")+ "   "+rs.getField("LoginStatus"));
		rs.movePrevious();
		System.out.println(rs.getField("Username")+"   "+rs.getField("Password")+ "   "+rs.getField("LoginStatus"));
		rs.moveNext();
		System.out.println(rs.getField("Username")+"   "+rs.getField("Password")+ "   "+rs.getField("LoginStatus"));
		rs.moveFirst();
		System.out.println(rs.getField("Username")+"   "+rs.getField("Password")+ "   "+rs.getField("LoginStatus"));


		rs.close();
		conn.close();
	}

}
