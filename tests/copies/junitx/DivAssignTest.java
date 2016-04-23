// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.DivAssign;

public class DivAssignTest extends TestCase {
  private DivAssign divassignX;

  protected void setUp () throws Exception {
    super.setUp();
    divassignX = new DivAssign ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testDivassign () {
    this.assertEquals(divassignX.divassign(10, 5), 2);
  }
}
