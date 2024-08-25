package collectionAndSets;

import java.util.*;

public class StudentMarks {
	static ArrayList<Integer> rollNum=new ArrayList<Integer>();
	static ArrayList<String> name=new ArrayList<String>();
	static ArrayList<String> english=new ArrayList<String>();
	static ArrayList<String> tamil=new ArrayList<String>();
	static ArrayList<String> maths=new ArrayList<String>();
	static ArrayList<String> science=new ArrayList<String>();
	static ArrayList<String> social=new ArrayList<String>();
	
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
		System.out.println("Enter your Choice");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
		{
			int k=rollNum.size();
			listStudents(name,rollNum);
			
		}
		
		
		
		
	}
	public static void listStudents(ArrayList<String>name,ArrayList<Integer>regnum)
	{
		System.out.println("Students List ");
		System.out.println("************************");
		for(int i=0;i<regnum.size();i++)
		{
			System.out.println("Reg_no: "+regnum.get(i)+"  Student Name: "+name.get(i));
		}
	}

}
