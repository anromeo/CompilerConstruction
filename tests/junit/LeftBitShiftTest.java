// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.LeftBitShift;

public class LeftBitShiftTest extends TestCase {
  private LeftBitShift leftbitshiftX;

  protected void setUp () throws Exception {
    super.setUp();
    leftbitshiftX = new LeftBitShift ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTestleftbistshift () {
    this.assertEquals(leftbitshiftX.testLeftBitShift(3), 3);
  }
}
