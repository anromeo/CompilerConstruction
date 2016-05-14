package pass;

public class For {
  public int countWithFor(int testInt) {
      int j = 0;
      for (int i = 0; i < testInt; ++i) {
          j = j + 1;
      }
      return j;
  }

  public int multiplyBy10(int testInt) {
      int j = 0;
      for (int i = testInt; i > 0; i--) {
          j += 10;
      }
      return j;
  }

  public int factorial(int testInt) {
      int j = 0;
      for (int i = 0; i <= testInt; ++i) {
          j += i;
      }
      return j;
  }

}
