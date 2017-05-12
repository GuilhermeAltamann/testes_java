package novatec.com;

public class ExemploTryCatch {
	
	public static void main(String[] args) {
		
		int j = 5;
		try { // monitora eventuais problemas
			// converter 1º argumento em inteiro
			
			j = Integer.parseInt(args[0]);
			
			while(j >= 0){
				
				System.out.println(j);
				j--;
			}
			
		} catch (ArrayIndexOutOfBoundsException e1) {// sinaliza problemas encontrados
			
			System.out.println("Argumento nao foi dado.");
			
		} catch (NumberFormatException e2) {// sinaliza problemas encontrados
			
			System.out.println("Argumento nao e um inteiro.");
			
		}finally {
			
			while(j >= 0){
				
				System.out.println(j);
				j--;
				
			}	
		}
	}
}
