package practicePack;

public class ObjectCreationInInheritance extends One {
	
	public void method2() {
		
	}

	public static void main(String[] args) {
//		ObjectCreationInInheritance obj = new ObjectCreationInInheritance();
//		obj.method1();
//		obj.method2();
//		obj.method1A();
//		
//		One obj1 = new One();
//		obj1.method1();
//		
//		One obj2 = new ObjectCreationInInheritance();
//		obj2.method1();
		
//		ObjectCreationInInheritance obj3 = new One();
		
		InterfaceAAA obj4 = new ObjectCreationInInheritance();
		obj4.method1A();
		
//		InterfaceBBB obj5 = new ObjectCreationInInheritance();
		
//		ClassThree obj6  = new ObjectCreationInInheritance();
		
	}

}

class One implements InterfaceAAA{
	
	public void method1() {
		
	}

	@Override
	public void method1A() {
		System.out.println("I am overrided method from interfaceAAA");
	}
}

interface InterfaceAAA {
	public void method1A();
}

interface InterfaceBBB {
	public void method1B();
}

class ClassTwo implements InterfaceAAA {
	
	public void method11() {
		
	}

	@Override
	public void method1A() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main() {
		ClassTwo obj = new ClassTwo();
		obj.method11();
		obj.method1A();
		
		InterfaceAAA obj1 = new ClassTwo();
		obj1.method1A();
		
	}
}

class ClassThree {
	public void method3() {
		
	}
}














