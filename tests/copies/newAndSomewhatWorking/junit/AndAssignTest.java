// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.AndAssign;

public class AndAssignTest extends TestCase {
  private AndAssign andassignX;

  protected void setUp () throws Exception {
    super.setUp();
    andassignX = new AndAssign ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testAndassign () {
    this.assertEquals(andassignX.andassign(true, false), false);
    this.assertEquals(andassignX.andassign(false, true), false);
    this.assertEquals(andassignX.andassign(true, true), true);
    this.assertEquals(andassignX.andassign(false, false), false);
  }
}
