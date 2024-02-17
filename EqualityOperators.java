public class EqualityOperators{
	
	public static void main(String[] args){
		// boolean equalNumbers = 10 == 10;
		
		// boolean equalNumbers = (4+6) ==(5*2);
		
		int number1 = 10;
		int number2 = 11;
		
		// boolean equalNumbers = number1== 10;
		
		boolean equalNumbers = number1== number2;
		
		boolean diferentNumbers = !equalNumbers;
		
		//System.out.printf("Equal numbers: %b%n",equalNumbers);
		
		//System.out.printf("Equal numbers: %b%n",number1==number2);
		
		System.out.printf("Diferent numbers: %b%n",diferentNumbers);
		
		String name1 = "Enzo";
		String name2 = "Vitor";
		
		boolean equalNames = name1 == name2;
		
		System.out.prinf("Equal numbers: %b%n",equalNames);
		
		
	}
}
