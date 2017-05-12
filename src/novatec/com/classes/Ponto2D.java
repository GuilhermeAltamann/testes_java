package novatec.com.classes;

public class Ponto2D {

	// campos publicos: nao existem restricoes p/ valores de x e y
	public double x, y;

	// constr. default: ponto definido na origem (0, 0)
	public Ponto2D() {

		this.x = 0;
		this.y = 0;
	}

	// constr. parametrizado: ponto definido na instanciacao
	public Ponto2D(double px, double py) {

		this.x = px;
		this.y = py;
	}
	
	//determina distancia entre instancia e coordenada dada
	public double distancia (double px, double py){
		
		return Math.sqrt(Math.pow(this.x - px, 2) + Math.pow(this.y - py, 2));
	}
	
	//determina distancia ente instancia e ponto dado
	public double distancia (Ponto2D p){
		
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}
	
	//fornece representacao textual dos objetos
	@Override
	public String toString() {
		
		return "Ponto2D [ x=" + this.x + ", y=" + this.y + " ]";
	}
	
	
}
