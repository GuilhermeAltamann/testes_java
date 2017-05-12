package novatec.com.classes;
import static java.lang.Math.*;
public class Circunferencia extends Forma{
	
	public Circunferencia (double raio){
		super(1);
		this.setRaio(raio);
	}

	@Override
	public double area() {
		
		return PI*Math.pow(this.getMedida(0), 2);
	}
	
	public void setRaio(double raio){
		
		this.setMedida(0, raio);
	}
}
