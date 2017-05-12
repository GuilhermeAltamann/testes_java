package novatec.com.classes;

public class CriaRet1 {

	public static void main(String[] args) {
		double larg = 10;
		double alt = 2;

		Retangulo retangulo = new Retangulo(larg, alt);

		System.out.println("Retangulo[" + retangulo.getLargura() + " x " + retangulo.getAltura() + "]");

	}
}
