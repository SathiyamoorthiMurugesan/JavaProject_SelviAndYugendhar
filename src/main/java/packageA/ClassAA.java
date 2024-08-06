package packageA;

public class ClassAA extends ClassA {

	public int ff = 60;
	private int gg= 90;
	char ch = 'g';
	protected String str = "Hello";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				ClassAA objaa = new ClassAA();
				ClassA obja = new ClassA();
				System.out.println("Using class ClassA object ");
				System.out.println(obja.a);
				System.out.println(obja.c);
				System.out.println(obja.d);
				System.out.println("Using class ClassAA object ");
				System.out.println(objaa.ch);
				System.out.println(objaa.ff);
				System.out.println(objaa.gg);
				System.out.println(objaa.str);
				
	}

}
