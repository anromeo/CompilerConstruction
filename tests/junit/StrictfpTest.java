// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Strictfp;

public class StrictfpTest extends TestCase {
  private Strictfp strictfpX;

  protected void setUp () throws Exception {
    super.setUp();
    strictfpX = new Strictfp ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTeststrictfp () {
    this.assertEquals(strictfpX.testStrictfp(), 4);
  }
}
