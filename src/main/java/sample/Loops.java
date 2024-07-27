package sample;
import java.util.Scanner;
import loginvalidating.*;

public class Loops{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Scanner obj1 = new Scanner(System.in);  
	    System.out.println("Enter username");

	    String userName = obj1.nextLine(); 
	    
	    
	    Scanner obj2 = new Scanner(System.in);  
	    System.out.println("Enter Password");
	    String passWord = obj2.nextLine(); 
//	    System.out.println(userName);
//	    System.out.println(passWord);
	    LoginValidate.pushcred(userName, passWord);
	   

	}

}


