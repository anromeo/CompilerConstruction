// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.LessThan;

public class LessThanTest extends TestCase {
  private LessThan lessthanX;

  protected void setUp () throws Exception {
    super.setUp();
    lessthanX = new LessThan ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testLessthan () {
    this.assertEquals(lessthanX.lessthan(0, 42), true);
    this.assertEquals(lessthanX.lessthan(42, 42), false);
    this.assertEquals(lessthanX.lessthan(64, 42), false);
  }
}
