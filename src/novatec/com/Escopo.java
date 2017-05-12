package novatec.com;

public class Escopo {// Inicio do bloco 0
	
	public static void main(String[] args) {// Inicio do bloco 1
		
		int i = 5;// Variavel do bloco 1
		
		{ // Inicio do bloco 2
			
			int j = 0;// Variavel do bloco 2
			
			System.out.println(i); // Uso do i dentro do seu escopo
			j = 5 * i;// Uso do j dentro do seu escopo
			System.out.println(j);
			{//Inicio do bloco 3
				
				System.out.println(i); // Uso de i dentro do seu escopo
				System.out.println(j); // Uso de j dentro do seu escopo
				
			}
			
		}
		
		System.out.println(i);//Uso de i dentro do seu escopo
	//	System.out.println(j);//ERRO!! Uso de j FORA do seu escopo
	}
}
