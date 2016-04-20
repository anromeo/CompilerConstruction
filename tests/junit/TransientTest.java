// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Transient;

public class TransientTest extends TestCase {
  private Transient transientX;

  protected void setUp () throws Exception {
    super.setUp();
    transientX = new Transient ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testIstransient () {
    this.assertEquals(transientX.isTransient(), true);
  }
}
