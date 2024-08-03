package loginvalidating;
import sample.*;

public class LoginValidate {


	public static void main(String[] args) {


	}
	public static  void pushcred(String userName,String passWord)
	{
//		System.out.println("Username :"+userName+"Password:"+passWord);
		Logincheck.check(userName, passWord);
		
	}
	

}

class Logincheck{
	public static void check(String userName,String passWord) {
		
		  if(userName.equals("admin") && passWord.equals("Yuga"))
		    {
		    	System.out.println("\n\n\n\nLogin Sucessfull");
		    	System.out.println("\n\n\n\nWelcome");
		    	Arithmatic.main(null);
		    	
		    	
		    }
		    else
		    {
		    	System.out.println("\n\n\nLogin Failed");
		    	Login.main(null);
		    }
		
	}

}