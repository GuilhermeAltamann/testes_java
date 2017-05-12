package novatec.com.classes;

public abstract class Forma {
	private double medida[];
	
	public Forma(int numMedidas){
		
		this.medida = new double[numMedidas];
	}
	
	public double getMedida(int i) {
		if(i<0 || i>= this.medida.length){
			throw new RuntimeException("Numero invalido de medida"); 
		}
		
		return this.medida[i];
	}
	
	public int getNumMedidas() { //retorna no. de medidas
		
		return this.medida.length;
	}
	
	protected void setMedida(int i, double m) { // ajusta uma medida
		
		if(i < 0 || i >= this.medida.length){
			
			throw new RuntimeException("Numero invalido de medida");
		}
		
		if(m<0){
			throw new RuntimeException("Medida #" + i + "invalida.");
		}
		
		this.medida[i] = m;
	}
	
	@Override
	public String toString() {
		
		StringBuffer sb = new StringBuffer(getClass().getName());
		sb.append("[medidas:");
		
		for(int i=0; i<this.medida.length-1;i++){
			
			sb.append(this.medida[i]);
			sb.append(",");
		}
		
		sb.append(this.medida[this.medida.length-1]);
		sb.append("]");
		
		return sb.toString();
	}
	
	// metodo abstrato que determinara area
	public abstract double area();
}
