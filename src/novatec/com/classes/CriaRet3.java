package novatec.com.classes;

public class CriaRet3 {

	public static void main(String[] args) {
		try{
			
		double larg = 10;
		double alt = -2;

		Retangulo3 retangulo = new Retangulo3(larg, alt);

		System.out.println(retangulo);
		}catch(ArrayIndexOutOfBoundsException exc){
		
			System.out.println("Numero insuficientes de argumentos");
		}catch(NumberFormatException exc){
		
			System.out.println("Argumento(s) Invalido(s)");
		}
		catch(Exception exc){
		
			System.out.println("Dimensoes invalidas");
		}
	}
}
