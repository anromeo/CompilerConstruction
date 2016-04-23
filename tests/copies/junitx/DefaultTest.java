// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Default;

public class DefaultTest extends TestCase {
  private Default defaultX;

  protected void setUp () throws Exception {
    super.setUp();
    defaultX = new Default ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTestdefault () {
    this.assertEquals(defaultX.testDefault("hello"), true);
  }
}
