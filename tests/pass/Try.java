package pass;

public class Try {
  public int testTry(int returningInt) {
    int i = returningInt;
    try {
        i = 4 + i;
    } catch(Exception e) {
        i = i - 4;
    } finally {
        i = i * 4;
    }
    return i;
  }
}
