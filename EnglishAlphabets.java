package mypackage;

public class EnglishAlphabets {


	public static void main(String[] args) {

		String x = "ABCDEFGHabcde";
		int[] count = new int[128];

		for (int i = 0; i < x.length(); i++) {

			char ch = x.charAt(i);

			if(ch>='A'& ch <= 'Z') {


				count[ch]++;


			}
			
			else if( ch >= 'a'& ch<='z') {
				
				count[ch]++;
				
			}

		}
		
		for (int i = 0; i < count.length; i++) {
			
			if(count[i]!=0) {
				System.out.println(count[i]+" "+(char)(i));
			}
			
			
			
		}

	}
}