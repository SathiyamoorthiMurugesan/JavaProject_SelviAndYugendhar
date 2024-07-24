package basicsOfJava;

public class FinalVariable {

	int a = 10;
	static int b = 20;
	
//	final int aa;
	final int aa = 10;

	public static void main(String[] args) {
		
		FinalVariable obj = new FinalVariable();
		int c = 30;
		
		System.out.println(obj.a + " "+ b +" "+ c);
		
		System.out.println(obj.a = 100);
		
		System.out.println(b + 100);
		
		c = c + 100;
		System.out.println(c);
		
		System.out.println(obj.a + " "+ b +" "+ c);
		
		System.out.println(obj.aa);
//		System.out.println(obj.aa = 100);
		
//		obj.aa = obj.aa + 100;

	}

}
