package novatec.com;

public class ExemploFor {

	
	public static void main(String[] args) {
		
		int j;
		
		for(j=0; j<10; j++){
			System.out.println(j);
			
		}
		
		// avancado 
		
		double arranjo[] = {1.1964, 6.1995, 7.1931, 12.1968};
		
		System.out.print("[");
		
		int tamanho = arranjo.length;
		
		for(int i = 0; i < tamanho; i++){
			System.out.print(arranjo[i] + " ");
				
		}
		
		System.out.println("] fim");
		
		System.out.print ("for avançado [");
		
		for(double elemento:arranjo){
			System.out.print(elemento + " ");
		}
		
		System.out.println("] fim");
		
		
	}
}
