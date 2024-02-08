public class OperadorIncrementoDecremento {
	public static void main(String[] args){
		int totalDownloads = 10;
		
		// totalDownloads = totalDownloads +1;
		
		// totalDownloads +=1;
		
		// totalDownloads++;
		
		// int novoTotalDownloads = totalDownloads++;
		
		int novoTotalDownloads = ++totalDownloads;
		
		int tentativasLogin = 10;
		
		tentativasLogin--;
		
		int novoLimiteTentativasLogin = tentativasLogin--;
		
		
		System.out.println("Total de Downloads"+totalDownloads);
		System.out.println("Novo total de Downloads"+novoTotalDownloads);
		
		System.out.println("Tentativas de login"+tentativasLogin);
		System.out.println("Tentativas de login"+novoLimiteTentativasLogin);
		
	}
}
