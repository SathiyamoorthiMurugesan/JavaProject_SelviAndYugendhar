package stringMethodsPractice;

public class ToStringAndToCharArrayAndFormatAndRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Return a string's value:
		String myStr = "Hello, World!";
		System.out.println(myStr.toString());
		
//Convert a string to a char array:		
		char arr[]=myStr.toCharArray();
		System.out.println(arr[7]);
		
		
//repeat() method with the number of counts we want to repeat the string.		
		int count =3;
		
		System.out.println(myStr.repeat(count));
		
	}

}
