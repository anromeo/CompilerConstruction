// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Break;

public class BreakTest extends TestCase {
  private Break breakX;

  protected void setUp () throws Exception {
    super.setUp();
    breakX = new Break();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTestbreak () {
    this.assertEquals(breakX.testBreak(4), 4);
  }
}
