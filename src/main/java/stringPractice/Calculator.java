package stringPractice;
import java.util.Scanner;

public class Calculator implements InterfaceCalc {
	
	public static void main(String[] args) {
		System.out.println("\n1.Addition");
		System.out.println("\n2.Subtration");
		System.out.println("\n3.multiplication");
		System.out.println("\n4.Division");
		
		Scanner ab1=new Scanner(System.in);
		int value1=ab1.nextInt();
		
		
		if(value1==1)
		{
			Addition a1=new Addition();
			a1.main(null);
		}
		else if (value1==2)
		{
			Subtraction a2=new Subtraction();
			a2.main(null);
		}
		
		else if (value1==3)
		{
			Multiplication a3=new Multiplication();
			a3.main(null);
		}
		else if (value1==4)
		{
			Division a4=new Division();
			a4.main(null);
		}
		
		
	}
	

}
class Addition extends Calculator implements Addition1{
	static long a,b,c,b1;
	public  int  addition() {
		System.out.println("Current Value is :"+a);
		Scanner a1 =new Scanner(System.in);
		System.out.println("Enter the Value for b:");
		b=a1.nextInt();
		System.out.println(b);
		a=a+b;
		System.out.println("Enter the Number to Add the value or give 0 to Stop the calculation");
		while(c<=0)
		{
			b1=a1.nextInt();
			System.out.println("Number Entered :"+b1);
			if (b1 > 0)
			{
				System.out.println(a+"+"+b1+"=");
				a+=b1;
				System.out.println(a);
			}
		
			else {
				c=b1;
				return 0;

				
		
			}
		}
		return 0;	


	}public static void main(String[] args) {
		Addition a123 =new Addition();	
		a123.addition();
		System.out.println("1.Calculation Menu\n");
		System.out.println("2.Return To Main Menu");
		Scanner sc123=new Scanner (System.in);
		int abc=sc123.nextInt();
		if (abc==1)
		{
			Calculator.main(null);
		}
		
		else if (abc==2)
		{
			Applications ca123=new Applications();
			ca123.methodApp();
			
		}
	}
	
	
	
	
	
	
}


class Subtraction extends Calculator implements Subtraction2{
	static long a,b,c,b1;
	public  int  subtraction() {
		System.out.println("Current Value is :"+a);
		Scanner a1 =new Scanner(System.in);
		System.out.println("Enter the Value for b:");
		b=a1.nextInt();
		System.out.println(b);
		a=a-b;
		System.out.println("Enter the Number to Add the value or give 0 to Stop the calculation");
		while(c==0)
		{
			b1=a1.nextInt();
			System.out.println("Number Entered :"+b1);
			if (b1 > 0)
			{
				System.out.println(a+"-"+b1+"=");
				a-=b1;
				System.out.println(a);
			}
		
			else {
				c=b1;
				return 0;
		
			}
		}
		return 0;


	}public static void main(String[] args) {
		Subtraction b123 =new Subtraction();
		b123.subtraction();
		System.out.println("1.Calculation Menu\n");
		System.out.println("2.Return To Main Menu");
		Scanner sc123=new Scanner (System.in);
		int abc=sc123.nextInt();
		if (abc==1)
		{
			Calculator.main(null);
		}
		
		else if (abc==2)
		{
			Applications ca123=new Applications();
			ca123.methodApp();
			
		}
	}
	
	
	
}
class Multiplication extends Calculator implements Multiplication3{
	static long a,b,c,b1;
	public int multiplication(){
		System.out.println("Current Value is :"+a);
		Scanner a1 =new Scanner(System.in);
		System.out.println("Enter the Value for b:");
		b=a1.nextInt();
		System.out.println(b);
		a=a*b;
		System.out.println("Enter the Number to Add the value or give 0 to Stop the calculation");
		while(c==0)
		{
			b1=a1.nextInt();
			System.out.println("Number Entered :"+b1);
			if (b1 > 0)
			{
				System.out.println(a+"*"+b1+"=");
				a*=b1;
				System.out.println(a);
			}
		
			else {
				c=b1;
				return 0;
		
			}
		}
		return 0;


	}public static void main(String[] args) {
		Multiplication c123 =new Multiplication();
		c123.multiplication();
		System.out.println("1.Calculation Menu\n");
		System.out.println("2.Return To Main Menu");
		Scanner sc123=new Scanner (System.in);
		int abc=sc123.nextInt();
		if (abc==1)
		{
			Calculator.main(null);
		}
		
		else if (abc==2)
		{
			Applications ca123=new Applications();
			ca123.methodApp();
			
		}
	}	
	
}


class Division extends Calculator implements Division4{
	static long a=1,b,c=1,b1;
	public int division(){
		Calculator.main(null);
		return 0;
	}

	public static void main(String[] args) {
		Division d123 =new Division();
		System.out.println("1.Calculation Menu\n");
		System.out.println("2.Return To Main Menu");
		Scanner sc123=new Scanner (System.in);
		int abc=sc123.nextInt();
		if (abc==1)
		{
			Calculator.main(null);
		}
		
		else if (abc==2)
		{
			Applications ca123=new Applications();
			ca123.methodApp();
			
		}
	}	
	
}