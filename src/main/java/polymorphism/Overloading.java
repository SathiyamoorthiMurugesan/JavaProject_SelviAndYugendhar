package polymorphism;

public class Overloading {

	
	public void methodCall1() {
		System.out.println("Methodcall1 no parameter");
	}
	public int methodcall1(int a) {
		System.out.println("Methodcall1 with int parameter");
		return a;
		
	}
	public int methodcall1(int a, String name) {
		System.out.println("Methodcall1 int, string parameter");
		return 0;
		
	}
	
	public void methodcall1(int a, String name,int type) {
		
		System.out.println("Methodcall1 int, string, int parameter");
		
	
	}
	
	static public void methodCall1(int x, int y, char n) {
		System.out.println("Static method with int int char parameter");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj =new Overloading();
		obj.methodCall1();
		obj.methodcall1(10);
		obj.methodcall1(2, "name");
		obj.methodcall1(1, null, 3);
		methodCall1(1, 1, 'g');
		

	}

}
