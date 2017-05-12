package novatec.com.classes;

import java.util.Scanner;

public class UsaConversores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite temperatura celsius: ");
		
		double tempC = sc.nextDouble();
		
		sc.close();
		
		CelsiusKelvin ck = new CelsiusKelvin();
		
		System.out.println("\n ck: " + ck);
		
		double tempK = ck.converter(tempC);
		
		System.out.println("\n tempK = "+ tempK + "K");
		
		KelvinCelsius kc = new KelvinCelsius();
		
		System.out.println("\n kc: "+ kc);
		
		tempC = kc.converter(tempK);
		
		System.out.println("\n tempC = " + tempC + "C");
	}
}
