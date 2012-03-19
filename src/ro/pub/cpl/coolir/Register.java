package ro.pub.cpl.coolir;

public class Register extends Operand {
	private int index;

	public Register(int index) {
		this.index = index;
	}

	public int getIndex() {
		return this.index;
	}
	
    @Override
	public String toString() {
		return "VR" + index;
	}
}
