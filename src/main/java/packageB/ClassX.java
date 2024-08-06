package packageB;

import packageA.ClassA;

public class ClassX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ClassA obj = new ClassA();
		
	//	System.out.println(obj.a); int a=10 default variable mentioned in classA can't used here
	//	System.out.println(obj.c); int c= 30 protected variable mentioned in ClassA can't used here
		System.out.println(obj.d);
		
	}

}
