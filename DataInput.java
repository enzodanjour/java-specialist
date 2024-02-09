import java.util.Scanner;

public class DataInput{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.printf("Hi, %s!%n",name);
	
		System.out.print("Write your weight:");// print make a sequence logical to my code
		int weight = input.nextInt();
	
		System.out.print("write your height");
		double height = input.nextDouble();
		
		input.nextLine();
		
		System.out.printf("Write your name:");
		String name = input.nextLine();
		
		double imc = weight / (height * height);
		
		System.out.printf("IMC of %s: %.2f%n",name,imc);
		
		
		
	}
}
