package uk.ac.derby.ldi.slip.operators;

import uk.ac.derby.ldi.slip.values.Value;

/** (< parm1 parm2 ... parmn) */
public class LessThan extends Comparison {

	private static final long serialVersionUID = 0;
	
	boolean comparison(Value left, Value right) {
		return left.lt(right).booleanValue();
	}

	public String getOperatorName() {
		return "<";
	}

}
