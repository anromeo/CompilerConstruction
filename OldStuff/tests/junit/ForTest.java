// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.For;

public class ForTest extends TestCase {
  private For forX;

  protected void setUp () throws Exception {
    super.setUp();
    forX = new For ();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testCountWithFor() {
    this.assertEquals(5, forX.countWithFor(5));
    this.assertEquals(10, forX.countWithFor(10));
    this.assertEquals(15, forX.countWithFor(15));
  }

  public void testMultiplyBy10() {
    this.assertEquals(50, forX.multiplyBy10(5));
    this.assertEquals(100, forX.multiplyBy10(10));
    this.assertEquals(150, forX.multiplyBy10(15));
  }

  public void testFactorial() {
    this.assertEquals(6, forX.factorial(3));
    this.assertEquals(10, forX.factorial(4));
    this.assertEquals(15, forX.factorial(5));    
  }
}
