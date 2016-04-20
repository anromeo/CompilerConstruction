// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Division;

public class DivisionTest extends TestCase {
  private Division division;

  protected void setUp () throws Exception {
    super.setUp();
    division = new Division ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testDivide () {
    this.assertEquals(division.divide (0, 42), 0);
  }
}