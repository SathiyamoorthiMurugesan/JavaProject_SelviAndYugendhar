package stringMethodsPractice;

public class StringConcat {

	String a = "Selvi";
	String b = " Jashwanth ";
	String c = "Naveen Kumar";
	String d = "Hai";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringConcat obj =new StringConcat();
obj.methodCancat(obj.a);
obj.methodCancat(obj.b);
obj.methodCancat(obj.c);
obj.methodCancat(obj.d);
	}
	
	public String methodCancat(String abc) {
		
		StringConcat obj =new StringConcat();
		System.out.println(abc.concat(b));
		
		return abc;
		
	}

}
