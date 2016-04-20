// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.MinusAssign;

public class MinusAssignTest extends TestCase {
  private MinusAssign minusassignX;

  protected void setUp () throws Exception {
    super.setUp();
    minusassignX = new MinusAssign ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testMinusassign () {
    this.assertEquals(minusassignX.minusassign(25, 5), 20);
  }
}
