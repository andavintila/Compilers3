package ro.pub.cpl.coolir; 

import java.util.List;

public class CallInstruction extends Instruction {
	private String directCallee;
	private Register indirectCallee;
	private List<Register> parameters;
	private List<Register> retvals;

	public CallInstruction(String directCallee, List<Register> parameters, List<Register> retvals) {
		this.directCallee = directCallee;
		this.indirectCallee = null;
		this.parameters = parameters;
		this.retvals = retvals;
	}

	public CallInstruction(Register indirectCallee, List<Register> parameters, List<Register> retvals) {
		this.directCallee = null;
		this.indirectCallee = indirectCallee;
		this.parameters = parameters;
		this.retvals = retvals;
	}

	public boolean isDirect() {
		return this.directCallee != null;
	}
	public String getDirectCallee() {
		if (this.isDirect()) {
			return this.directCallee;
		} else {
			throw new UnsupportedOperationException("indirect calls don't have a direct callee");
		}
	}
	public Register getIndirectCallee() {
		if (this.isDirect() == false) {
			return this.indirectCallee;
		} else {
			throw new UnsupportedOperationException("direct calls don't have a indirect callee");
		}
	}
	
	public List<Register> getRetvals(){
		return this.retvals;
	}
    
    @Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append(labelsToString());
		str.append(" ");

		if (retvals != null && retvals.size() > 0) {
			str.append("(");
			for (Register ret: retvals)
				str.append(" " + ret);
			str.append(" ) <- ");
		}
		if (this.isDirect()) {
			str.append("call " + this.directCallee);
		} else {
			str.append("call " + this.indirectCallee);
		}
		if (parameters != null && parameters.size() > 0) {
			str.append(" (");
			for (Register param: parameters)
				str.append(" " + param);
			str.append(" )");
		}
		return str.toString();
	}
}
