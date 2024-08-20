package stringMethodsPractice;

public class ToStringAndToCharArrayAndFormatAndRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Return a string's value:
		String myStr = "Hello, World!";
		String myStr1 = "Hello,%s your package within %d minutes";
		System.out.println(myStr.toString());

//Convert a string to a char array:		
		char arr[] = myStr.toCharArray();
		System.out.println(arr[7]);

//repeat() method with the number of counts we want to repeat the string.		
		int count = 3;

		System.out.println(myStr.repeat(count));

		System.out.println(myStr1.format(myStr1, "Selvi", 2));
//		System.out.println(myStr1.format(myStr1,2,"Selvi"));

	}

}
