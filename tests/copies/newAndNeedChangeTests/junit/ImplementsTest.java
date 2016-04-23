// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Implements;

public class ImplementsTest extends TestCase {
  private Implements implementsX;

  protected void setUp () throws Exception {
    super.setUp();
    implementsX = new Implements ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTestimplements () {
    this.assertEquals(implementsX.testImplements(), true);
  }
}
