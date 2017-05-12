package novatec.com;

import java.text.DateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class ExemploSwitchString {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("acao:");
		
		String valor = sc.nextLine();
		sc.close();
		
		if(valor.length() > 0){
			
			switch (valor.toLowerCase()) {
			case "data":
				System.out.println(DateFormat.getDateInstance().format(new Date()));
				
				break;
				
			case "hora":
				System.out.println(DateFormat.getTimeInstance().format(new Date()));
				
				break;
				
			case "nova-hora":
				System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
				
				break;				

			default:
				System.out.println("Comando nao reconhecido.");
				break;
			}
			
		}else{
			System.out.println("Digite alguma coisa!!");
			
		}
		
	}

}
