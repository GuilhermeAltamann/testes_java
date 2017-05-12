package novatec.com.classes;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class UsaHora {

	public static void main(String[] args) {

		Calendar calendar = new GregorianCalendar();

		// declara e instancia objeto tipo Hora
		Hora hora = new Hora(calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE),
				calendar.get(Calendar.SECOND));

		System.out.println("Hora: " + hora.toString()); // exige hora

		Scanner sc = new Scanner(System.in); // prepara console

		// le valores de hora,minuto e segundo em variaveis auxiliares
		System.out.println("Horas ? ");
		int h = sc.nextInt();

		System.out.println("Minutes ? ");
		int m = sc.nextInt();

		System.out.println("Segundos ? ");
		int s = sc.nextInt();

		sc.close();

		// ajusta objeto com valores dados
		hora.setHor(h);
		hora.setMin(m);
		hora.setSeg(s);

		System.out.println("Hora: " + hora.toString()); // exibe hora

		if (hora.getHor() >= 18 || hora.getHor() < 6) {

			System.out.println("E noite!");
		} else {

			System.out.println("E dia!");
		}

	}
}
