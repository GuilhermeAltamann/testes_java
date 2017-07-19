package novatec.com.classes;

public class UsaCheckers {

	public static void main(String[] args) {

		Checker<Boolean, Double> checker1 = new LessThanChecker();

		System.out.println("10.0 < 4.5 = " + checker1.check(10.0, 4.5));

		Checker<Double, Integer> checker2 = new Checker<Double, Integer>() {
			@Override
			public Double check(Integer left, Integer right) {
				return (left + right) / (double) left;
			}
		};

		int x = 8, y = 4;

		System.out.println(x + " ? " + y + " = " + checker2.check(x, y));
	}
}
