package novatec.com.engine;

public interface Editavel {
	
	long chave = 0xABCDEF0;
	void editar(String conteudo);
	
	default void limpar(){
		editar("");
	}
}
