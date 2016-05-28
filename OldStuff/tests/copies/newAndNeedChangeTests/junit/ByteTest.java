// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Byte;

public class ByteTest extends TestCase {
  private Byte byteX;

  protected void setUp () throws Exception {
    super.setUp();
    byteX = new Byte ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testIsbyte () {
    this.assertEquals(byteX.isByte(42), 42);
  }
}
