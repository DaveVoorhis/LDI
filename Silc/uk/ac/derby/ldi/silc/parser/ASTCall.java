/* Generated By:JJTree: Do not edit this line. ASTCall.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=uk.ac.derby.ldi.silc.compiler.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package uk.ac.derby.ldi.silc.parser;

public
class ASTCall extends SimpleNode {
  public ASTCall(int id) {
    super(id);
  }

  public ASTCall(Silc p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SilcVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=34bd2ffc1f36878fa3dcb29c18faed49 (do not edit this line) */
