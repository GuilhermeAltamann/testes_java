package novatec.com.classes;

public class Retangulo2 {

	private double largura, altura;
	
	public Retangulo2 (){
		this(2,1);
	}
	
	public Retangulo2 (double largura, double altura){
		
		this.setTamanho(largura,altura);
	}
	
	public void setTamanho(double largura, double altura){
		
		if(largura >= 0 && altura >= 0){
			
			this.largura = largura;
			this.altura = altura;
		}else{
			
			throw new RuntimeException("Dimensoes invalidas");
		}
		
	}

	public double getLargura() {
		return this.largura;
	}

	public double getAltura() {
		return this.altura;
	}
	
	@Override
	public String toString() {
		
		return "Retangulo2[largura = " + this.largura +", altura = " + this.altura + "]";
	}
	
	
}
