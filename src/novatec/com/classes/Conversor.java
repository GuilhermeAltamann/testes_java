package novatec.com.classes;

public class Conversor {

	protected double kProp, kLin;
	
	public Conversor(double kProp, double kLin){
		
		this.kProp = kProp;
		this.kLin = kLin;
	}

	public double getkProp() {
		return kProp;
	}

	public double getkLin() {
		return kLin;
	}
	
	public double converter(double valor){
		
		return valor * this.kProp + this.kLin;
	}

	@Override
	public String toString() {
		
		return "Conversor[kProp=" + this.kProp + ", kLin=" + this.kLin + "]";
	}
}

