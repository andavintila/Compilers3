package ro.pub.cpl.coolir;

public class LogicalInstruction extends Instruction {

	public static enum OPERATION {
		NOT, LT, LE, EQ
	}

	private OPERATION mnemonic;
	private Register destOp;
	private Operand firstOp;
	private Operand secondOp;

	public LogicalInstruction(OPERATION mnemonic, Register assignee,
			Operand firstOp, Operand secondOp) {
		this.mnemonic = mnemonic;
		this.destOp = assignee;
		this.firstOp = firstOp;
		this.secondOp = secondOp;
	}

	public boolean isNot() {
		return this.mnemonic == LogicalInstruction.OPERATION.NOT;
	}
	public boolean isLt() {
		return this.mnemonic == LogicalInstruction.OPERATION.LT;
	}
	public boolean isLe() {
		return this.mnemonic == LogicalInstruction.OPERATION.LE;
	}
	public boolean isEq() {
		return this.mnemonic == LogicalInstruction.OPERATION.EQ;
	}

	public Register getDestOp() {
		return this.destOp;
	}

	public Operand getFirstOperand() {
		return this.firstOp;
	}

	public Operand getSecondOperand() {
		if (this.mnemonic == LogicalInstruction.OPERATION.NOT) {
			throw new UnsupportedOperationException("~ does not have two operands");
		}
		return this.secondOp;
	}
    
    @Override
	public String toString() {
		if (this.mnemonic == LogicalInstruction.OPERATION.NOT) {
			return labelsToString() + this.getDestOp() + " <- ~ " +
				this.getFirstOperand();
		}
		String operation;
		switch (this.mnemonic) {
		case EQ:
			operation = "=";
			break;
		case LE:
			operation = "<=";
			break;
		case LT:
			operation = "<";
			break;
		default:
			return "ERROR";
		}
		return labelsToString() + this.getDestOp() + " <- " + 
			this.getFirstOperand() + " " + operation + " " + this.getSecondOperand();
	}
}
