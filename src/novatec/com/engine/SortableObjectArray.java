package novatec.com.engine;

import java.util.Arrays;

public class SortableObjectArray implements Sortable{
	
	protected Object[] array;
	
	public SortableObjectArray(){ this(10);}
	
	public SortableObjectArray(int tam){ this.array = new Object[tam];}
	
	public void sort(){Arrays.sort(this.array);}
	
	public Object get(int index){return array[index];}
	
}
