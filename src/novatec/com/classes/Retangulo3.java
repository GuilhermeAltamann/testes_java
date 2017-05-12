package novatec.com.classes;

public class Retangulo3 {

	private double largura, altura;
	
	public Retangulo3 () throws Exception{
		this(2,1);
	}
	
	public Retangulo3 (double largura, double altura) throws Exception{
		
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
		
		return "Retangulo2[largura" + this.largura +", altura = " + this.altura + "]";
	}
	
	
}
