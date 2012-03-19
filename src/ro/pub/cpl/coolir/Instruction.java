package ro.pub.cpl.coolir;

import java.util.ArrayList;
import java.util.List;

public class Instruction {
	private List<String> labels;
	
	public Instruction() {
		this.labels = new ArrayList<String>();
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}
	public List<String> getLabels() {
		return this.labels;
	}
	public String labelsToString() {
		String ret = "";
		for (String label: labels) {
			//ret += "aici " + label +"\n";
			ret += label + ": \n";
		}
		return ret.length() > 0 ? ret.substring(0, ret.length() - 1) : ret;
	}
	public String lToString(){
		String ret = "";
		for (String label: labels) {
			ret += label;
		}
		return ret;
	}
}
