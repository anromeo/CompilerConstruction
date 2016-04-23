// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Catch;

public class CatchTest extends TestCase {
  private Catch catchX;

  protected void setUp () throws Exception {
    super.setUp();
    catchX = new Catch ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testCatch () {
    this.assertEquals(catchX.testCatch(42), 42);
  }
}
