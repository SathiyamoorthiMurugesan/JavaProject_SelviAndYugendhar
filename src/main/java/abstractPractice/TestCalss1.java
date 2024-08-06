package abstractPractice;

public class TestCalss1 implements Interface1{

	public void bodyMethod3() {
		System.out.println("Test class1 body method 3");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void bodyLessMethod1() {
		// TODO Auto-generated method stub
		System.out.println("Interface1 bodyless method by TestClass1");
	}

}
