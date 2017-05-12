package novatec.com.classes;

public class Retangulo4 extends Forma{
	
	public Retangulo4(double altura, double largura) {
		super(2);
		this.setMedida(0, altura);
		this.setMedida(1, largura);
	}
	
	public double perimetro(){
		return 2*(this.getMedida(0)+this.getMedida(1));
	}

	@Override
	public double area() {
		
		return this.getMedida(0)*this.getMedida(1);
	}
	

}
