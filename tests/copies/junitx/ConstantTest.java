// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Constant;

public class ConstantTest extends TestCase {
  private Constant constant;

  protected void setUp () throws Exception {
    super.setUp();
    constant = new Constant ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testGetConstant () {
    this.assertEquals(constant.getConstant(), 1);
  }
}
