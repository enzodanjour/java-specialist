import java.util.Scanner;

public class LeapYearCalculator {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a year");
		
		int year = input.nextInt();
		
		boolean isLeapYear = (year % 400 == 0 ||(year % 4 == 0 && year %100 != 0));
		
		System.out.printf("Is a leap year: %b%n",isLeapYear);
		
	
	}
}
