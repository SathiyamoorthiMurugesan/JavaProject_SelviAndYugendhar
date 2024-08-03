package practicePack;

public class ClassAA implements InterfaceBB {

	public void methodAA1() {

	}

	@Override
	public void methodIAA1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodIBB1() {
		// TODO Auto-generated method stub
		
	}

}

interface InterfaceAA {
	public void methodIAA1();
}

interface InterfaceBB extends InterfaceAA {
	public void methodIBB1();
}

interface InterfaceCC {
	public void methodICC1();
}

class ClassBB {
	public void methodBB1() {

	}
}

//class ClassCC implements InterfaceBB, InterfaceCC extends ClassBB{
//	public void methodCC1() {
//
//	}
//
//	@Override
//	public void methodIAA1() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void methodIBB1() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void methodICC1() {
//		// TODO Auto-generated method stub
//		
//	}
//}

class ClassDD extends ClassAA implements InterfaceBB, InterfaceCC {
	public void methodBB1() {
		
	}

	@Override
	public void methodICC1() {
		// TODO Auto-generated method stub
		
	}
}

//class ClassBB extends ClassAA {
//	public void methodBB1() {
//		
//	}
//}
