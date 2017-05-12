package novatec.com.classes;

public class Objeto {

	private static int instancias = 0;
	private int id;

	public Objeto() {

		this.id = instancias++;

		System.out.println("Objeto.Objeto() [id=" + this.id + "]");
	}

	public static int getInstacias() {

		return instancias;
	}

	public int getId() {

		return this.id;
	}

	@Override
	protected void finalize() throws Throwable {

		instancias--;
		System.out.println("Objeto.finalize() [id=" + this.id + "]");
	}

}
