package collectionAndSets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentExam {

	static ArrayList<Integer> rollNum=new ArrayList<Integer>();
	static ArrayList<String> name=new ArrayList<String>();
	static ArrayList<Integer> english=new ArrayList<Integer>();
	static ArrayList<Integer> tamil=new ArrayList<Integer>();
	static ArrayList<Integer> maths=new ArrayList<Integer>();
	static ArrayList<Integer> science=new ArrayList<Integer>();
	static ArrayList<Integer> social=new ArrayList<Integer>();
	
	public static void classStudents()
	{
		rollNum.add(1001);
		rollNum.add(1002);
		rollNum.add(1003);
		rollNum.add(1004);
		rollNum.add(1005);
		name.add("SathyaMoorthi Muregaesn");
		name.add("Selvi murugan");
		name.add("Rishi varadhrajan");
		name.add("Selvamani");
		name.add("Lokesh Kanagaraj");	
	
		
		

	}
	
	
	
	public static void main(String[] args) {
		classStudents();
		
		
		System.out.println("1.List Students");
		System.out.println("2.Add Marks for a Student");
		System.out.println("3.List All Subject marks");
		System.out.println("4.Scarch name with roll num");
		System.out.println("5.delete all the list");
		System.out.println("Enter your Choice");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
		{
			int k=rollNum.size();
			Object[] name1=name.toArray();
			Object[] rollNum1=rollNum.toArray();
			listStudents(name1,rollNum1);
			
		}
		
		else if(n==2)
		{
			Object[] name1=name.toArray();
			Object[] rollNum1=rollNum.toArray();
			listStudents1(rollNum1,name1);
		}
		else if(n==3)
		{
			listmarks(rollNum,name,english,tamil,maths,science,social);
			
		}
		else if(n==4)
		{
			
			System.out.println(" Enter the Roll number : ");
			int roll1=sc.nextInt();
			if(rollNum.contains(roll1))
			{
				System.out.println(name.get(rollNum.indexOf(roll1)));
				main(null);
			}
			else {
				System.out.println("invalid number ");
				main(null);
			}

		}
		
		else if(n==5)
		{
			rollNum.clear();
			name.clear();
			english.clear();
			tamil.clear();
			maths.clear();
			science.clear();
			social.clear();
		}
		
		
		

		
		
	}
	public static void listStudents(Object [] roll,Object[] name)
	{
		System.out.println("Students List ");
		System.out.println("************************");
		for(int i=0;i<roll.length;i++)
		{
			System.out.println(i+1+"."+"+Reg_no: "+roll[i]+"  Student Name: "+name[i]);
		}
		
		
		
		
	}
	public static void listStudents1(Object [] roll,Object[] name)
	{
		System.out.println("Students List ");
		System.out.println("************************");
		for(int i=0;i<roll.length;i++)
		{
			System.out.println(i+1+"."+"Reg_no: "+roll[i]+"  Student Name: "+name[i]);
		}
		
		
		addmarks();
		
	}
	public static void addmarks()
	{

		System.out.println("Enter the Roll number: ");
		Scanner sc=new Scanner(System.in);
		int roll=sc.nextInt();
		int eng,tam,math,sci,soc;
		if(rollNum.contains(roll))
		{
			System.out.print("Enter the mark for English");
			eng=sc.nextInt();
			english.add(eng);
			System.out.print("Enter the mark for Tamil");
			tam=sc.nextInt();
			tamil.add(tam);
			System.out.print("Enter the mark for Maths");
			math=sc.nextInt();
			maths.add(math);
			System.out.print("Enter the mark for Science");
			sci=sc.nextInt();
			science.add(sci);
			System.out.print("Enter the mark for Social");
			soc=sc.nextInt();
			social.add(soc);
			
	 
		}
		else {
			System.out.println("Invalid roll number ");
			System.out.println("please enter vaild roll number");
			addmarks();
		}
		System.out.println("marks added");
		main(null);

}
	public static void listmarks(ArrayList<Integer> roll, ArrayList<String> name,ArrayList<Integer> eng,ArrayList<Integer>tam,ArrayList<Integer>math,ArrayList<Integer> sci,ArrayList<Integer> soc)
	{
		
		System.out.println("**************************************************");
		
		for (int i=0;i<eng.size();i++)
		{
			System.out.println("Roll Num: "+roll.get(i)+" Name :"+name.get(i));
			System.out.println("English: "+eng.get(i));
			System.out.println("Tamil : "+tam.get(i));
			System.out.println("Maths : "+math.get(i));
			System.out.println("Science : "+sci.get(i));
			System.out.println("Social : "+soc.get(i));
			System.out.println("**************************************************");
		}
		main(null);
		
		
	}
}