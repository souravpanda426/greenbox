package mypackage;

import java.util.Scanner;

public class Digits {


	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the String");
		String x = s.next();
		int numberOfDigits = getNumberOfDigits(x);
		System.out.println(numberOfDigits);



	}


	public static int getNumberOfDigits(String x) {

		int sum=0;

		for(int i=0;i<x.length();i++) {

			char ch = x.charAt(i);
			if(ch>=48 & ch<=57) {
				sum = sum +(ch-48);
			}



		}
		return sum;
	}
}
