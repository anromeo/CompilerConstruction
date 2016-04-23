// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.LeftBitShiftAssign;

public class LeftBitShiftAssignTest extends TestCase {
  private LeftBitShiftAssign leftbitshiftassignX;

  protected void setUp () throws Exception {
    super.setUp();
    leftbitshiftassignX = new LeftBitShiftAssign ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testLeftbitshiftassign () {
    this.assertEquals(leftbitshiftassignX.leftBitShiftAssign(2), 2);
  }
}
