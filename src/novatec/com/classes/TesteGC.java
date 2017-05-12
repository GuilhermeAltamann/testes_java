package novatec.com.classes;

public class TesteGC {

	public static void main(String[] args) {
		
		System.out.println("Instancias = " + novatec.com.classes.Objeto.getInstacias());
		
		for (int i = 0; i < 10; i++) {
			Objeto o = new Objeto();
		}
		
		System.out.println("Instancias = " + Objeto.getInstacias());
		System.gc();
		System.out.println("Instancias = " + Objeto.getInstacias());
	}
}
