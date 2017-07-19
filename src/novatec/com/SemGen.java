package novatec.com;

import java.util.ArrayList;
import java.util.List;

public class SemGen { // Classe não usa genéricos

	public static void main(String[] args) {
		
		// cria lista genérica
		List num = new ArrayList();
		
		num.add(new Integer(10)); // adiciona Integer
		num.add(new Integer(20));
		
		// uso inconsistente não gera erros
		num.add(new String("qualquer coisa"));
		
		int tot = 0;
		
		tot += ((Integer) num.get(0)).intValue(); // uso de coerção
		tot += ((Integer) num.get(1)); // autoinboxing
		
		System.out.println("tot =" + tot);
	}
}
