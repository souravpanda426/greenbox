package sampleprograms;

import java.util.Scanner;

public class PrimeNumber {
	
	
	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int x = s.nextInt();
		//System.out.print(isPrime(x));
		if(isPrime(x)) {
			System.out.println("yes prime");
		}
		
		else {
			System.out.println("not prime");
		}
		
		
		
		
		
	}
	
	
	
	
	
	private static boolean isPrime(int x) {
		
		
		int i = 2;
		
		
		while(i<=x/2) {
			
			if(x%i==0) {
				
				return false;
			}
			
			
			i++;
		}
		return true;
	}

}
