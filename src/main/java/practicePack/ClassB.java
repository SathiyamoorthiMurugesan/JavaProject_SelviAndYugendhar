package practicePack;

public class ClassB extends ClassA {
	
	int b1 = 10;
	static int b2 = 20;
	
	public void methodB1() {
		System.out.println("I am a non-static method from ClassB");
	}
	
	public static void methodB2() {
		System.out.println("I am a static method from ClassB");
	}

	public static void main(String[] args) {
		
		methodB2();
		methodA2();
		
		ClassB obj = new ClassB();
		obj.methodA1();
		obj.methodB1();
		
	}
}
