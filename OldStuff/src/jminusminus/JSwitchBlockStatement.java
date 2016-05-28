
package jminusminus;

import static jminusminus.CLConstants.*;
import java.util.ArrayList;

public class JSwitchBlockStatement extends JStatement {
    /** SwitchLabels. */
    private TokenKind switchLabel;

	/** Test expression for case statements. */
    private JExpression condition;
    
    /** blockStatement. */
    private ArrayList<JStatement> blockStatements;
    
//	public JSwitchBlockStatement(int line, TokenKind theSwitchLabel, JStatement theBlockStatement) {
//        this(line, theSwitchLabel, null, theBlockStatement);
//    }
	
	public JSwitchBlockStatement(int line, TokenKind theSwitchLabel, JExpression condition, ArrayList<JStatement> theBlockStatements) {
        super(line);
        this.condition = condition;
        this.switchLabel = theSwitchLabel;
        this.blockStatements = theBlockStatements;
    }
	
	public TokenKind getSwitchLabel() {
		return switchLabel;
	}

	public void setSwitchLabel(TokenKind switchLabel) {
		this.switchLabel = switchLabel;
	}

	public JExpression getCondition() {
		return condition;
	}

	public void setCondition(JExpression condition) {
		this.condition = condition;
	}

	public ArrayList<JStatement> getBlockStatements() {
		return blockStatements;
	}

	public void setBlockStatement(ArrayList<JStatement> blockStatements) {
		this.blockStatements = blockStatements;
	}
	
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
	
	public void writeToStdOut(PrettyPrinter p) {
		
	}

}
