// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.BitOr;

public class BitOrTest extends TestCase {
  private BitOr bitorX;

  protected void setUp () throws Exception {
    super.setUp();
    bitorX = new BitOr ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testBitxor () {
    this.assertEquals(bitorX.bitxor(0, 1), 0);
  }
}
