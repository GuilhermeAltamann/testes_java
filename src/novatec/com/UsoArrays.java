package novatec.com;

import java.util.Arrays;
import java.util.Scanner;

public class UsoArrays {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nº de elementos ?");
		
		int  tamanho = sc.nextInt();
		
		System.out.print("Preenchimento real? ");
		double valor = sc.nextDouble();
		
		double arranjo1[] = new double[tamanho];
		
		Arrays.fill(arranjo1, valor);
		
		System.out.println(Arrays.toString(arranjo1));
		
		System.out.println("Posicao inicial da copia? ");
		int de = sc.nextInt();
		
		System.out.println("Posicao final da copia? ");
		int para = sc.nextInt();
		
		double arranjo2[] = Arrays.copyOfRange(arranjo1, de, para);
		double arranjo3[] = Arrays.copyOf(arranjo1, arranjo1.length);
		
		System.out.println("Copia parcial:\n" + Arrays.toString(arranjo2));
		System.out.println("Copia total:\n" + Arrays.toString(arranjo3));
		sc.close();
	}

}
