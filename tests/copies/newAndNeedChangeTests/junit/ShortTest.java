// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Short;

public class ShortTest extends TestCase {
  private Short shortX;

  protected void setUp () throws Exception {
    super.setUp();
    shortX = new Short ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testIsshort () {
    this.assertEquals(shortX.isShort(42), 42);
  }
}
