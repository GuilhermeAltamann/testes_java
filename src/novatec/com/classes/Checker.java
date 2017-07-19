package novatec.com.classes;
public interface Checker<R, T> {

	R check(T left, T right);
}
