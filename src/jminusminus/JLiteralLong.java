
package jminusminus;

import static jminusminus.CLConstants.*;

/**
 * The AST node for a long literal.
 */

class JLiteralLong extends JExpression {

    /** String representation of the long. */
    private String text;

    /**
     * Construct an AST node for an long literal given its line number and string
     * representation.
     * 
     * @param line
     *            line in which the literal occurs in the source file.
     * @param text
     *            string representation of the literal.
     */

    public JLiteralLong(int line, String text) {
        super(line);
        this.text = text;
    }

    /**
     * Analyzing an long literal is trivial.
     * 
     * @param context
     *            context in which names are resolved (ignored here).
     * @return the analyzed (and possibly rewritten) AST subtree.
     */

    public JExpression analyze(Context context) {
        type = Type.LONG;
        return this;
    }

    /**
     * Generating code for an int literal means generating code to push it onto
     * the stack.
     * 
     * @param output
     *            the code emitter (basically an abstraction for producing the
     *            .class file).
     */

    public void codegen(CLEmitter output) {
    	int radix = 10;
    	if (text == "0") {
    		radix = 10;
    	} else if (text.charAt(0) == '0') {
    		if (text.charAt(1) == 'x' || text.charAt(1) == 'X') {
    			radix = 16;
    			text = text.substring(2);
    		} else {
    			radix = 8;
    		}
    	}
    	if (text.charAt(text.length() - 1) == 'l' || text.charAt(text.length() - 1) == 'L') {
    		text = text.substring(0, text.length() - 2);
    	}
        long i = Long.parseLong(text, radix);
        if (i == 0L){
        	output.addNoArgInstruction(LCONST_0);
        } else if (i == 1L) {
        	output.addNoArgInstruction(LCONST_1);
        } else {
        	output.addLDCInstruction(i);
        }
    }

    /**
     * @inheritDoc
     */

    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JLiteralLong line=\"%d\" type=\"%s\" " + "value=\"%s\"/>\n",
                line(), ((type == null) ? "" : type.toString()), text);
    }

}
