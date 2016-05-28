// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Long;

public class LongTest extends TestCase {
  private Long longX;

  protected void setUp () throws Exception {
    super.setUp();
    longX = new Long ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testIslong () {
    this.assertEquals(longX.isLong(42), 42);
  }
}
