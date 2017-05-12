package novatec.com.classes;

public class Retangulo {

	private double largura, altura;
	
	public Retangulo (){
		this(2,1);
	}
	
	public Retangulo (double largura, double altura){
		
		this.setTamanho(largura,altura);
	}
	
	public void setTamanho(double largura, double altura){
		
		if(largura >= 0 && altura >= 0){
			
			this.largura = largura;
			this.altura = altura;
		}
	}

	public double getLargura() {
		return this.largura;
	}

	public double getAltura() {
		return this.altura;
	}
	
	
	
}
