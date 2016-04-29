// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.For;

public class ForTest extends TestCase {
  private For forX;

  protected void setUp () throws Exception {
    super.setUp();
    forX = new For ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testFor () {
    this.assertEquals(forX.testFor(4), 4);
  }
}
