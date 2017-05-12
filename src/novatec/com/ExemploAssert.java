package novatec.com;

import java.util.Scanner;

public class ExemploAssert {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // cria leitor de dados
		System.out.println("Forneca inteiro>9:");
		int valor = sc.nextInt(); // lê valor inteiro
		assert valor > 9; // esperando valor maior que nove
		int soma = 0;
		
		for(int i=1; i<valor; i++){// realiza laço para efetuar soma
			
			soma+=i;
			assert soma < 99:"soma("+ soma + ")>=99"; // esperando soma<99	
		}
		
		System.out.println("soma[1.." + valor + "] =" + soma);
		sc.close();
		
		
	}
}
