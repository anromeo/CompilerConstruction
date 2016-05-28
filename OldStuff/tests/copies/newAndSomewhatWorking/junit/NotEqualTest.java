// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.NotEqual;

public class NotEqualTest extends TestCase {
  private NotEqual notequalX;

  protected void setUp () throws Exception {
    super.setUp();
    notequalX = new NotEqual ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testNotequal () {
    this.assertEquals(notequalX.notequal(0, 42), true);
    this.assertEquals(notequalX.notequal(32, 11), true);
    this.assertEquals(notequalX.notequal(42, 42), false);
  }
}
