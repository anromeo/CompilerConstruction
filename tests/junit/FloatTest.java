// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Float;

public class FloatTest extends TestCase {
  private Float floatX;

  protected void setUp () throws Exception {
    super.setUp();
    floatX = new Float ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testDivide () {
    this.assertEquals(floatX.isFloat(), false);
  }
}
