package novatec.com.engine;

import novatec.com.classes.Forma;
import novatec.com.classes.Retangulo4;
import novatec.com.classes.Triangulo;

public class InstanceOf {

	public static void main(String[] args) {

		Object obj = new Triangulo(1.5, 1.5, 2.0);// cria triangulo
		System.out.println(obj);// exibe info

		// verifica de quem obj e instancia...

		System.out.printf("%s instancia de Triangulo.\n", obj instanceof Triangulo ? "é" : "não é");

		System.out.printf("%s instancia de Retangulo.\n", obj instanceof Retangulo4 ? "é" : "não é");

		System.out.printf("%s instancia de Forma.\n", obj instanceof Forma ? "é" : "não é");
		
		System.out.printf("%s instancia de Object.\n", obj instanceof Object ? "é" : "não é");
		
		System.out.printf("%s instancia de Runnable.\n", obj instanceof Runnable ? "é" : "não é");
	}
}
