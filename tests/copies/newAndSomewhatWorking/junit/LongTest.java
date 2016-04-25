
package junit;

import junit.framework.TestCase;
import pass.LongMaker;

public  class  LongTest  extends  TestCase {
	private  LongMaker  theLong;
	
	protected  void  setUp()  throws  Exception {
		super.setUp ();
		theLong = new  LongMaker();
	}
	
	protected  void  tearDown ()  throws  Exception {
		super.tearDown ();
	}
	
	public  void  testDivide () {
		
		//long test = LongMaker.LongMakerTest(100l);
		//this.assertEquals(100l, test);
	}
}
