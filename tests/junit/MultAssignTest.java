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
  
  public void testMultIntAssign () {
    this.assertEquals(multassignX.multassign(2, 4), 8);
    this.assertEquals(multassignX.multassign(4, 4), 16);
    this.assertEquals(multassignX.multassign(7, -2), -14);
  }

  // public void testMultFloAssign () {
  //   this.assertEquals(multassignX.multassign(2f, 4.0f), 8.0f);
  //   this.assertEquals(multassignX.multassign(4.0f, 4.0f), 16.0f);
  //   this.assertEquals(multassignX.multassign(7.0f, -2.0f), -14.0f);
  // }
}
