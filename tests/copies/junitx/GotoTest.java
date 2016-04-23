// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Goto;

public class GotoTest extends TestCase {
  private Goto gotoX;

  protected void setUp () throws Exception {
    super.setUp();
    gotoX = new Goto ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTestgoto () {
    this.assertEquals(gotoX.testGoto(), 0);
  }
}
