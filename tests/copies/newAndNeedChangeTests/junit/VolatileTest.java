// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Volatile;

public class VolatileTest extends TestCase {
  private Volatile volatileX;

  protected void setUp () throws Exception {
    super.setUp();
    volatileX = new Volatile ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTestvolatile () {
    this.assertEquals(volatileX.testVolatile(), true);
  }
}
