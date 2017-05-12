package novatec.com.engine;

public class MensagemEditavel extends Mensagem implements Imprimivel, Editavel{
	
	public MensagemEditavel (String conteudo){
		super(conteudo);
	}
	
	@Override
	public void imprimir() {
		
		this.imprimirNoConsole();
	}
	
	@Override
	public void imprimirNoConsole() {
		
		System.out.println(Imprimivel.INICIO + this.getConteudo() + Imprimivel.FIM);
	}
	
	@Override
	public void editar(String conteudo) {
		
		this.setConteudo(conteudo);
	}
}
