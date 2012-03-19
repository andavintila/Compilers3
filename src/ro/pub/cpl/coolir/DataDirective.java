package ro.pub.cpl.coolir;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class DataDirective {

	public static enum DIRECTIVE {
		DW, DB, DL, DS
	}

	private List<String> labels = new ArrayList<String>();
	private DIRECTIVE mnemonic;
	private int integer;
	private String string;
	
	public DataDirective(DIRECTIVE mnemonic, int integer) {
		if (mnemonic == DataDirective.DIRECTIVE.DL) {
			throw new InvalidParameterException("DL has a string operand");
		}
		if(mnemonic == DataDirective.DIRECTIVE.DB && (integer < 0 || integer > 255)) {
			throw new InvalidParameterException("DB stores number between 0 and 255");
		}
		this.mnemonic = mnemonic;
		this.integer = integer;
		this.string = null;
	}
	public DataDirective(DIRECTIVE mnemonic, String string) {
		if (mnemonic != DataDirective.DIRECTIVE.DL && mnemonic != DataDirective.DIRECTIVE.DB) {
			throw new InvalidParameterException("only DL and DB have string operand");
		}
		this.mnemonic = mnemonic;
		this.string = string;
	}
	
	public void setLabels(List<String> labels) {
		this.labels = labels;
	}
	public List<String> getLabels() {
		return this.labels;
	}
    
    @Override
	public String toString() {
		String ret = "";
		for (String label: labels) {
			ret += label + ": ";
		}
		switch (this.mnemonic) {
		case DW:
			return ret + "DW " + this.integer;
		case DB:
			if(string != null) {
				ret += "DB " +  this.string; 
			} else {
				ret += "DB " + this.integer;
			}
			return ret;
		case DL:
			return ret + "DL " + this.string;
		case DS:
			return ret + "DS " + this.integer;
		default:
			return "ERROR";
		}
	}
}
