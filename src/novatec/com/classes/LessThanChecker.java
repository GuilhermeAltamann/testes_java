package novatec.com.classes;

public class LessThanChecker implements Checker <Boolean, Double>{
	
	@Override
	public Boolean check(Double left, Double right) {
		
		return left < right;
	}
}
