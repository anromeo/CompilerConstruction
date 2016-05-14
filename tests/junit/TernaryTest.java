// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.Ternary;

public class TernaryTest extends TestCase {
  private Ternary tern;

  protected void setUp () throws Exception {
    super.setUp();
    tern = new Ternary();
  }

  protected void tearDown() throws Exception {
    super.tearDown();
  }
  
  public void testTernaryReturnProperNumbers () {
    this.assertEquals(4, tern.returnProperNumbers(true, 4, 5));
    this.assertEquals(5, tern.returnProperNumbers(false, 4, 5));
  }

  public void testIsLessThan () {
    this.assertEquals(true, tern.isLessThan(4, 5));
    this.assertEquals(false, tern.isLessThan(105, 101));
  }

  public void testIsNot() {
    this.assertEquals(true, tern.isNotWhatYouWant(false));
    this.assertEquals(false, tern.isNotWhatYouWant(true));
  }

  public void testIsEqual() {
    this.assertEquals(true, tern.isEqual(4, 4));
    this.assertEquals(false, tern.isEqual(3, 1));
  }

}
