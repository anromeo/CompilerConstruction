// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package jminusminus;

import static jminusminus.CLConstants.*;

/**
 * The AST node for a while-statement.
 */

class JForStatement extends JStatement {

    private JStatement body;
    private JVariableDeclaration variable;
    private JExpression condition;
    private JStatement increment;
    private String name;
    private boolean foreach = false;

    private LocalContext context;
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
    public JForStatement(int line, JVariableDeclaration assignment, JExpression condition, JStatement increment, JStatement body) {
        super(line);
        this.variable = assignment;
        this.condition = condition;
        this.increment = increment;
        this.body = body;
    }


    public JForStatement(int line, JVariableDeclaration variable, String name, JStatement body) {
        super(line);
        this.variable = variable;
        this.name = name;
        this.body = body;
        foreach = true;
    }
    /**
     * Analysis involves analyzing the test, checking its type and analyzing the
     * body statement.
     * 
     * @param context
     *            context in which names are resolved.
     * @return the analyzed (and possibly rewritten) AST subtree.
     */

    public JForStatement analyze(Context context) {
        if (!foreach) {
            // body = (JStatement) body.analyze(context);
            this.context = new LocalContext(context);

            // ArrayList<JStatement> temp = new ArrayList<JStatement>();
            this.variable = (JVariableDeclaration) variable.analyze(this.context);
            this.condition = (JExpression) condition.analyze(this.context);
            condition.type().mustMatchExpected(line(), Type.BOOLEAN);
            this.increment = (JStatement) increment.analyze(this.context);
            this.body = (JStatement) body.analyze(this.context);
        }
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


        // Need three labels
        String executeDo = output.createLabel();
        String test = output.createLabel();
        String out = output.createLabel();

        // Add variable for testing
        variable.codegen(output);

        // // If the first test fails, jump to the end of the statement
        condition.codegen(output, out, false);
        output.addBranchInstruction(GOTO, executeDo);

        // Add label for the body
        output.addLabel(executeDo);
        // Add the codegen body to be processed
        body.codegen(output);
        
        // Increment the variable
        increment.codegen(output);

        // Retest Condition
        condition.codegen(output, executeDo, true);
        output.addBranchInstruction(GOTO, out);
        output.addLabel(out);

    }

    /**
     * @inheritDoc
     */

    public void writeToStdOut(PrettyPrinter p) {
        if (!foreach) {
            p.printf("<JForStatement line=\"%d\">\n", line());
            p.indentRight();
            p.printf("<TestExpression>\n");
            p.indentRight();
            variable.writeToStdOut(p);
            condition.writeToStdOut(p);
            increment.writeToStdOut(p);
            p.indentLeft();
            p.printf("</TestExpression>\n");
            p.printf("<Body>\n");
            p.indentRight();
            body.writeToStdOut(p);
            p.indentLeft();
            p.printf("</Body>\n");
            p.indentLeft();
            p.printf("</JForStatement>\n");
        } else {
            p.printf("<JForStatement line=\"%d\">\n", line());
            p.indentRight();
            variable.writeToStdOut(p);
            p.printf("<IterateVariable name=\"%s\">\n", name);
            p.indentLeft();
            p.printf("<Body>\n");
            p.indentRight();
            body.writeToStdOut(p);
            p.indentLeft();
            p.printf("</Body>\n");
            p.indentLeft();
            p.printf("</JForStatement>\n");
        }
    }

}
