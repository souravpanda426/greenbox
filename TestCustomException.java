package mypackage;

import java.util.Scanner;

public class TestCustomException {
	
	static void validateAge(int age)throws InvalidAgeException{
		
		if(age<18) {
			
			throw new InvalidAgeException("not elugible to vote");
		}
		
		else {
			
			System.out.println("eliegible to vote");
		}
		
		
		
		
		
	}
	
	public static void main(String[] args) throws InvalidAgeException {
		
		try {
		Scanner s = new Scanner(System.in);
		System.out.println("enyer age");
		int nextInt = s.nextInt();
		validateAge(nextInt);
		
		
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
