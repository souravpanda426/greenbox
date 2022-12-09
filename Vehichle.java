package mypackage;

import java.util.Scanner;

public class Vehichle {
	
	
	public static void speedOfvehichle(int speed) throws SpeedlimitException {
		
		if(speed>100) {
			
			throw new SpeedlimitException();
			
		}
		else {
			
			System.out.println("speed within range");
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) throws SpeedlimitException {
		
		
		try{Scanner s = new Scanner(System.in);
		System.out.println("enter the speed");
		int x = s.nextInt();
		
		speedOfvehichle(x);
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	}

}
