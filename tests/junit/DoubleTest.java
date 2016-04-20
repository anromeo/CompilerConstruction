// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Double;

public class DoubleTest extends TestCase {
  private Double doubleX;

  protected void setUp () throws Exception {
    super.setUp();
    doubleX = new Double ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testDouble () {
    this.assertEquals(doubleX.isDouble(42), 42);
  }
}
