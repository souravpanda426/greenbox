package mypackage;

public class ReverseSentence {

	public static void main(String[] args) {
		String s = " RAMA AND LAXMANA ";
		String st = " ";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			int k = i;
			while(i<ch.length & ch[i]!= ' ') {
				
				i++;
			}
			int j = i-1;
			
			while(k<=j) {
				st = st+ ch[j];
				j--;
				
				
			}
			
			if(i<ch.length) {
				st = st+ ch[i];
			}
		}
		
		System.out.println(st);

	}

}
