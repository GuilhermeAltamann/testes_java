package novatec.com.classes;

public class TestaEquals {
	public static void main(String[] args) {
		
		Object a = new Object();
		Object b = new Object();
		Object c = b;
		
		System.out.println("a==b " + a.equals(b) + "\tb==a " + b.equals(a)); // false, false
		System.out.println("c==b " + c.equals(b) + "\tb==c " + b.equals(c)); // true, true,
		System.out.println("c==b " + c.equals(b) + "\tb==c " + b.equals(a)); // false, false
		
		String s = new String("Java");
		
		String t =  "Jand1";
		
		String u = s;
		
		System.out.println("s==t " + s.equals(t) + "\tt==s " + t.equals(s)); // false, false
		System.out.println("s==u " + s.equals(u) + "\tt==s " + u.equals(s)); // true, true
		
		
	}
}
