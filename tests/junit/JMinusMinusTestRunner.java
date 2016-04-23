// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package junit;

import java.io.File;
import junit.framework.TestCase;
import junit.framework.Test;
import junit.framework.TestSuite;
import pass.*;

/**
 * JUnit test suite for running the j-- programs in tests/pass.
 */

public class JMinusMinusTestRunner {

    public static Test suite() {
        TestSuite suite = new TestSuite();
        // suite.addTestSuite(HelloWorldTest.class);
        // suite.addTestSuite(FactorialTest.class);
        // suite.addTestSuite(GCDTest.class);
        // suite.addTestSuite(SeriesTest.class);
        // suite.addTestSuite(ClassesTest.class);
        // suite.addTestSuite(DivisionTest.class);
        // suite.addTestSuite(FloatTest.class);
        // suite.addTestSuite(LongLiteralTest.class);
        // suite.addTestSuite(FloatLiteralTest.class);
        // suite.addTestSuite(DoubleLiteralTest.class);
        // suite.addTestSuite(AndAssignTest.class);
        // suite.addTestSuite(GreaterOrEqualTest.class);
        // suite.addTestSuite(ZeroFillRightBitShiftAssignTest.class);
        // suite.addTestSuite(ZeroFillRightBitShiftTest.class);
        // suite.addTestSuite(RightBitShiftAssignTest.class);
        // suite.addTestSuite(DivAssignTest.class);
        // suite.addTestSuite(OrTest.class);
        // suite.addTestSuite(BitOrAssignTest.class);
        // suite.addTestSuite(BitOrTest.class);
        // suite.addTestSuite(RightBitShiftTest.class);
        // suite.addTestSuite(BitXorAssignTest.class);
        // suite.addTestSuite(ModAssignTest.class);
        // suite.addTestSuite(NotEqualTest.class);
        // suite.addTestSuite(BitXorTest.class);
        // suite.addTestSuite(ModulusTest.class);
        // suite.addTestSuite(LessThanTest.class);
        // suite.addTestSuite(MultAssignTest.class);
        // suite.addTestSuite(LeftBitShiftAssignTest.class);
        // suite.addTestSuite(LeftBitShiftTest.class);
        // suite.addTestSuite(MinusAssignTest.class);
        // suite.addTestSuite(VolatileTest.class);
        // suite.addTestSuite(TryTest.class);
        // suite.addTestSuite(SynchronizedTest.class);
        // suite.addTestSuite(SwitchTest.class);
        // suite.addTestSuite(StrictfpTest.class);
        // suite.addTestSuite(ImplementsTest.class);
        // suite.addTestSuite(FinalTest.class);
        // suite.addTestSuite(DoubleTest.class);
        // suite.addTestSuite(CatchTest.class);
        // suite.addTestSuite(CaseTest.class);
        // suite.addTestSuite(TransientTest.class);
        // suite.addTestSuite(NativeTest.class);
        // suite.addTestSuite(GotoTest.class);
        // suite.addTestSuite(DoTest.class);
        // suite.addTestSuite(ByteTest.class);
        // suite.addTestSuite(ThrowsTest.class);
        // suite.addTestSuite(ShortTest.class);
        // suite.addTestSuite(LongTest.class);
        // suite.addTestSuite(ForTest.class);
        // suite.addTestSuite(DefaultTest.class);
        // suite.addTestSuite(BreakTest.class);
        // suite.addTestSuite(ThrowTest.class);
        // suite.addTestSuite(InterfaceTest.class);
        // suite.addTestSuite(FloatTest.class);
        // suite.addTestSuite(ContinueTest.class);
        // suite.addTestSuite(FinallyTest.class);
        // suite.addTestSuite(ConstantTest.class);
        // suite.addTestSuite(BitwiseNotTest.class);
        // suite.addTestSuite(TernaryTest.class);
        // suite.addTestSuite(MultilineCommentTest.class);
        return suite;
    }

    /**
     * Runs the test suite using the textual runner.
     */

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

}
