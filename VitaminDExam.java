import java.util.Scanner;
//Desirable: up to 20
//Risk group: 30 to 60 

public class VitaminDExam {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Risk group: ");
		boolean riskGroup = input.nextBoolean();
		
		System.out.print("Vitamin d:");
		double vitaminD = input.nextDouble();
		
		boolean vitaminDNormal = (!riskGroup  && vitaminD >20) || (riskGroup  && (vitaminD >= 30 && vitaminD <= 60));
		
		System.out.printf("vitamin D level is Normal: %b%n",vitaminDNormal);
		
		
	}
}
