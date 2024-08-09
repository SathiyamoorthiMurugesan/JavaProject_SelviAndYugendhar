package adminLoginAndUsermanagement;
import java.util.Scanner;

public class AdminMaintainence {
	static String defultUser="Admin";

	public void admin() {
		
		System.out.println("\n\n\n1.List users");
		System.out.println("2.list users along with password");
		System.out.println("3.Add User ");
		System.out.println("4.logout\n\n");
		System.out.print("Enter your Choice : ");
		Scanner sc5=new Scanner(System.in);
		int choice=sc5.nextInt();
		if(choice==1)
		{
			ClearConsole.clearConsole();
			int i;
			System.out.println("User Currently Active\n\n");
			for (i=0;i<UserCred.userTable.size();i++)
			{
				System.out.println(i+"."+UserCred.userTable.get(i));
			}
		  
			admin();
		}
		else if (choice==2)
		{
			ClearConsole.clearConsole();
		
			int i;
			System.out.println("UserDetails and Passwords\n\n");
			for  (i=0;i<UserCred.userTable.size();i++)
			{
				System.out.println(i+". User Name= "+UserCred.userTable.get(i)+"  Password : "+UserCred.passTable.get(i));
				
				
			}
			 
			admin();
		}
		else if (choice==3) {
			ClearConsole.clearConsole();
		
			UserCred new22 = new UserCred();
			new22.signUp(defultUser);
		
			admin();
			
			
		}
		else if(choice==4) {
			ClearConsole.clearConsole();
			System.out.println("Logout Sucessfull\n\n");
			Lobby new22 =new Lobby();
			new22.lobbyPage();
		}
		else {
			ClearConsole.clearConsole();
		
			admin();
		}
	}
	
	
}
