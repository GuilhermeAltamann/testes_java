package novatec.com.engine;

public class No {
	
	public String nome;
	public No proximo;
	
	@SuppressWarnings("unused")
	public No(){
		this(null, null); //aciona construtor parametrizado
	}
	
	public No(String n, No p){
		this.nome = n; 
		this.proximo = p;
	}
}
