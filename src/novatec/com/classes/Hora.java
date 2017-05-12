package novatec.com.classes;

public class Hora {

	private int hor, min, seg;

	public Hora(int hor, int min, int seg) {
	
		this.setHor(hor);
		this.setMin(min);
		this.setSeg(seg);
		
	}
	
//	public void setHorario(int h, int m, int s){
//		
//		this.hor = h;
//		this.min = m;
//		this.seg = s;
//	}
	
	@Override
	public String toString() {
		
		return String.format("%02d:%02d:%02d", getHor(), getMin(), getSeg());
	}


	public int getHor() {
		return hor;
	}


	public void setHor(int hor) {
		
		if(hor >= 0 && hor <= 24){
			
			this.hor = hor;
		}
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		
		if(min >= 0 && min < 60){
			
			this.min = min;	
		}
		
	}


	public int getSeg() {
		return seg;
	}


	public void setSeg(int seg) {
		
		if(seg >= 0 && seg < 60){
			
			this.seg = seg;	
		}
		
	}
	
	
	
}
