package novatec.com.engine;

public interface Imprimivel {
	
	public static final String INICIO = "<inicio>";
	public static final String FIM = "<fim>";
	public abstract void imprimir();
	public abstract void imprimirNoConsole();
}
