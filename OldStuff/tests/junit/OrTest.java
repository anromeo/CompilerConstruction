// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Or;

public class OrTest extends TestCase {
  private Or or;

  protected void setUp () throws Exception {
    super.setUp();
    or = new Or();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testOr() {
    this.assertEquals(true, or.or(true, true));
    this.assertEquals(true, or.or(false, true));
    this.assertEquals(true, or.or(true, false));
    this.assertEquals(false, or.or(false, false));
  }

}
