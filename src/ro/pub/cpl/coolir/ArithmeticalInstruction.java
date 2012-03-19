package ro.pub.cpl.coolir;


public class ArithmeticalInstruction extends Instruction {
	
	public static enum OPERATION {
		ADD, SUB, MUL, DIV
	} 

	private OPERATION mnemonic;
	private Register destOp;
	private Operand firstOp;
	private Operand secondOp;

	public ArithmeticalInstruction(OPERATION mnemonic, Register destOp, Operand firstOp, Operand secondOp) {
		this.mnemonic = mnemonic;
		this.destOp = destOp;
		this.firstOp = firstOp;
		this.secondOp = secondOp;
	}

	public Register getDestOp() {
		return this.destOp;
	}

	public Operand getFirstOperand() {
		return this.firstOp;
	}

	public Operand getSecondOperand() {
		return this.secondOp;
	}
	
	public OPERATION getMnemonic() {
		return this.mnemonic;
	}
    
    @Override
	public String toString() {
		String operation;
		switch (this.mnemonic) {
		case ADD: 
			operation = "+";
			break;
		case SUB: 
			operation = "-";
			break;
		case MUL:
			operation = "*";
			break;
		case DIV:
			operation = "/";
			break;
		default:
			return "ERROR";
		}
		return labelsToString() + this.getDestOp() + " <- " +
				this.getFirstOperand() + " " + operation + " " + this.getSecondOperand(); 
	}
}
