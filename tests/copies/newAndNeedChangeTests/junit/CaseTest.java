// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Case;

public class CaseTest extends TestCase {
  private Case caseX;

  protected void setUp () throws Exception {
    super.setUp();
    caseX = new Case ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTestcase () {
    this.assertEquals(caseX.testCase(), true);
  }
}
