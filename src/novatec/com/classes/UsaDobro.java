package novatec.com.classes;

public class UsaDobro {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		// uso de metodo estatico da classe Dobro sem instancia
		System.out.println("No Instancias de Dob]bro = " + Dobro.getInstancias());
		
		// declara e inicializa variavel inteira com valor arbitrario
		int x = 7;
		
		System.out.println("Instanciando objeto Dobro");
		Dobro d = new Dobro(); // instanciacao
		
		// uso de metodos estaticos e nao estaticos de classe Dobro
		System.out.println("No Instancias de "+ x +" = " + d.getInstancias());
		System.out.println("O dobro de "+ x + " = " + d.dobro(x));
		System.out.println("Ultimo valor usado: " + d.ultimoValor);
		
	}
}
