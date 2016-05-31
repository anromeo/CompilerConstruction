package pass;

public class Ternary {
  public int returnProperNumbers(boolean theTest, int returnTrue, int returnFalse) {
	  int answer = theTest ? returnTrue : returnFalse;	  
	  return answer;
  }

  public boolean isLessThan(int number1, int number2) {
    boolean lessThan = true && (number1 < number2) ? true : false;
    return lessThan;
  }

  public boolean isNotWhatYouWant(boolean notMine) {
    boolean notit = !notMine ? true : false;
    return notit;
  }

  public boolean isEqual(int first, int second) {
    boolean notit = first == second ? true : false;
    return notit;
  }

}