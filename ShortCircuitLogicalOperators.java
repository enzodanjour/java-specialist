public class ShortCircuitLogicOperators{
	public static void main(String[] args){
		int x =10;
		int y =20;
		
		// boolean result = x == 15 && y++ ==20;// the first step is analyzed pos fixed increment, short circuit
		// boolean result = y++ ==20 && x == 15; y == 21 after this and result is false
		
		boolean result = x == 10 || y++ ==20;
		
		
		System.out.printf(result);
		System.out.printf(y);
		
		
	}
}
