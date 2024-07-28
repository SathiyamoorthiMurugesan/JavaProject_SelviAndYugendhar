package basicsOfJava;

public class X2ClassAsAParameterReturnType {

	public static void main(String[] args) {

		X2ClassAsAParameterReturnType obj = new X2ClassAsAParameterReturnType();
		obj.methodA(null);

		ABC obj2 = new ABC();
		obj.methodA(obj2.method1());

		obj.methodA(ABC.method2());

		ABC hello = obj2.method1();
//		hello.a;
		System.out.println(hello.a);

		System.out.println(obj2.method1().a);
		
//		Example for Class as a return type: String class
		
		String str = "Sathya";
		String aaa = str.toLowerCase();
		System.out.println(aaa);
		System.out.println(aaa.toUpperCase());
		
		System.out.println(str.toLowerCase().toUpperCase());
//		System.out.println(str.toLowerCase());
//		System.out.println("sathya".toUpperCase());
//		System.out.println("SATHYA");
		
		
	}

	public void methodA(ABC aaa) {
		System.out.println(aaa);
	}

}

class ABC {

	int a = 10;
	static String str = "Sathya";

	public ABC method1() {
//		a;
//		System.out.println(a);
		System.out.println("I am a non-static method from ABC");
		return null;
	}

	public static ABC method2() {
		System.out.println("I am a static method from ABC");
		return null;
	}
}
