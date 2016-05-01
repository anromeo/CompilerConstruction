package pass;

public class ArityParameter {

    public int callThis() {
        int i = addAllNumbers(1, 3, 4);
    }

	public int addAllNumbers(int ... args) {
        int sum = 0;
		for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
