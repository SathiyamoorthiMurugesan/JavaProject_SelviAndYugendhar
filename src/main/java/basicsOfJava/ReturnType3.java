package basicsOfJava;

public class ReturnType3 {
	
	static int returnedValue;
	
	static int soapBalanceAmount;

	public static void main(String[] args) {
		ReturnType3 obj = new ReturnType3();
		obj.method1();
		obj.method2();
		obj.buyRiceUsingSoapBalanceAmount();
		System.out.println("*************");
		obj.buyMilkUsingSoapBalanceAmount();
		obj.buyShampooUsingSoapBalanceAmount();
		System.out.println("&&&&&&&&&&&&&&&&&");
		obj.soapBalanceAmount();
		obj.buyMilkUsingSoapBalanceAmount1();
		obj.buyShampooUsingSoapBalanceAmount2();
		System.out.println("$$$$$$$$$$$");
		
		ReturnType1 obj1 = new ReturnType1();
		soapBalanceAmount = obj1.buySoapAndGiveBalanceAmount(100, 50);
		obj.buyMilkUsingSoapBalanceAmount1();
		obj.buyShampooUsingSoapBalanceAmount2();
	}
	
	public int buySoap() {
		int a = 50;
		return a;
	}
	
	public void method1() {
//		buySoap();
		System.out.println(buySoap());
		System.out.println(returnedValue);
	}
	
	public void method2() {
		int amount = buySoap();
		System.out.println(amount);
	}
	
	public void buyRiceUsingSoapBalanceAmount() {
		ReturnType1 obj1 = new ReturnType1();
		int balanceAmountFromSoap = obj1.buySoapAndGiveBalanceAmount(100, 10);
		System.out.println("Bought rice for "+balanceAmountFromSoap+ " rupees");
	}
	
	public void buyMilkUsingSoapBalanceAmount() {
		ReturnType1 obj1 = new ReturnType1();
		int balanceAmountFromSoap = obj1.buySoapAndGiveBalanceAmount(100, 10);
		System.out.println("Bought milk for "+balanceAmountFromSoap+ " rupees");
	}
	
	public void buyShampooUsingSoapBalanceAmount() {
		ReturnType1 obj1 = new ReturnType1();
		int balanceAmountFromSoap = obj1.buySoapAndGiveBalanceAmount(100, 10);
		System.out.println("Bought shampoo for "+balanceAmountFromSoap+ " rupees");
	}
	
	public void soapBalanceAmount() {
		ReturnType1 obj1 = new ReturnType1();
		 soapBalanceAmount = obj1.buySoapAndGiveBalanceAmount(100, 10);
	}
	
	public void buyMilkUsingSoapBalanceAmount1() {
		System.out.println("Bought milk for "+soapBalanceAmount+ " rupees****");
	}
	
	public void buyShampooUsingSoapBalanceAmount2() {
		System.out.println("Bought shampoo for "+soapBalanceAmount+ " rupees####");
	}
	
	public int method3(int value) {
//		int x = value - returnedValue;
//		return x;
		return returnedValue - value;
	}
	
	public int method4() {
		returnedValue = returnedValue - 50;
		return returnedValue;
		
	}
	
	int amount;
	public void methodWithClassVariableReturnType() {
		System.out.println(amount);//0
		amount = buySoap();
		System.out.println(amount);//50
   	}
	
	public void changeClassVariableValue() {
		System.out.println(amount); //50
		amount = 51;
		System.out.println(amount);
	}
	
	

}
