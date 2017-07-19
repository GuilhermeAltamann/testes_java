package novatec.com.classes;

public class TipoNum<T> {

	private int id;
	private T valor;
	
	public TipoNum (int id, T valor){
		
		setId(id);
		setValor(valor);
	}
	
	public int getId(){ return this.id;}
	public T getValor(){ return this.valor;}
	
	public void setId (int id){
		
		if(id<0) throw new RuntimeException("id<0");
		this.id = id;
	}
	
	public void setValor(T valor){
	
		if(valor == null) throw new RuntimeException("valor==null");
		this.valor = valor;
	}
	
	public void troca (TipoNum<T> p){
		
		T valorAux = p.valor;
		p.valor = this.valor;
		this.valor = valorAux;
	}
}
