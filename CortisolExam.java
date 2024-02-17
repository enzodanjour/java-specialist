import java.util.Scanner;

public class CortisolExam{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		 System.out.println("Input with your cortisol:");
		 
		 double cortisol = input.nextDouble();
		 
		 // idealLevels is between 6 and 18.4
		 
		boolean normalResults = (cortisol >= 6.0 && cortisol <= 18.4);
		
		boolean anormalResults = (cortisol < 6.0 || cortisol > 18.4);
		
		System.out.printf("Your cortisol levels is normal: %b%n", normalResults);
		
		System.out.printf("Your cortisol levels is not normal: %b%n", anormalResults);
		
		
		 
		 
	}
}
