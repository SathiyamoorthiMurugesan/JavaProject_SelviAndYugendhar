package practicePack;

public interface InterfaceA {
	
	public void methodIA1();
	
//	public static void methodIA2();

}

interface InterfaceB extends InterfaceA {
	
	public void methodIB1();
	
}
//Multi-level inheritance
interface InterfaceC extends InterfaceB {
	public void methodIC1();
}

//Multiple Inheritance using Interfaces 
interface InterfaceD extends InterfaceA, InterfaceB, InterfaceC {
	
}
