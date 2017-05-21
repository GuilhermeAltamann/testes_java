package novatec.com.engine;

public class ExemploEnum1 {

	public enum Opcoes {COMPACTAR, DESCOMPACTAR};
	
	public static void main(String[] args) {
		
		for(Opcoes opcao: Opcoes.values()){ // for avançado
			
			System.out.println(opcao);
		}
	}
}
