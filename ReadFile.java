package mypackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	public static void main(String[] args) throws IOException {
		
		
		
		BufferedReader in = new BufferedReader(new FileReader("kol.rtf1068746642"));
		String story = " ";
		while((story=in.readLine())!=null) {
			System.out.println(story);
			
			
		}
		
	}

}
