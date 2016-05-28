// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.BitXorAssign;

public class BitXorAssignTest extends TestCase {
  private BitXorAssign bitxorassignX;

  protected void setUp () throws Exception {
    super.setUp();
    bitxorassignX = new BitXorAssign ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testBitxorassign () {
    this.assertEquals(bitxorassignX.bitxorassign(1, 0), 1);
  }
}
