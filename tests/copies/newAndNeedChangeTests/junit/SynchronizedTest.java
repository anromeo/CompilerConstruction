// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Synchronized;

public class SynchronizedTest extends TestCase {
  private Synchronized synchronizedX;

  protected void setUp () throws Exception {
    super.setUp();
    synchronizedX = new Synchronized ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testTestsynchronized () {
    this.assertEquals(synchronizedX.testSynchronized(), true);
  }
}
