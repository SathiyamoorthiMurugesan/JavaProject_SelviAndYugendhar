package polymorphism;

public class OverRiding extends OverRideParent {

	public void walking() {
		System.out.println("child class walking no parameter");
		
	}
	public int walking(int a) {
		
		System.out.println("child class walking with int parameter");
		return a;
		
	}
	public void running(String name) {
		System.out.println("child class running with string parameter");
		
	}
	
	static public void running (int xyz	) {
		System.out.println("child class static running with int parameter");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRiding obj =new OverRiding();
		obj.walking();
		obj.walking(10);
		obj.running("Hello");
		
		OverRideParent obj1 =new OverRiding();
		obj1.walking(); // overriding 
		obj1.walking23(0);
		obj1.running(null);// overriding
		
		OverRideParent.running(10); // static methods calling using parent class name
		running(90);// child class static method
		
		OverRideParent obj2 =new OverRideParent();
		obj2.walking(); // overriding 
		obj2.walking23(0);
		obj2.running(null);
		
	}

}

class OverRideParent{
	
	public void walking() {
		System.out.println("Parent class walking no parameter");
		
	}
	public int walking23(int a) {
		
		System.out.println("Parent class walking with int parameter");
		return a;
		
	}
	public void running(String name) {
		System.out.println("Parent class running with string parameter");
		
	}
	static public void running (int xyz	) {
		System.out.println("Parent class static running with int parameter");
	}
}