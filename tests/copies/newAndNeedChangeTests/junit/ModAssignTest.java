// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.ModAssign;

public class ModAssignTest extends TestCase {
  private ModAssign modassignX;

  protected void setUp () throws Exception {
    super.setUp();
    modassignX = new ModAssign ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testModassign () {
    this.assertEquals(modassignX.modassign(4, 3), 1);
  }
}
