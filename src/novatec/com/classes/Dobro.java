package novatec.com.classes;

public class Dobro {
	
	// armazena numero de instancias da classe
	private static int instancias = 0;
	
	//armazena ultimo valor usado por metodo dobro(int)
	public int ultimoValor;

	// construtor que atualiza no. de instancias
	public Dobro(){
		
		instancias++;	
	}
	
	//calcula o dobro
	public int dobro(int valor){
		
		this.ultimoValor = valor;
		return 2 * valor;
	}
	
	
	public static int getInstancias() {
		return instancias;
	}
	
	

}
