/* Generated By:JJTree: Do not edit this line. ASTInteger.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=uk.ac.derby.ldi.calcast.calculator.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package uk.ac.derby.ldi.calcast.parser;

public
class ASTInteger extends SimpleNode {
  public ASTInteger(int id) {
    super(id);
  }

  public ASTInteger(Calc p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(CalcVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=c2a83a9756877a7f2bdb4952e439cf62 (do not edit this line) */
