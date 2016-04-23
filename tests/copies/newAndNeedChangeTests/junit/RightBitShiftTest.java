// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.RightBitShift;

public class RightBitShiftTest extends TestCase {
  private RightBitShift rightbitshiftX;

  protected void setUp () throws Exception {
    super.setUp();
    rightbitshiftX = new RightBitShift ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testRightbitshift () {
    this.assertEquals(rightbitshiftX.rightbitshift(1, 1), 1);
  }
}
