package stringMethodsPractice;

public class StringSplitAndJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fruits = String.join(" ", "Orange", "Apple", "Mango");
		System.out.println(fruits);
		
		String basket = String.join(fruits, "Cake");
		System.out.println(basket);
		
		String myStr = "Split a string by spaces, and also punctuation.";
		String regex = "[,\\.\\s]";
		String[] myArray = myStr.split(regex);
		for (String s : myArray) {
		  System.out.println(s);
		}
	}

}
