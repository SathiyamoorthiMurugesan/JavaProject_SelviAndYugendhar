package stringPractice;
import java.util.Scanner;

public class WelcomeName  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);

		System.out.println("Enter username");
		final String userName = sc.nextLine();
		System.out.println("Enter Password");

		final String passWord = sc1.nextLine(); 
		
//		System.out.println("Username :"+userName+"\nPassword :"+passWord);
		LoginCheck obj1=new LoginCheck();
		obj1.method2(userName, passWord);
	// As per My understanding only default access modifies or final(keyword) is allowed on declaring the local modifier
		
		
		
	}

}

class UserVaildation{
	static String c1=" Please Wait we are Redirecting to Dashbord .......";
	static String c2;
	static Applications a123 =new Applications();
	
	public String method1(String User) {
		
		
		if(User.equals("Yugandhar")) {
			
			c2=User+c1;
			
			System.out.println("Welcome "+User+"!\n");
			System.out.println("Hello "+c2);
			
			a123.methodApp();
		}
		else if(User.equals("Sathyamorthi"))
			
		{
			c2=User+c1;

			System.out.println("Welcome "+User+"!\n");
			System.out.println("Hello "+c2);
			a123.methodApp();


			
		}
		else if(User.equals("Selvi"))
		{
			c2=User+c1;

			System.out.println("Welcome "+User+"!\n");
			System.out.println("Hello "+c2);

			a123.methodApp();

			
		}
		else if(User.equals("admin"))
		{
			c2=User+c1;

			System.out.println("Welcome "+User+"!\n");
			System.out.println("Hello "+c2);
			a123.methodApp();

			

			
		}
		else
		{
			System.out.println(" \n User Unknown! \n\n \nPlease login Again");
			WelcomeName.main(null);
	
		}
		return null;
	}
	
}

class LoginCheck{
	static String a1;
	static int b1;
	static UserVaildation aa=new UserVaildation();

	public void method2(String User,String Pass)
	{
		String[] userName= new String[] {"admin","Yugandhar","Sathymoorthi","Selvimurugan"};
		String[] passWord= new String[] {"password","Yuga","Sathya","Selvi"};
		
		
		for(int i=0;i<userName.length;i++)
		{
		if (User.equals(userName[i]))
		{
			a1=userName[i];
			b1=i;
		}
		}
		
		if (User.equals(userName[b1]) && Pass.equals(passWord[b1]) ) {
			System.out.println("\n\nLogin Sucessfull");
			aa.method1(User);
			
		}
		else {
			System.out.println(" \n \nLogin Failed");
			aa.method1(User);
		}
		
	}
}

class Applications{
	static int a;
	public void methodApp() {
		System.out.println("Applications Available:\n\n");
		System.out.println("1.Calculator\n");
		System.out.println("2.Find Odd or Even for the Given Number\n");
		System.out.println("3.Logout");
		Scanner sc2 =new Scanner(System.in);
		a=sc2.nextInt();
		
		if (a==1) {
			Calculator ab123 =new Calculator();
			ab123.main(null);
		}
		else if  (a==2)
		{
			OddOrEven bc123 =new OddOrEven();
			bc123.main(null);
			
		}
		else {
			System.out.println("Successfully logged Out");
			WelcomeName cd123=new WelcomeName();
			cd123.main(null);
		}
		
	}
	
	
}