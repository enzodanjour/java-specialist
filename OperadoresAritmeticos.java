public class OperadoresAritmeticos {
	public static void main(String[] args) {
		int minhaIdade = 24;
		int suaIdade = 23;
		int idadeJoao = 32;
		
		int totalIdadesPlusJoao = minhaIdade + suaIdade + idadeJoao;
		// adição
		int totalIdades = minhaIdade + suaIdade;
		System.out.println("Soma das idades: " + totalIdades);
		
		// subtração
		int diferencaIdades = minhaIdade - suaIdade;
		System.out.println("Diferença de idades: "+ diferencaIdades);
		
		// multiplicação
		int multiplicacao = 7 * 6;
		System.out.println("multiplicação 7 x 6: " + multiplicacao);
		
		// divisão
		int divisao = 20 /10;
		System.out.println("Divisão 20 / 10: "+divisao);
		
		// Módulo de
		int resto = 20 % 2;
		System.out.println("Resto de 20 % 2: "+resto);
		
		System.out.println("media idades: " + totalIdadesPlusJoao/3);
		
	}
	
}
