package sampleprograms;

public class ReverseString {

	public static void main(String[] args) {
	
		
		String x = "Enginner";
		String newString = "";
		for (int i = x.length()-1; i>=0; i--) {
			char ch = x.charAt(i);
			newString = newString+ch;
			
			
		}
		
		System.out.println(newString);

	}

}
