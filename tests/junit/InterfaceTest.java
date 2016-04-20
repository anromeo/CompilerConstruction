// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Interface;

public class InterfaceTest extends TestCase {
  private Interface interfaceX;

  protected void setUp () throws Exception {
    super.setUp();
    interfaceX = new Interface();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testStillvalid () {
    this.assertEquals(interfaceX.stillValid(), true);
  }
}
