package novatec.com.engine;

import novatec.com.classes.Circunferencia;
import novatec.com.classes.Forma;
import novatec.com.classes.Retangulo4;
import novatec.com.classes.Triangulo;

public class TestaFormas {
	
	public static void main(String[] args) {
		
		Circunferencia c = new Circunferencia(1.5);
		System.out.println("areaCirc = " + c.area());
		Retangulo4 r = new Retangulo4(2.5, 4.0);
		System.out.println("areaRet = " + r.area());
		Forma formas[] = new Forma[3];
		formas[0] = c;
		formas[1] = r;
		formas[2] = new Triangulo(1.0,2.0,2.0);
		
		for(int i=0; i<formas.length; i++){
			
			System.out.println(formas[i]);
			System.out.println("area = " + formas[i].area());
		}
		
	}
}
