// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.DoWhile;

public class DoWhileTest extends TestCase {
  private DoWhile doWhile;

  protected void setUp () throws Exception {
    super.setUp();
    doWhile = new DoWhile();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testDoWhileMultiply () {
    this.assertEquals(20, doWhile.multiplyWithDoWhile(4, 5));
    this.assertEquals(30, doWhile.multiplyWithDoWhile(6, 5));
  }

  public void testDoWhileRaise () {
    this.assertEquals(8, doWhile.raiseWithDoWhile(2, 3));
    this.assertEquals(4, doWhile.raiseWithDoWhile(2, 1));
  }

  public void testDoWhileCount () {
    this.assertEquals(1, doWhile.countWithDoWhile(0));
    this.assertEquals(7, doWhile.countWithDoWhile(7));
  }

}
