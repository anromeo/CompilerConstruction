// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.BitXor;

public class BitXorTest extends TestCase {
  private BitXor bitxorX;

  protected void setUp () throws Exception {
    super.setUp();
    bitxorX = new BitXor ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testBitxor () {
    this.assertEquals(bitxorX.bitxor(0, 24), true);
  }
}
