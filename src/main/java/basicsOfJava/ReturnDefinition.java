// * When a variable or object is created inside a method, its belong to the method. No other method can use it.
// * So, whenever we have a method with return type, it does some work and give us something back
//		These methods or variable's visibility ends once the holding method get executed. In order to use the variable's 
//		value outside the method, we have return type concepts.
// * Whenever we use a return type in a method, store method's returned value in a respective variable and use that variable wherever we want to use the method.
// * Whenever there is return type mentioned, at the end of method, we need to use "return" keyword, after that we should not be writing anything
//   		* means, return should be always at end of the methods 
// * Return type can be anything such as Interface, Class, primitive and non-premitive data type such as String and Array, Collections and Object too
// * Either we can directly use the method in some other method or we assign method's return type to respective variable
// * Return keyword can have exact return type or its variable name
//	* Parameters can be methods with return type too
// * If a method have return type, we can consider that method as that data type itself.
//	* means whatever calculation or manipulation we do on that data type, we can do it on the method
	
package basicsOfJava;

public class ReturnDefinition {

	static String zz;
	static String abc = "20";

	public static void main(String[] args) throws InterruptedException {
		System.out.println(zz);
		ReturnDefinition test = new ReturnDefinition();
//		String val = "200";
		String val = test.methodWithReturnType();
		zz = test.methodWithReturnType();
		System.out.println(zz);
		test.method1();
		test.method2();
		
		int aa = test.method3(100);
		System.out.println(aa);
		
		int bb = test.method4(100);
		System.out.println(bb);
		
		System.out.println(test.method4(100));

	}

	public String methodWithReturnType() {
		String test = "Sathya";
		System.out.println(test);
		
//		return null;
//		return "";
//		return "  ";
//		return abc;
//		return "Sathya";
		return test;
//		return "Hello";
//		System.out.println("Abc");
	}

	public void method1() {
		String xx = methodWithReturnType();
		System.out.println(methodWithReturnType());
		System.out.println(xx);
		System.out.println(zz);
//		doing some other work in this method by getting the value from the above method
//		method1 just want the value from "method with return type method". 
//		so method1 not worrying about what happening inside "method with return type method".
	}

	public void method2() {
//		String yy = methodWithReturnType();
		System.out.println(zz);
	}

	public Object methodWithReturnTypeAsObject() {
		ReturnDefinition test = new ReturnDefinition();
		Object obj = null;
//test.
		return obj;
//		return test;
	}

	public int method3(int a) {

		return 30;
	}
	
	public int method4(int ab) {
		
		return ab;
	}
	
	public int method5(int abc) {
//		int test = abc;
		int test = 10;
		
		return test;
//		return abc;
	}
	
	int test;
	public int method6(int aa) {
		
		test = aa;
		return test;
	}
	
	public String method7(int aa) {
		String testName = "Sathya";
		return testName;
	}

}
