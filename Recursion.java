package mypackage;

public class Recursion {
	
	
	
	public static void printNumbers(int i) {
		
	
		
		if(i<=10) {
			System.out.println(i);
			i++;
			
			printNumbers(i);
			
			
		}
		
		else {
			System.exit(0);
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		printNumbers(0);
	}

}
