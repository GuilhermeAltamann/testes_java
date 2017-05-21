package novatec.com.engine;

public class UsaExterna {

	public static void main(String[] args) {
		
		Externa externa = new Externa(10);
		
		Externa.Aninhada aninhada = externa.new Aninhada();
		
		aninhada.exibir();
	}
	
}
