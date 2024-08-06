package abstractPractice;

public abstract class AbstractClass1 implements Interface1{
	
	public abstract void bodyLessMethod2();
	
	public void bodyMethod1() {
		System.out.println("Abstract class  body method 1");	
	}
	public void bodyMethod2() {
		
		System.out.println("Abstract class  body method 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractClass1 obj = new AbstractClass1() {
			
			@Override
			public void bodyLessMethod1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void bodyLessMethod2() {
				// TODO Auto-generated method stub
				
			}
		};

	}

}
