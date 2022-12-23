package mypackage;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class DeseilizableDate {
	
	
	DeseilizableDate() throws IOException, ClassNotFoundException{
		
		Date d;
		
		FileInputStream fi = new FileInputStream("date.rtf");
		ObjectInputStream oop = new ObjectInputStream(fi);
		d =  (Date)oop.readObject();
		oop.close();
		System.out.println(d);
		
		
		
		
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		new DeseilizableDate();
	}

}
