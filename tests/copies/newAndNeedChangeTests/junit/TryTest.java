// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Try;

public class TryTest extends TestCase {
  private Try tryX;

  protected void setUp () throws Exception {
    super.setUp();
    tryX = new Try ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTesttry () {
    this.assertEquals(tryX.testTry(22), 2);
  }
}
