package stringMethodsPractice;

public class StringReplace {


	String a = "Pine apple";
	String b = " Jashwanth ";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReplace obj =new StringReplace();
		obj.methodReplace(obj.a);
		obj.methodReplace(obj.b);
	}
public void methodReplace(String abc) {
	
	StringReplace obj =new StringReplace();
	System.out.println(abc.replace('a', 'f'));
}
}
