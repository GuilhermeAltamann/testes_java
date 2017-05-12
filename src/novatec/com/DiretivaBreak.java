package novatec.com;

import java.util.Scanner;

public class DiretivaBreak {

	public static void main(String[] args) {
		// leitura do numero maximo de pares desejados
		
		System.out.println("Maximo no pares ?");
		Scanner s = new Scanner(System.in);
		
		int max = s.nextInt();
		int pares = 0;
		for(int i=0; i<1000; i++){
			
			if(i%2 == 0){
				
				pares++;
				System.out.printf("i = %4d pares %4d%n", i, pares);
			}
			
			if(pares == max){break;}
			
		}
		
		s.close();		
	}
	

	
	
}
