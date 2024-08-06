package abstractPractice;

public class TestClass2 extends AbstractClass1 {

	public static void bodyMethod4() {
		System.out.println("Test class2 body method 4");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClass2 obj = new TestClass2();
		obj.bodyMethod1();
		obj.bodyMethod2();
		
		obj.bodyLessMethod1();
		obj.bodyLessMethod2();
		
		obj.bodyMethod4();
		
		TestCalss1 obj1 =new TestCalss1();
		obj1.bodyLessMethod1();
		obj1.bodyMethod3();
		
		bodyMethod4();
		
	}

	@Override
	public void bodyLessMethod1() {
		// TODO Auto-generated method stub
		System.out.println("Interface1 bodyless method by testClass2");
	}

	@Override
	public void bodyLessMethod2() {
		// TODO Auto-generated method stub
		System.out.println("InAbstract class bodyless method by testClass2");
	}

}
