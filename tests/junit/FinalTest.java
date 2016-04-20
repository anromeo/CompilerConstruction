// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Final;

public class FinalTest extends TestCase {
  private Final finalX;

  protected void setUp () throws Exception {
    super.setUp();
    finalX = new Final ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTestfinal () {
    this.assertEquals(finalX.testFinal(2), 2);
  }
}
