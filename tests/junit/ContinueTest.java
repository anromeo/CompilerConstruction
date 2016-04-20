// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Continue;

public class ContinueTest extends TestCase {
  private Continue continueX;

  protected void setUp () throws Exception {
    super.setUp();
    continueX = new Continue ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testContinuetest () {
    this.assertEquals(continueX.continueTest(3), true);
  }
}
