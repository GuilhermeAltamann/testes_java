package novatec.com.classes;

public class CriaRet2 {

	public static void main(String[] args) {
		try{
			
		double larg = 10;
		double alt = 2;

		Retangulo2 retangulo = new Retangulo2(larg, alt);

		System.out.println(retangulo);
		}catch(Exception exc){
		
			System.out.println("Erro durante a execucao:\n"+exc);
		}
	}
}
