package novatec.com;

import java.util.ArrayList;
import java.util.List;

public class ComGen {
	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(new Integer(10));
		num.add(20);
		
		int tot = 0;
		tot += num.get(0).intValue();
		tot += num.get(1);
		
		System.out.println("tot=" + tot);
	}
}
