package novatec.com.engine;

public abstract class Mensagem {
	
	private String conteudo;
	
	public Mensagem(String conteudo){
		
		this.setConteudo(conteudo);
	}
	
	public String getConteudo(){
		
		return this.conteudo;
	}

	protected void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
}
