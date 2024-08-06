package interfaceObject;

public interface InterfaceObject {
	
	
//	InterfaceObject(){ //Interfaces cannot have constructors
		
//	}
	
	public void methodOne();
	public void methodTwo();
	static void buySoap() {
		System.out.println("buysoap no parameter");
		
	}
	
	static String buySoap(int a) {
		String c =a+"Hello";
		
		System.out.println("buysoap int parameter");
		return c;
		
	}
	
	public static void main(String[] args) {
		
	//	InterfaceObject obj =new InterfaceObject(); //Cannot instantiate the type InterfaceObject
	
		buySoap();
		buySoap(10);
		
	}

}
