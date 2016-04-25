
package jminusminus;

import static jminusminus.CLConstants.INEG;

public class JBreak extends JExpression {
	public JBreak(int line) {
        super(line);
    }
	
	public void writeToStdOut(PrettyPrinter p) {
        p.printf("<Break>\n");
    }

	public JExpression analyze(Context context) {

        return this;
    }
	
    public void codegen(CLEmitter output) {

    }
	
}
