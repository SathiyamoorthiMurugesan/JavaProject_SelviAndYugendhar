package keyWords;

public class ThisAndSuperAndStaticBlock extends ParentThisAndSuper {

	int a = 20;
	static int b =10;
	String name = "Selvi";
	static String name1="Naveen";
	
	
	static { // can not use this. and super. keywords in static block. 
		//we use obj creation for non static member calling
		System.out.println("Static block started");
		int aa =10;
		ThisAndSuperAndStaticBlock obj =new ThisAndSuperAndStaticBlock();
		obj.a= aa;
		System.out.print(obj.a +" ");
		b=b+11;
		System.out.print(b +" ");
		c =c + 10;
		System.out.print(c+ " ");
		obj.d= aa;
		System.out.print(obj.d + " ");
		
		System.out.print(obj.a + " ");
		
		ParentThisAndSuper obja =new ThisAndSuperAndStaticBlock();
		System.out.print(obja.a + " ");
		obja.method1(); // overriding
		
			}

	
	public void method1() {
		int a=5;
		System.out.println("Child class method1");
		
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main menthod thread started below");
		int aa=15;
		ThisAndSuperAndStaticBlock obj =new ThisAndSuperAndStaticBlock();
		obj.a= aa;
		System.out.print(obj.a +" ");
		b=b+11;
		System.out.print(b +" ");
		c =c + 10;
		System.out.print(c+ " ");
		obj.d= aa;
		System.out.print(obj.d + " ");
		
		System.out.print(obj.a + " ");
		
		ParentThisAndSuper obja =new ThisAndSuperAndStaticBlock();
		System.out.print(obja.a + " ");
		obja.method1(); // overriding
		obja.method2();
		
	}

}

class ParentThisAndSuper{
	
	int a =50;
	static int c =100;
	int d=60;
	public void method1() {
		System.out.println("parent class method1");
		System.out.println(this.a);
	//	System.out.println(super.a);
		System.out.println(a);
	}
	public void method2() {
		int a =d;
		System.out.println("parent class method1");
		System.out.println(this.a);
	//	System.out.println(super.a);
		System.out.println(a);
	}
	
}
