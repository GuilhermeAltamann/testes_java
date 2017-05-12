package novatec.com;

import java.util.Scanner;

public class ArranjoForAvancado {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nº de elementos ?");
		int tamanho = sc.nextInt();
		
		assert tamanho > 0;
		
		int arranjo[] = new int[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			
			System.out.println("Elemento[" + i +"]?");
			arranjo[i] = sc.nextInt();
			
		}
		
		sc.close();
		
		int soma = 0;
		
		System.out.print("[ ");
		
		for (int elemento : arranjo) {
			
			soma += elemento;
			System.out.print(elemento + " ");
		}
		
		System.out.println("] soma = " + soma);
	}

}
