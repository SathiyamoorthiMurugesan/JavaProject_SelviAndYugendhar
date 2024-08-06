package InterfacePractice;

public interface InterfaceOne {

 public void bodyLessMedthod1() ;

 void bodyLessMethod2();
 
 public static void bodyMethod1() {
	 
	 System.out.println("BodyMethod1 from InterfaceOne");
 }
 
 static void bodyMethod2() {
	 System.out.println("BodyMethod2 from InterfaceOne");
 }
 
 static public int ruleNumberOne() {
	  
	 System.out.println("int ruleNumberOne from InterfaceOne");
	return 0;
}
 
 static public String ruleNumberTwo() {
	  
	 System.out.println("String ruleNumberTwo from InterfaceOne");
	return null;
}
 
}
