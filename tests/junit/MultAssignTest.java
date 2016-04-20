// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.MultAssign;

public class MultAssignTest extends TestCase {
  private MultAssign multassignX;

  protected void setUp () throws Exception {
    super.setUp();
    multassignX = new MultAssign ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testMultassign () {
    this.assertEquals(multassignX.multassign(2, 4), 8);
  }
}
