// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.BitwiseNot;

public class BitwiseNotTest extends TestCase {
  private BitwiseNot bitwisenot;

  protected void setUp () throws Exception {
    super.setUp();
    bitwisenot = new BitwiseNot ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testBitwisenot () {
    this.assertEquals(bitwisenot.bitwiseNot(-9), 8);
  }
}
