package jminusminus;

import java.util.ArrayList;

import static jminusminus.CLConstants.*;

public class JThrowsClause extends JAST implements JMember{

    /** The qualified identifiers. */
    protected ArrayList<TypeName> identifiers;
    
    /**
     * Construct an AST node for a method declaration given the
     * line number, method name, return type, formal parameters,
     * and the method body.
     * 
     * @param line
     *                line in which the method declaration occurs
     *                in the source file.
     * @param mods
     *                modifiers.
     * @param name
     *                method name.
     * @param returnType
     *                return type.
     * @param params
     *                the formal parameters.
     * @param body
     *                method body.
     */

    public JThrowsClause(int line, ArrayList<TypeName> identifiers)

    {
        super(line);
        this.identifiers = identifiers;        
    }
    
    public void preAnalyze(Context context, CLEmitter partial) {
    	
    }
    
    public JAST analyze(Context context) {
    	return this;
    }
    
    public void codegen(CLEmitter output) {
    	
    }
    
    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JThrowsDeclaration line=\"%d\" >\n", line());
        p.indentRight();
        p.println("<QualifiedIdentifiers>");
        if (identifiers != null) {
	        for (TypeName qid : identifiers) {
	            p.indentRight();
                p.printf("<Identifier name=\"%s\"/>\n", qid.toString());	            
	            p.indentLeft();
	        }
        }
        p.println("</QualifiedIdentifiers>");     
        p.indentLeft();
        p.println("</JThrowsDeclaration>");
    }
}
