// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Throws;

public class ThrowsTest extends TestCase {
  private Throws throwsX;

  protected void setUp () throws Exception {
    super.setUp();
    throwsX = new Throws ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testDoesthrow () {
    this.assertEquals(throwsX.doesThrow (42), 42);
  }
}
