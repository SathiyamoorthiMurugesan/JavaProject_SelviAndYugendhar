package practicePack;

//public class ClassA implements InterfaceA {
public class ClassA implements InterfaceD {

	int a1 = 10;
	static int a2 = 20;
	
	public void methodA1() {
		System.out.println("I am a non-static method from ClassA");
	}
	
	public static void methodA2() {
		System.out.println("I am a static method from ClassA");
	}
	
	public static void main(String[] args) {
		methodA2();
		
		ClassA obj = new ClassA();
		obj.methodA1();
		
	}

	@Override
	public void methodIA1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodIB1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodIC1() {
		// TODO Auto-generated method stub
		
	}

	
//	public void methodExe() {
//		methodA2();
//		
////		methodA1();
//		ClassA obj = new ClassA();
//		obj.methodA1();
//	}
}
