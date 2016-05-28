// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package jminusminus;

import static jminusminus.CLConstants.*;

/**
 * The AST node for a while-statement.
 */

class JTryStatement extends JStatement {

    private JStatement tryBlock;
    private JStatement catchBlock;
    private JFormalParameter catchParameter;
    private JStatement finallyBlock;

    /**
     * Construct an AST node for a while-statement given its line number, the
     * test expression, and the body.
     * 
     * @param line
     *            line in which the while-statement occurs in the source file.
     * @param condition
     *            test expression.
     * @param body
     *            the body.
     */
    public JTryStatement(int line, JStatement tryBlock, JFormalParameter catchParameter, JStatement catchBlock, JStatement finallyBlock)
    {
        super(line);
        this.tryBlock = tryBlock;
        this.catchBlock = catchBlock;
        this.catchParameter = catchParameter;
        this.finallyBlock = finallyBlock;
    }

    /**
     * Analysis involves analyzing the test, checking its type and analyzing the
     * body statement.
     * 
     * @param context
     *            context in which names are resolved.
     * @return the analyzed (and possibly rewritten) AST subtree.
     */

    public JTryStatement analyze(Context context) {
        // condition = condition.analyze(context);
        // condition.type().mustMatchExpected(line(), Type.BOOLEAN);
        // body = (JStatement) body.analyze(context);
        return this;
    }

    /**
     * Generate code for the while loop.
     * 
     * @param output
     *            the code emitter (basically an abstraction for producing the
     *            .class file).
     */

    public void codegen(CLEmitter output) {
        // // Need two labels
        // String test = output.createLabel();
        // String out = output.createLabel();

        // // Branch out of the loop on the test condition
        // // being false
        // output.addLabel(test);
        // condition.codegen(output, out, false);

        // // Codegen body
        // body.codegen(output);

        // // Unconditional jump back up to test
        // output.addBranchInstruction(GOTO, test);

        // // The label below and outside the loop
        // output.addLabel(out);
    }

    /**
     * @inheritDoc
     */

    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JTryStatement line=\"%d\">\n", line());
            p.indentRight();
                p.printf("<TryBlock>\n");
                    p.indentRight();
                        tryBlock.writeToStdOut(p);
                    p.indentLeft();
                p.printf("</TryBlock>\n");
                p.printf("<CatchParameter>\n");
                    p.indentRight();
                        catchParameter.writeToStdOut(p);
                    p.indentLeft();
                p.printf("</CatchParameter>\n");
                p.printf("<CatchBlock>\n");
                    p.indentRight();
                        catchBlock.writeToStdOut(p);
                    p.indentLeft();
                p.printf("</CatchBlock>\n");
                p.printf("<FinallyBlock>\n");
                    p.indentRight();
                        finallyBlock.writeToStdOut(p);
                    p.indentLeft();
                p.printf("</FinallyBlock>\n");
            p.indentLeft();
        p.printf("</JTryStatement>\n");
    }

}