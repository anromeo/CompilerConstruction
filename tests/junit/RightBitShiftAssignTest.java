// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.RightBitShiftAssign;

public class RightBitShiftAssignTest extends TestCase {
  private RightBitShiftAssign rightbitshiftassignX;

  protected void setUp () throws Exception {
    super.setUp();
    rightbitshiftassignX = new RightBitShiftAssign ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testRightbitshiftassign () {
    this.assertEquals(rightbitshiftassignX.rightbitshiftassign(4, 0), 4);
  }
}
