package novatec.com;

public class ExemploContinue {

	public static void main(String[] args) {
		
		int soma = 0; // variavel para armazenar soma
		
		for(int i = 0; i <= 100; i++){
			
			if(i%2 == 0 || i%3 == 0 || i%5 == 0){
				
				System.out.println("i = " + i + " multiplo de 2, 3 ou 5");
				continue;
			}
			// processamento normal para demais casos
			soma = soma + i;
			System.out.println("i = " + i + " soma = " + soma);			
		}

	}
	
}
