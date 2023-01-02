package mypackage;

public class TwoStrings {

	public static void main(String[] args) {
	
		
		String x = "Durga is my favorite good";
		String y = "Durga";
		
		System.out.println(isPresent(x,y));
	
		
			
			
		}
		
		
	private static boolean isPresent(String x,String y) {
		
		for (String st : x.split(" ")){
			
			if(st.equals(y)) {
				return true;
			}
			
			
			
			
		}
		return false;

	}

}
