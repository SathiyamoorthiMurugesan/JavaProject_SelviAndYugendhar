package adminLoginAndUsermanagement;

import java.util.ArrayList;
import java.util.Scanner;




public class UserCred {
	static ArrayList<String> userTable = new ArrayList<>();
	static ArrayList<String> passTable = new ArrayList<>();

	public void addItem(String username,String password) {
        // Check if the item already exists
        if (userTable.contains(username)) {
            // Throw custom exception for duplicates
            throw new DuplicateEntryException("Duplicate entry found: " + username);
        }
        else {
        	
        	userTable.add(username);
        	passTable.add(password);
        }
        
    }
	public void addItem1(String username,String password) {
        // Check if the item already exists
        if (userTable.contains(username)) {
            // Throw custom exception for duplicates
            throw new DuplicateEntryException("Duplicate entry found: " + username);
        }
        else {
        	
        	userTable.add(username);
        	passTable.add(password);
        	System.out.println("User Sucessfull Added");
        	System.out.println("Username: "+username+"\nPassword :"+password);
        }
        
    }
	
	
	public void signUp(String user123) {

		if (user123.equals("Admin")) {
			
			
			
			try {
				Scanner sc1 = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in);
				System.out.println("************************************");
				System.out.print("Enter UserName: ");
				String userName = sc1.nextLine();
				System.out.print("Enter Password: ");
				String passWord = sc2.nextLine();
				System.out.println("************************************");
				addItem1(userName,passWord);
				
			} catch (DuplicateEntryException e) {
				ClearConsole.clearConsole();
	            System.err.println(e.getMessage());
				System.out.println("UserName Already Exist\n");
				System.out.println("Re-Try with another Username");
				signUp("Admin");
				ClearConsole.clearConsole();

			}
						
			AdminMaintainence new22 =new AdminMaintainence();
			new22.admin();


//			ClearConsole.clearConsole();
//			Scanner sc1 = new Scanner(System.in);
//			Scanner sc2 = new Scanner(System.in);
//			System.out.println("************************************");
//			System.out.print("Enter UserName: ");
//			String userName = sc1.nextLine();
//			userTable.add(userName);
//			System.out.print("Enter Password: ");
//			String passWord = sc2.nextLine();
//			passTable.add(passWord);
//			System.out.println("************************************");
//			ClearConsole.clearConsole();
//			System.out.println("Username:" + userName + "Password: " + passWord);
//			

		} else {
			
			try {
				Scanner sc1 = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in);
				System.out.println("************************************");
				System.out.print("Enter UserName: ");
				String userName = sc1.nextLine();
				System.out.print("Enter Password: ");
				String passWord = sc2.nextLine();
				System.out.println("************************************");
				addItem(userName,passWord);
				
			} catch (DuplicateEntryException e) {
				ClearConsole.clearConsole();
	            System.err.println(e.getMessage());
				System.out.println("UserName Already Exist\n");
				System.out.println("Re-Try with another Username");
				signUp("");
				ClearConsole.clearConsole();

			}

			
			System.out.println("User Sucessfull Added");
			Lobby new1 = new Lobby();
			new1.lobbyPage();

		}

	}

	public void loginValidate(String user, String pass) {
//		int len=userTable.size();
		int i, a=0;
		for(i=0;i<userTable.size()-1;i++) {
			
			if(userTable.get(i).equals(user))
			{
				a=i;
				
			}
		}
		
		if(userTable.get(a).equals(user) && passTable.get(a).equals(pass)) {
			System.out.println("logged in Sucessfully ");
			ClearConsole.clearConsole();
			AdminMaintainence new12=new AdminMaintainence();
			new12.admin();
		}
		else {
			System.out.println("Logon Failed");
			System.out.println("Incorrect user Credentials");
			Lobby new1=new Lobby();
			new1.lobbyPage();
		}


		
}
}
