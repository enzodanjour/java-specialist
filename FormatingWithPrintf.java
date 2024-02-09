public class FormatingWithPrintf{
	
	public static void main(String[] args){
	
	String name1 = "Enzo";
	
	
	System.out.printf("Hello, %s%n", name1);//%s add a placeholder, %n break line
	
	int amount = 12;
	System.out.printf("Amount of %d itens%n",amount);//%donly to integer numbers
	
	
	double weight = 938.22;
	System.out.printf("Weight:%10.2f%n",weight);// to float or double use %f .is formating of decimals
	//10. chars before decimals .2 decimals max width 
	
	
	
	}
}
