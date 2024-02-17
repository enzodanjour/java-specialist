public class PrecedencyLogicalOperators {
	public static void main(String[] args){
		int x = 10 ;
		int y = 20;
		
		// boolean result = x == 13 && (x ==10 || y ==20);// false
		
		boolean result = (x == 13 && x ==10) || y ==20;//true
		
		System.out.println(result);
	}
}
