package sampleprograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String next = s.next();
		String newString = "";
		for (int i = next.length()-1; i>=0; i--) {
			char ch = next.charAt(i);
			newString = newString+ch;
			
			
		}
		
		System.out.println(newString);

	}

}
