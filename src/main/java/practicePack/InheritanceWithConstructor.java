package practicePack;

public class InheritanceWithConstructor extends A1 {
	
	public InheritanceWithConstructor() {
		super();
		System.out.println("I am the default constructor from Child Class");
	}
	
	public InheritanceWithConstructor(int a) {
//		super();
		super(a);
		System.out.println("I am int parameterized constructor from Child Class");
	}

	public static void main(String[] args) {
//		InheritanceWithConstructor obj = new InheritanceWithConstructor();
//		A1 obj2 = new A1();
		
		InheritanceWithConstructor obj1 = new InheritanceWithConstructor(10);
		
	}

}

class A1 {
	
	public A1() {
		System.out.println("I am the default constructor from Parent Class");
	}
	public A1(int a) {
		System.out.println("I am int parameterized constructor from Parent Class");
	}
}
