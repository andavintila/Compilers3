package ro.pub.cpl.coolir;

public class IntConstant extends Operand {
	private int value;

	public IntConstant(String stringValue) {
		this.value = Integer.parseInt(stringValue);
	}

	public int getValue() {
		return value;
	}
	
    @Override
	public String toString() {
		return value + "";
	}
}
