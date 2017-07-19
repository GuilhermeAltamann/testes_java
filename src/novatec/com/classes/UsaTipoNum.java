package novatec.com.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsaTipoNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<TipoNum<String>> lista = new ArrayList<TipoNum<String>>();
		while (true) {
			
			System.out.println("Digite um nome (. finaliza): ");
			String nome = sc.next();
			if(nome.equals(".")) break;
			System.out.println("Digite um numero: ");
			int id = sc.nextInt();
			lista.add(new TipoNum<String>(id, nome));
		}
		
		sc.close();
		
		for(TipoNum<String> el: lista){
			
			System.out.println("#" + el.getId() + ": " + el.getValor());
		}
	}
}
