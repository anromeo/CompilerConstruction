// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Modulus;

public class ModulusTest extends TestCase {
  private Modulus modulusX;

  protected void setUp () throws Exception {
    super.setUp();
    modulusX = new Modulus ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testModulus () {
    this.assertEquals(modulusX.modulus(7, 5), 2);
    this.assertEquals(modulusX.modulus(2, 1), 0);
    this.assertEquals(modulusX.modulus(107, 10), 7);    
  }
}
