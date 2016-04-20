// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Finally;

public class FinallyTest extends TestCase {
  private Finally fin;

  protected void setUp () throws Exception {
    super.setUp();
    fin = new Finally ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTestfinally () {
    this.assertEquals(fin.testFinally(), false);
  }
}
