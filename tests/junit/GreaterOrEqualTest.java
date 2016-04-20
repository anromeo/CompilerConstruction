// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.GreaterOrEqual;

public class GreaterOrEqualTest extends TestCase {
  private GreaterOrEqual greaterorequalX;

  protected void setUp () throws Exception {
    super.setUp();
    greaterorequalX = new GreaterOrEqual ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testGreaterorequal () {
    this.assertEquals(greaterorequalX.greaterorequal(30, 40), false);
    this.assertEquals(greaterorequalX.greaterorequal(35, 30), true);
    this.assertEquals(greaterorequalX.greaterorequal(30, 30), true);
  }
}
