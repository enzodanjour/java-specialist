public class TicketMedio {
	public static void main(String[] args) {
		int primeiraVenda = 20;
		int segundaVenda = 30;
		int terceiraVenda = 100;
		
		int totalVendas = primeiraVenda + segundaVenda + terceiraVenda;
		int mediaVendas = totalVendas / 3;
		
		System.out.println("o total de vendas foi:\nR$" + totalVendas +"\na média das vendas foi:\nR$"+mediaVendas);
	}
}
