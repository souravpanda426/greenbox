package sampleprograms;

import java.util.Scanner;

public class ReverseNumber {
	
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int x = s.nextInt();
		String reverseNumber = reverseNumber(x);
		System.out.println(reverseNumber);
		
		
		
		
		
	}
	
	
	private static String reverseNumber(int x) {
		
		
		String y = "";
		
		
		while(x!=0) {
			
			int r = x%10;
			y = y+ r;
			x=x/10;
			
		}
		return y;
		
		
		
		
	}
	
	
	
	
	

}
