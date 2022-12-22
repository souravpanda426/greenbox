package mypackage;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Random;

public class SerliziableDate {
	
	
	
	SerliziableDate(){
		Date d = new Date();
		Random r = new Random();
		int nextInt = r.nextInt();
		
		try {
			
			FileOutputStream fout= new  FileOutputStream("date.rtf"+nextInt);
			ObjectOutputStream out = new ObjectOutputStream (fout);
			out.writeObject(d);
			out.close();
			System.out.println("written to file");
			
		}
		catch(Exception e) {
			
		}
		
	}
	
	public static void main(String[] args) {
		
		new SerliziableDate();
		
		
		
	}

}
