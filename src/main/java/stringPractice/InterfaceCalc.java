package stringPractice;

public interface InterfaceCalc {

}

interface Addition1 extends InterfaceCalc{
	public int   addition();

}
interface Subtraction2 extends InterfaceCalc{
	public int  subtraction ();

}
interface Multiplication3 extends InterfaceCalc{
	public int  multiplication();

}

interface Division4 extends InterfaceCalc{
	public int  division();

}

interface InterfaceOddOrEven extends InterfaceCalc{
	public void methodOE();
	
}