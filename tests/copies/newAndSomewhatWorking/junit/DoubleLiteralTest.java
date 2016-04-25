// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.DoubleLiteral;

public class DoubleLiteralTest extends TestCase {
  private DoubleLiteral doubleliteralX;

  protected void setUp () throws Exception {
    super.setUp();
    doubleliteralX = new DoubleLiteral();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testIsdouble () {
    this.assertEquals(doubleliteralX.isdouble(42.0), 42.0);
  }
}
