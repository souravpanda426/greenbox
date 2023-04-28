package mypackage;

public class PalindromeString {
	
	
	public static void main(String[] args) {
		
		String x = "MADAM";
		StringBuffer s = new StringBuffer(x);
		StringBuffer reverse = s.reverse();
		String y = reverse.toString();
		System.out.println(x.equals(y));
		
	}

}
