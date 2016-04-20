// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Switch;

public class SwitchTest extends TestCase {
  private Switch switchX;

  protected void setUp () throws Exception {
    super.setUp();
    switchX = new Switch ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTestswitch () {
    this.assertEquals(switchX.testSwitch(2), 2);
  }
}
