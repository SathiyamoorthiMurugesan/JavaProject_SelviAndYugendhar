package stringPractice;
import java.util.Scanner;

public class OddOrEven {
static int  a,b;
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number :");
		a=sc.nextInt();
		if (a%2==0) {
			System.out.println("The given Num ="+a+" is Even");
			
		}
		else if(a%2!=0)
		{
			System.out.println("The given Num ="+a+" is odd");

			
		}
		System.out.println("1.continue the ODD or EVEN");
		System.out.println("2.Return to Main Menu");
		b=sc.nextInt();
		switch(b) {
		case 1: OddOrEven.main(args);
		case 2: Applications sc1=new Applications(); sc1.methodApp();
		
		}

	}

}
