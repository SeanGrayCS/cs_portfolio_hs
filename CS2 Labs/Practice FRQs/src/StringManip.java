
public class StringManip {

	public static String removeSpaces(String str) {

		return "";

	}

	public static String reverseString(String str) {

		String result = "";
		int length = str.length();

		if (length == 1) {
			return str;
		}
		
		String s1 = reverseString(str.substring(0, length / 2));
		String s2 = reverseString(str.substring(length / 2));
		result = s2 + s1;

		return result;

	}

	public static void palindromeChecker(String str) {
		
		String strNS = str.replaceAll("\\s+","");
		
		if (strNS.equals(reverseString(strNS))) {
			System.out.println(str + " is a palindrome");
		}
		else {
			System.out.println(str + " is not a palindrome");
		}
		
	}

}
