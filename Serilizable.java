package mypackage;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

public class Serilizable {
	
	
	public static void main(String[] args) throws IOException {
		
		Student s = new Student(12,"karlos");
		Random r = new Random();
		int nextInt = r.nextInt();
		File f = new File("abc.rtf"+nextInt);
		FileOutputStream fileout = new FileOutputStream(f);
		ObjectOutputStream oop = new ObjectOutputStream(fileout);
		oop.writeObject(s);
		oop.close();
		System.out.println("wrote to file sucessfully");
		
		
	}

}
