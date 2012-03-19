package ro.pub.cpl.coolir;

public class InRegister {
	private int index;

	public InRegister(int index) {
		this.index = index;
	}

	public int getIndex() {
		return this.index;
	}
	
    @Override
	public String toString() {
		return "VI" + index;
	}
}
