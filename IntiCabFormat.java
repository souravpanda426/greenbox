package mypackage;

public class IntiCabFormat {
	
	public static void main(String[] args) {
		
		
		String st = "i love to have icecream";
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			if(i==0 & ch[i]!= ' ' || ch[i]!=' '& ch[i-1]==' ') {
				if(ch[i]>='a'& ch[i]<='z') {
					
					ch[i]=(char) (ch[i]-32);
				}
			}
			
		}
		
		System.out.println((ch));
		
		
	}

}
