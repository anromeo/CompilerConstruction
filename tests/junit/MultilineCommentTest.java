// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import junit.framework.TestCase;
import jminusminus.Main;
import java.io.File;

import pass.MultilineComment;

public class MultilineCommentTest extends TestCase {
  private MultilineComment multilineComment;

  protected void setUp () throws Exception {
    super.setUp();
    multilineComment = new MultilineComment();
  }

  protected void tearDown () throws Exception {
    super.tearDown();
  }
  
  public void testComment () {
    multilineComment.comment();
  }
}