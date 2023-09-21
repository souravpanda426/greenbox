package mypackage;

public class OnlyNumbers {

	public static void main(String[] args) {
		
		System.out.println(isNumbers("123"));

	}

//hello
	
	
	private static boolean isNumbers(String x) {
		
		for (int i = 0; i < x.length(); i++) {
			char ch = x.charAt(i);
			
			if(ch>=0 & ch<=47) {
				
				return false;
			}
			
			else if(ch >= 58 & ch<=128) {
				return false;
			}
			
			
		}
		return true;
		
		
	}
}
