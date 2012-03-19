package ro.pub.cpl.coolir;


public class MemoryInstruction extends Instruction {
	
	public static enum OPERATION {
		LOAD, STORE, LOADB, STOREB
	}

	private OPERATION mnemonic;
	private Register register;
	private MemoryLocation memLoc;

	public MemoryInstruction(OPERATION mnemonic, Register register, MemoryLocation memLoc) {
		this.mnemonic = mnemonic;
		this.register = register;
		this.memLoc = memLoc;
	}

	public boolean isLoad() {
		return this.mnemonic == MemoryInstruction.OPERATION.LOAD;
	}
	public boolean isStore() {
		return this.mnemonic == MemoryInstruction.OPERATION.STORE;
	}
	public boolean isLoadB() {
		return this.mnemonic == MemoryInstruction.OPERATION.LOADB;
	}
	public boolean isStoreB() {
		return this.mnemonic == MemoryInstruction.OPERATION.STOREB;
	}

	public Register getRegister() {
		return this.register;
	}
	public MemoryLocation getMemoryLocation() {
		return this.memLoc;
	}
    
    @Override
	public String toString() {
		String operation;
		switch (this.mnemonic) {
		case LOAD:
			operation = "load";
			break;
		case STORE:
			operation = "store";
			break;
		case LOADB:
			operation = "loadb";
			break;
		case STOREB:
			operation = "storeb";
			break;
		default:
			return "ERROR";
		}
		return labelsToString() + operation + " " + this.getRegister() + " " + this.getMemoryLocation();		
	}
}
