// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.BitOrAssign;

public class BitOrAssignTest extends TestCase {
  private BitOrAssign bitorassignX;

  protected void setUp () throws Exception {
    super.setUp();
    bitorassignX = new BitOrAssign ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testBitorassign () {
    this.assertEquals(bitorassignX.bitorassign(1, 2), 2);
  }
}
