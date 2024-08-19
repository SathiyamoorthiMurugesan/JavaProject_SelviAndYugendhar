package stringMethodsPractice;

public class BlankAndEmpty {

	String p = " ";
    String p1 = "";
    String p2 = "selvi";
    String p3 ="null";
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      isBlank() - returns true/false
//      D/B isEmpty() and isBlank():
//        	isEmpty() - Returns true if it is empty(white spaces not included), else false
//        	isBlank() - Returns true if it is blank and also has only white spaces, else false
		BlankAndEmpty obj= new BlankAndEmpty();
		System.out.println("Is empty method");
		obj.methodEmpty(obj.p);
		obj.methodEmpty(obj.p1);
		obj.methodEmpty(obj.p2);
		obj.methodEmpty(obj.p3);
		
		System.out.println("Is blank method");
		obj.methodBlank(obj.p);
		obj.methodBlank(obj.p1);
		obj.methodBlank(obj.p2);
		obj.methodBlank(obj.p3);
	
	}
	
	public boolean methodEmpty(String abc) {
		System.out.println(abc.isEmpty());
		return abc.isBlank();
		
	}

	public boolean methodBlank(String abc) {
		
		System.out.println(abc.isBlank());
		return false;
		
	}
	
}
