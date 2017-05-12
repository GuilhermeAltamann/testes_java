package novatec.com.engine;

public class MensagemImprimivel extends Mensagem implements Imprimivel{
	
	public MensagemImprimivel(String conteudo) {
		super(conteudo);
	}
	@Override
	public void imprimir() {
		
		this.imprimirNoConsole();
	}
	@Override
	public void imprimirNoConsole() {
		
		System.out.println(Imprimivel.INICIO);
		System.out.println(this.getConteudo());
		System.out.println(Imprimivel.FIM);
	}
}
