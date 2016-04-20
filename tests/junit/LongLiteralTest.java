// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.LongLiteral;

public class LongLiteralTest extends TestCase {
  private LongLiteral longliteralX;

  protected void setUp () throws Exception {
    super.setUp();
    longliteralX = new LongLiteral ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testIslong () {
    this.assertEquals(longliteralX.islong(2), true);
  }
}
