
package jminusminus;

import static jminusminus.CLConstants.*;

/**
* The AST node for a ternary-expression. (_) ? _ : _
*/
public class JTernaryExpression extends JExpression{
	/** Test expression. */
	 private JExpression condition;

	 /** Then clause. */
	 private JExpression thenPart;

	 /** Else clause. */
	 private JExpression elsePart;
	 
	 /**
	  * Construct an AST node for a ternary if-statement given its line number, the test
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

	 public JTernaryExpression(int line, JExpression condition, JExpression thenPart,
			 JExpression elsePart) {
	     super(line);	     
	     this.condition = condition;
	     this.thenPart = thenPart;
	     this.elsePart = elsePart;
	 }
	 
	 /**
	  * Analyzing the if-statement means analyzing its components and checking
	  * that the test is boolean.
	  * 
	  * @param context
	  *            context in which names are resolved.
	  * @return the analyzed (and possibly rewritten) AST subtree.
	  */

	 public JExpression analyze(Context context) {
	     condition = (JExpression) condition.analyze(context);
	     condition.type().mustMatchExpected(line(), Type.BOOLEAN);
	     thenPart = (JExpression) thenPart.analyze(context);
	     if (elsePart != null) {
	         elsePart = (JExpression) elsePart.analyze(context);
	     }
	     return this;
	 }

	 /**
	  * Code generation for a ternary if-statement. We generate code to branch over the
	  * consequent if !test; the consequent is followed by an unconditonal branch
	  * over (any) alternate.
	  * 
	  * @param output
	  *            the code emitter (basically an abstraction for producing the
	  *            .class file).
	  */

	 public void codegen(CLEmitter output) {
	     String elseLabel = output.createLabel();
	     String endLabel = output.createLabel();
	     condition.codegen(output, elseLabel, false);
	     thenPart.codegen(output);
	     if (elsePart != null) {
	         output.addBranchInstruction(GOTO, endLabel);
	     }
	     output.addLabel(elseLabel);
	     if (elsePart != null) {
	         elsePart.codegen(output);
	         output.addLabel(endLabel);
	     }
	 }

	 /**
	  * @inheritDoc
	  */

	 public void writeToStdOut(PrettyPrinter p) {
	     p.printf("<JTernaryExpression line=\"%d\">\n", line());
	     p.indentRight();
	     p.printf("<TestExpression>\n");
	     p.indentRight();
	     condition.writeToStdOut(p);
	     p.indentLeft();
	     p.printf("</TestExpression>\n");
	     p.printf("<ThenClause>\n");
	     p.indentRight();
	     thenPart.writeToStdOut(p);
	     p.indentLeft();
	     p.printf("</ThenClause>\n");
	     if (elsePart != null) {
	         p.printf("<ElseClause>\n");
	         p.indentRight();
	         elsePart.writeToStdOut(p);
	         p.indentLeft();
	         p.printf("</ElseClause>\n");
	     }
	     p.indentLeft();
	     p.printf("</JTernaryExpression>\n");
	 }
}

//class JTernaryOp extends JTernaryExpression {
//
//    /**
//     * Construct an AST node for an addition expression given its line number,
//     * and the lhs and rhs operands.
//     * 
//     * @param line
//     *            line in which the addition expression occurs in the source
//     *            file.
//     * @param lhs
//     *            the lhs operand.
//     * @param rhs
//     *            the rhs operand.
//     */
//	
//	 /**
//	  * Construct an AST node for a ternary if-statement given its line number, the test
//	  * expression, the consequent, and the alternate.
//	  * 
//	  * @param line
//	  *            line in which the if-statement occurs in the source file.
//	  * @param condition
//	  *            test expression.
//	  * @param thenPart
//	  *            then clause.
//	  * @param elsePart
//	  *            else clause.
//	  */
//
//    public JTernaryOp(int line, JExpression condition, JExpression thenPart, JExpression elsePart) {
//        super(line, condition, thenPart, elsePart);
//    }
//
//    /**
//     * Analysis involves first analyzing the operands. If this is a string
//     * concatenation, we rewrite the subtree to make that explicit (and analyze
//     * that). Otherwise we check the types of the addition operands and compute
//     * the result type.
//     * 
//     * @param context
//     *            context in which names are resolved.
//     * @return the analyzed (and possibly rewritten) AST subtree.
//     */
//
//    public JExpression analyze(Context context) {
//        lhs = (JExpression) lhs.analyze(context);
//        rhs = (JExpression) rhs.analyze(context);
//        if (lhs.type() == Type.STRING || rhs.type() == Type.STRING) {
//            return (new JStringConcatenationOp(line, lhs, rhs))
//                    .analyze(context);
//        } else if (lhs.type() == Type.INT && rhs.type() == Type.INT) {
//            type = Type.INT;
//        } else {
//            type = Type.ANY;
//            JAST.compilationUnit.reportSemanticError(line(),
//                    "Invalid operand types for +");
//        }
//        return this;
//    }
//
//    /**
//     * Any string concatenation has been rewritten as a JStringConcatenationOp
//     * (in analyze()), so code generation here involves simply generating code
//     * for loading the operands onto the stack and then generating the
//     * appropriate add instruction.
//     * 
//     * @param output
//     *            the code emitter (basically an abstraction for producing the
//     *            .class file).
//     */
//
//    public void codegen(CLEmitter output) {
//        if (type == Type.INT) {
//            lhs.codegen(output);
//            rhs.codegen(output);
//            output.addNoArgInstruction(IADD);
//        }
//    }
//
//}
