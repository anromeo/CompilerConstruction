package pass;

public class DoWhile {
  public int multiplyWithDoWhile(int x, int y) {
    int j = 0;
    do {
        j = x + j;
        y -= 1;
    } while (y > 0);
    return j;
  }

  public int raiseWithDoWhile(int x, int y) {
    do {
        x = x + x;
        y -= 1;
    } while (y > 1);
    return x;
  }

  public int countWithDoWhile(int x) {
    int j = 0;
    do {
        x = x - 1;
        j = j + 1;
    } while (x > 0);
    return j;
  }

}
