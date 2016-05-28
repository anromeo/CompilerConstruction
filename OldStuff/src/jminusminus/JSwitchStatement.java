
package jminusminus;

import static jminusminus.CLConstants.*;

import java.util.ArrayList;

import jminusminus.JSwitchBlockStatement;

/**
 * The AST node for a switch statement.
 */
public class JSwitchStatement extends JStatement{

    /** Test expression. */
    private JExpression condition;
    
    /** SwitchLabels. */
    private ArrayList<JSwitchBlockStatement> switchBlockStatementArray;

    /** default. */ //if we need it
    private ArrayList<JStatement> defaultStatements;

    /**
     * Construct an AST node for an if-statement given its line number, the test
     * expression, the consequent, and the alternate.
     * 
     * @param line
     *            line in which the if-statement occurs in the source file.
     * @param condition
     *            test expression.
     * @param thenPart
     *            then clause.
     * @param elsePart
     *            else clause.
     */

    public JSwitchStatement(int line, JExpression condition, ArrayList<JSwitchBlockStatement> theJSwitchBlockStatementArray) {
        super(line);
        this.condition = condition;
        switchBlockStatementArray = theJSwitchBlockStatementArray;
        int defaultCount = 0;
        for (JSwitchBlockStatement theStatement :  switchBlockStatementArray) {
        	if (theStatement.getSwitchLabel() == TokenKind.DEFAULT) {
        		defaultStatements = theStatement.getBlockStatements();
        		defaultCount++;       		
        	}
        }
    }
    
//    public void AddSwitchLabelStatement(JExpression theCaseExpression, JStatement theBlockStatement) {
//    	switchLabelArray.add(new switchLabel(theCaseExpression, theBlockStatement));
//    }
//    
//    public void AddSwitchLabel(JStatement theBlockStatement) {
//    	defaultStatement = theBlockStatement;
//    }

    /**
     * Analyzing the if-statement means analyzing its components and checking
     * that the test is boolean.
     * 
     * @param context
     *            context in which names are resolved.
     * @return the analyzed (and possibly rewritten) AST subtree.
     */

    public JStatement analyze(Context context) {
//        condition = (JExpression) condition.analyze(context);
//        condition.type().mustMatchExpected(line(), Type.BOOLEAN);
//        thenPart = (JStatement) thenPart.analyze(context);
//        if (elsePart != null) {
//            elsePart = (JStatement) elsePart.analyze(context);
//        }
        return this;
    }

    /**
     * Code generation for an if-statement. We generate code to branch over the
     * consequent if !test; the consequent is followed by an unconditonal branch
     * over (any) alternate.
     * 
     * @param output
     *            the code emitter (basically an abstraction for producing the
     *            .class file).
     */

    public void codegen(CLEmitter output) {
//        String elseLabel = output.createLabel();
//        String endLabel = output.createLabel();
//        condition.codegen(output, elseLabel, false);
//        thenPart.codegen(output);
//        if (elsePart != null) {
//            output.addBranchInstruction(GOTO, endLabel);
//        }
//        output.addLabel(elseLabel);
//        if (elsePart != null) {
//            elsePart.codegen(output);
//            output.addLabel(endLabel);
//        }
    }

    /**
     * @inheritDoc
     */

    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JSwitchcStatement line=\"%d\">\n", line());
        p.indentRight();
        p.printf("<TestExpression>\n");
        p.indentRight();
        condition.writeToStdOut(p);
        p.indentLeft();
        p.printf("</TestExpression>\n");
        p.printf("<switchBlockStatementGroup>\n");        
        p.indentRight();
        for (int i =0; i < switchBlockStatementArray.size(); i++) {
        	if (switchBlockStatementArray.get(i).getSwitchLabel() == TokenKind.DEFAULT) {
        		switchBlockStatementArray.remove(i);
        	} else {
		        p.printf("<caseBlock>\n"); 
	            p.indentRight();
		        p.printf("<caseExpression>\n"); 
	            p.indentRight();
	            switchBlockStatementArray.get(i).getCondition().writeToStdOut(p);
	            p.indentLeft();
		        p.printf("</caseExpression>\n"); 
		        p.printf("<caseBlockStatements>\n"); 
	            p.indentRight();
	            for (int j =0; j < switchBlockStatementArray.get(i).getBlockStatements().size(); j++) {
	            	p.printf("<blockStatement>\n"); 
	                p.indentRight();
	            	switchBlockStatementArray.get(i).getBlockStatements().get(j).writeToStdOut(p);
	            	p.indentLeft();
	    	        p.printf("</blockStatement>\n");
	            }
	            p.indentLeft();
		        p.printf("</caseBlockStatements>\n");
	            p.indentLeft();
		        p.printf("</caseBlock>\n");
	        }
        }
        if (defaultStatements != null) {
            p.printf("<DefaultStatements>\n");
            p.indentRight();
            for (int j =0; j < defaultStatements.size(); j++) {
            	p.printf("<blockStatement>\n"); 
                p.indentRight();
                defaultStatements.get(j).writeToStdOut(p);
            	p.indentLeft();
    	        p.printf("</blockStatement>\n");
            }
            p.indentLeft();
            p.printf("</DefaultStatements>\n");

        }
        p.indentLeft();
        p.printf("</switchBlockStatementGroup>\n");
        p.indentLeft();
        p.printf("</JSwitchStatement>\n");
    }
    
    private class switchLabel {
    	//case expression
    	private JExpression caseExpression;
    	//block Statement
        private JStatement blockStatement;
    	
    	switchLabel(JExpression theCaseExpression, JStatement theBlockStatement) {
    		caseExpression = theCaseExpression;
    		blockStatement = theBlockStatement;
    	}

    }
}


