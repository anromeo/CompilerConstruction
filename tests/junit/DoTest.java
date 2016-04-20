// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Do;

public class DoTest extends TestCase {
  private Do doX;

  protected void setUp () throws Exception {
    super.setUp();
    doX = new Do ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTestdo () {
    this.assertEquals(doX.testDo(2), 2);
  }
}
