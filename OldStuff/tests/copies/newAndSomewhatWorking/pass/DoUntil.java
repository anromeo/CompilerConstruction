
public class DoUntil {
	public int testDoUntil() {
		int x = 0;
		do {
			x = x + 1;			
		} until(x > 100);
		return x;
	}
}
