public class TiposPrimitivos{
	public static void main(String[] args){
		boolean compraAprovada= true;//atribuição a 0 não é permitida
		
		boolean clienteBloqueado = false;
		
		
		System.out.println(compraAprovada);
		System.out.println(clienteBloqueado);
		
		
		int quantidadeEstoque = 10;
		int quantidadePedidoCompra = 15;
		
		boolean possuiEstoque = quantidadeEstoque >= quantidadePedidoCompra;
		
		System.out.println(possuiEstoque);
		
		// char inicialDoNome = "E"; não compila
		
		char inicialDoNome = 'e';
		char tipoCliente = '2';
		
		System.out.println(inicialDoNome);
		System.out.println(tipoCliente);
		
		
		byte valor = 127;//tamanhoMaximo
		
		System.out.println(valor);
		
		short quantidadeEstoqueTotal = 32767;//valor maximo short
		
		System.out.println(quantidadeEstoqueTotal);
		
		int valorMaximoInt = 2_147_483_647;//melhorar legibilidade
		
		System.out.println(valorMaximoInt);
		
		// long valorDobradoMaximo = 2_147_899_569;// valor inteiro dentro do long
		long valorDobradoMaximo = 2_147_899_569L; // nomero literal do tipo int
		System.out.println(valorDobradoMaximo);	
		
		// Double
		
		double troco = 89.23d;//Deixar mais legível mas é opcinal
		
		System.out.println(troco);
		
		// float
		
		float taxa = 1_294.93F;
		System.out.println(taxa);
		
		// não deve usar float e double para dinheiro
		// BigDecimal é o recomendado
		
		
		
		
		
		
	}
}
