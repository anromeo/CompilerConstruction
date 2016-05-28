// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.ZeroFillRightBitShiftAssign;

public class ZeroFillRightBitShiftAssignTest extends TestCase {
  private ZeroFillRightBitShiftAssign zerofillrightbitshiftassignX;

  protected void setUp () throws Exception {
    super.setUp();
    zerofillrightbitshiftassignX = new ZeroFillRightBitShiftAssign ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testZerofillrightbitshiftassign () {
    this.assertEquals(zerofillrightbitshiftassignX.zerofillrightbitshiftassign (1, 0), 1);
  }
}
