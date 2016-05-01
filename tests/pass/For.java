package pass;

public class For {
  public int testFor(int testInt) {
      int j = 0;
      for (int i = 0; i < testInt; ++i) {
          j = i + j;
          // if (j == 10) {
          //     break;
          // }
      }
      return j;
  }

  public int testFor(int[] ints) {
      int sum = 0;
      for (int i : ints) {
          sum += i;
      }
      return sum;
  }
}
