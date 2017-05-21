package novatec.com.engine;

import java.util.Arrays;

public class SortableObjectArray implements Sortable{
	
	protected Object[] array;
	
	public SortableObjectArray(){ this(10);}
	
	public SortableObjectArray(int tam){ this.array = new Object[tam];}
	
	public void sort(){Arrays.sort(this.array);}
	
	public Object get(int index){return this.array[index];}
	
	public void set(int index, Object value){this.array[index] = value;}
	
	@Override
	public String toString(){
		return Arrays.toString(this.array);
	}
}
