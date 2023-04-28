package mypackage;

public class ArraysProgram {

	public static void main(String[] args) {
		

		String[] st = {"Exe","orange","apple","bad"};
		for(int i =0 ; i<st.length ; i++) {
			
			if(isfirstAndLastWordsEqual(st[i])) {
				
				
			
			System.out.println(st[i]);
			
			
		}
		
		
		
		
		}		
			
		}
	
	public static boolean isfirstAndLastWordsEqual(String x) {
		
		char charAt = x.charAt(0);
		String firstword = "" +charAt;
		char charAt2 = x.charAt(x.length()-1);
		String lastword = ""+charAt2;
		return firstword.equalsIgnoreCase(lastword);
		
		
		
		
		
	}
	

	}


