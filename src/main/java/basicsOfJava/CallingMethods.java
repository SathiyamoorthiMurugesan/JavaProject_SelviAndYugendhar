package basicsOfJava;

public class CallingMethods {

	//

	/*
	 * fsd fdsf fdss fds
	 */

//	fdsfjksjfks
//	fdkfdskjk
//	ytyr
//	jhgjhdf

//	jiooirewo

	/*
	 * fdjkskfskjkfds fdskjfksdj kfdjskfdsfksfkjpoewiroew
	 */
	
//	As of now we only deal with two kind of methods
//	1. static method
//	2. non static method
	
//	withInAClass		static			non-static
//	static 				DIRECT          OBJECT CREATION
//	non-static          DIRECT          DIRECT/OBJECT CREATION

//	  WITH IN A CLASS
//	  1. calling a static method from non-static method - direct call
//	  2. calling a static method from static method - direct call 
//	  3. calling a non-static method from non-static method - direct call/Object creation
//	  4. calling a non-static method from static method - Object creation

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void method1() {
		method2();
//		method3();
		CallingMethods object = new CallingMethods();
		object.method3();
	}

	public static void method2() {
	}

	public void method3() {
	}

	public void method4() {
		method2();
		method3();
//		OR
		CallingMethods object = new CallingMethods();
		object.method3();

	}

	
//	OutsideOfClass		static			   non-static
//	static 				CLASSNAME          OBJECT CREATION
//	non-static          CLASSNAME          OBJECT CREATION

//	Outside class
//	1. calling static method from non static method - using className
//	2. calling static method from static method - using className
//	3. calling non-static method from non-static method - Creating Object
//	4. calling non-static method from static method - Creating Object


}

class ClassA {

	public static void m1() {
//		method2();
		CallingMethods.method2();
		
//		method3();
		CallingMethods object = new CallingMethods();
		object.method3();
	}

	public void m2() {
//		method2();
		CallingMethods.method2();
		
//		method3();
		CallingMethods object = new CallingMethods();
		object.method3();
	}

}
