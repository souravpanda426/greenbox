package mypackage;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Samplethree {
	
	
	public static void main(String[] args) throws IOException {
		
		Random r = new Random();
		int nextInt = r.nextInt();
		
		File file = new File("kol.rtf"+nextInt);
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
		
		
	}

}
