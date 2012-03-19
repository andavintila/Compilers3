package ro.pub.cpl.coolir;


public class CopyInstruction extends Instruction {
	
	public static enum OPERATION {
		OP_TO_REG, INR_TO_REG, REG_TO_INR, LBL_TO_REG
	}
	
	private OPERATION mnemonic;
	private Register reg;
	private Operand op;
	private InRegister inReg;
	private String label;

	private void init(OPERATION opToReg, Register reg, Operand op, InRegister inReg, String label) {
		this.mnemonic = opToReg;
		this.reg = reg;
		this.op = op;
		this.inReg = inReg;
		this.label = label;
	}

	public CopyInstruction(Register reg, Operand op) {
		this.init(CopyInstruction.OPERATION.OP_TO_REG, reg, op, null, null);
	}
	public CopyInstruction(Register reg, InRegister inReg) {
		this.init(CopyInstruction.OPERATION.INR_TO_REG, reg, null, inReg, null);
	}
	public CopyInstruction(InRegister inReg, Register reg) {
		this.init(CopyInstruction.OPERATION.REG_TO_INR, reg, null, inReg, null);
	}
	public CopyInstruction(Register reg, String label) {
		this.init(CopyInstruction.OPERATION.LBL_TO_REG, reg, null, null, label);
	}

	public boolean isOperandToRegister() {
		return this.mnemonic == CopyInstruction.OPERATION.OP_TO_REG;
	}
	public boolean isInRegisterToRegister() {
		return this.mnemonic == CopyInstruction.OPERATION.INR_TO_REG;
	}
	public boolean isRegisterToInRegister() {
		return this.mnemonic == CopyInstruction.OPERATION.REG_TO_INR;
	}
	public boolean isLabelToRegister() {
		return this.mnemonic == CopyInstruction.OPERATION.LBL_TO_REG;
	}
	public Register getRegister() {
		return this.reg;
	}
	public InRegister getInRegister() {
		if (isOperandToRegister()) {
			throw new UnsupportedOperationException("OP_TO_REG copy doesn't have an in register");
		}
		return this.inReg;
	}
	public Operand getOperand() {
		if (isOperandToRegister() == false) {
			throw new UnsupportedOperationException("only OP_TO_REG copy has an operand");
		}
		return this.op;
	}
	public String getLabel() {
		if (isLabelToRegister() == false) {
			throw new UnsupportedOperationException("only LBL_TO_REG copy has a label");
		}
		return this.label;
	}
    
    @Override
	public String toString() {
		switch (this.mnemonic) {
		case OP_TO_REG:
			return labelsToString() + this.getRegister() + " <- " + this.getOperand();
		case INR_TO_REG:
			return labelsToString() + this.getRegister() + " <- " + this.getInRegister();
		case REG_TO_INR:
			return labelsToString() + this.getInRegister() + " <- " + this.getRegister();
		case LBL_TO_REG:
			return labelsToString() + this.getRegister() + " <- " + this.getLabel();
		default:
			return "ERROR";
		}
	}
}
