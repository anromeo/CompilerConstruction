// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Native;

public class NativeTest extends TestCase {
  private Native nativeX;

  protected void setUp () throws Exception {
    super.setUp();
    nativeX = new Native ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTestnative () {
    this.assertEquals(nativeX.testNative(), 0);
  }
}
