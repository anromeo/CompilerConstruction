// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Or;

public class OrTest extends TestCase {
  private Or orX;

  protected void setUp () throws Exception {
    super.setUp();
    orX = new Or ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testOr () {
    // this.assertEquals(orX.or(true, true), true);
    // this.assertEquals(orX.or(true, false), true);
    // this.assertEquals(orX.or(false, true), true);
    this.assertEquals(orX.or(false, false), false);
  }
}
