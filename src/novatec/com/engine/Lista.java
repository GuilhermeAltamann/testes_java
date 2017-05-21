package novatec.com.engine;

import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {

		No lista = null; // lista vazia (sem nós)

		Scanner sc = new Scanner(System.in); // prepara console

		String aux;

		do { // laço para solicitação de dado

			System.out.println("Digite uma palavra (. encerra):");

			aux = sc.next();

			if (!aux.equals(".")) {

				No novo = new No(aux, lista);
				lista = novo;
			}

		} while (!aux.equals("."));

		sc.close();
		
		System.out.println("Listac das Palavras:\n");
		
		No no = lista; //variavel auxiliar p/ navegar lista
		
		while (no != null) {
			
			System.out.println(no.nome + "");
			no = no.proximo;
		}
		
		System.out.println("<.>");
	}
}
