public class CastingTypes {
	
	public static void main(String[] args){
		long x =10;
		
		//int y = x; nao compila
		
		int y = (int) x;// instrução de conversão
		
		System.out.println(y);
		
		System.out.println(x);
		
		long a = 930_000_000_035L;
		
		int b = (int) a;
		
		System.out.println(a);
		System.out.println(b);
		
		// tipos menores para maiores vai automaticamente
		
		int i = 102344;
		
		long ia =(long) i;//instrução de casting é opcional
		
		System.out.println(ia);
		
		double peso1 = 20.5d;
		
		float peso2 = (float) peso1;
		
		System.out.println(peso2);
		
		float taxa1 =934.5f;
		
		double taxa2 = (double) taxa1;
		
		System.out.println(taxa2);
		
		double largura = 100.37;
		int tamanho = (int) largura;//perde precisão
		
		System.out.println(tamanho);
		
	}
}
