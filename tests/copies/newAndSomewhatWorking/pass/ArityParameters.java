package pass;

public class ArityParameter {

    public int callThis() {
        //int i = addAllNumbers(1, 3, 4);
        int i = addAllNumbers(1, 3, 4, "HECK YEAH");
        return i;
    }

	public int addAllNumbers(int ... args, String yes) {
        int sum = 0;
		for (int arg : args) {
            sum += arg;
        }
        return sum;
    }
}
