package stringMethodsPractice;

public class StringIsEmptyMedthod {

	String a = "Selvi";
	String b = " Jashwanth ";
	String c = "Naveen Kumar";
	String d ="";
	String e =" ";
	String f =null;
	String g="null";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		How to check a String is empty or not
		StringIsEmptyMedthod obj = new StringIsEmptyMedthod();
		obj.methodIsEmpty(obj.a);
		obj.methodIsEmpty(obj.b);
		obj.methodIsEmpty(obj.c);
		obj.methodIsEmpty(obj.d);
		obj.methodIsEmpty(obj.e);
		obj.methodIsEmpty(obj.f);

	}

	
	
	public boolean methodIsEmpty(String abc) {
		
			System.out.println(abc.isEmpty());
		return abc.isEmpty();
		
		
	}
}
