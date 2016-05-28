// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Ternary;

public class TernaryTest extends TestCase {
  private Ternary ternary;

  protected void setUp() throws Exception {
    super.setUp();
    ternary = new Ternary();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTernary () {
    this.assertEquals(ternary.testTernary(5, 4), 5);
  }
}
