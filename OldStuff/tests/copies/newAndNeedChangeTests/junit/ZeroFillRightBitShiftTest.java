// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.ZeroFillRightBitShift;

public class ZeroFillRightBitShiftTest extends TestCase {
  private ZeroFillRightBitShift zerofillrightbitshiftX;

  protected void setUp () throws Exception {
    super.setUp();
    zerofillrightbitshiftX = new ZeroFillRightBitShift ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testZerofillrightbitshift () {
    this.assertEquals(zerofillrightbitshiftX.zerofillrightbitshift(1, 1), 0);
  }
}
