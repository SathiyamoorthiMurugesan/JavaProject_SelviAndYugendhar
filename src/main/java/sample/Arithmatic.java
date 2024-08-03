package sample;
import java.util.Scanner;
import loginvalidating.*;
public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=259259,b=259259,c=259259;
		int d;
		d=a+b+c;
		System.out.println("\n\n\n\nYou Secret Key is ="+d);
		keygen();
		

	}
	public static int keygen() {
		Scanner key1 = new Scanner(System.in);  
	    System.out.println("\n\n\n\nEnter Secret Key:");

	    String secretKey = key1.nextLine(); 
	    
	    if (secretKey.equals("777777"))
	    {
	    	Message.main(null);
	    }
	    else if (secretKey.equals("0"))
	    {
	    	Message.main(null);    	
	    }
	    else {
	    	return 0;
	    }
	    return 0;
	}
	
	

}