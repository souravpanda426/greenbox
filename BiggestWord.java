package mypackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class BiggestWord {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("enter the line");
		String nextLine = s.nextLine();
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for(String st:nextLine.split(" ")) {
			
			hm.put(st,st.length());
		}
		
		
		for(String st:hm.keySet()) {
			
			if(hm.get(st)==Collections.max(hm.values())) {
				
				System.out.println(st);
			}
		}
		
		
	}

}
