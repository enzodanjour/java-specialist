import java.util.Scanner;

public class Holerite{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		
		System.out.printf("Digite seu nome: ");
		String name = in.nextLine();
		
		
		System.out.printf("Digite seu valor por hora: ");
		double valueHour = in.nextDouble();
		
		
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		int workedHours = in.nextInt();
		
		double totalAmount = workedHours * valueHour;
		
		System.out.print("Digite valor dos débitos: ");
		double debtQtd = in.nextDouble();
		
		double  debtFreeValue =totalAmount - debtQtd;
		System.out.printf("Folha de pagamento: %s%n%d x R$ %.2f = R$ %.2f%nDescontos: %.2f%nTotal devido: R$ %.2f%n ",name,workedHours,valueHour,totalAmount,debtQtd,debtFreeValue);
		
		//
		// 
	}

}
