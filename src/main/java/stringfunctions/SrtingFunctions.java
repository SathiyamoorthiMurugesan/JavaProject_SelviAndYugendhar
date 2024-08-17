package stringfunctions;

import java.nio.file.spi.FileSystemProvider;

public class SrtingFunctions {

	public static void main(String[] args) {
		
		String str1="Welcome to String operations";
		String str2="   + + + + + @@@@@   @#%$% +++ ";
		String str3="     614656432114    !@#$#$#)#&*$)*%&";
		String str4=str1+str2+str3;
		System.out.println("Length Function - length()");
		System.out.println("Length of the given string : "+str4.length());
				
		System.out.println("\nCharAt Function - charAt(index)");
		System.out.println("printing the paticular index on a string : = "+str4.charAt(0));
		
		System.out.println("\nChecking the given string empty or not using - isEmpty() ");
		
		if(str4.isEmpty())
			System.out.println("Given String is Empty");
		else
			System.out.println("Given String is not Empty");
		String str5="yuga ndhar";
		String str6="yuga";
		String str7="YUGA";
		System.out.println("equal function to compare two strings - equals(String variableName)");
		System.out.println("\nChecking Str5 and str6 as both are equal= "+str5.equals(str6));
//		System.out.println("\nChecking both the string with case str5 is lower but the text is same - str7 is UpperCase it will result pass if str5 & str7 text are same");
		System.out.println("equalsIgnoreCase() -This function used to compare two strings even if both string are same case like lower and another one is upper it will pass");
		
		System.out.println("comparision two diff case string but same text : "+str5.equalsIgnoreCase(str7));
		
		System.out.println("contentEquals()  --- Same as equals");
		System.out.println(str5.contentEquals(str6));
		System.out.println("compareTo() - : "+str5.compareTo(str7));
		System.out.println(str5.compareTo(str6));
		
		
		System.out.println("compareToIgnoreCase = "+str5.compareToIgnoreCase(str5));
		String str8="yu";
		System.out.println("startsWith() = "+str5.startsWith(str8));
		String str9="har";
		String str10="[,\\.\\s ]";
		System.out.println("endsWith() - "+str5.endsWith(str9));
		System.out.println("hashCode() - "+ str5.hashCode());
		System.out.println("indexOf()- "+ str5.indexOf("g"));
		System.out.println("lastIndexOf () - "+str5.lastIndexOf("r"));
		
		System.out.println(str5.concat(str6));
		String[] arr=str5.split(str10);
		for (String a:arr)
		System.out.print(a);
		
		
		
		
		
		
		
		
		
		

	}

}
