package novatec.com.classes;

public class Triangulo extends Forma{

	public Triangulo(double l1, double l2, double l3) {
		super(3);
		
		this.setMedida(0, l1);
		this.setMedida(1, l2);
		this.setMedida(2, l3);
	}

	@Override
	public double area() {
		
		double sp = (this.getMedida(0) + this.getMedida(1) + this.getMedida(2))/2;
		double aux = sp * (sp-this.getMedida(0))*(sp-this.getMedida(1)*(sp-this.getMedida(2)));
		
		return Math.sqrt(aux);
	}
	

}
