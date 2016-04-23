// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Throw;

public class ThrowTest extends TestCase {
  private Throw throwX;

  protected void setUp () throws Exception {
    super.setUp();
    throwX = new Throw ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTestthrow () {
    this.assertEquals(throwX.testThrow("hello, world"), "hello, world");
  }
}
