package ro.pub.cpl.coolir;
import java.util.*;

public class Program {
	private List<Method> methods;
	private List<DataDirective> dataDirectives;

	public Program(List<Method> methods, List<DataDirective> dataDirectives) {
		this.methods = methods;
		this.dataDirectives = dataDirectives;
	}

	public List<Method> getMethods() {
		return methods;
	}
	public List<DataDirective> getDataDirectives() {
		return dataDirectives;
	}
    
//    @Override
	public String toStringCFA() {
		//String ret = ".code\n\n";
    	String ret = "";
		for (Method method: methods) {
			ret += method.toStringCFA() + "\n\n";
		}
		//ret += ".data\n";
		//for (DataDirective dd: dataDirectives) {
		//	ret += dd.toString() + "\n";
		//}
		return ret;
	}
	public String toStringDFA() {
		//String ret = ".code\n\n";
    	String ret = "";
		for (Method method: methods) {
			ret += method.toStringDFA() + "\n\n";
		}
		//ret += ".data\n";
		//for (DataDirective dd: dataDirectives) {
		//	ret += dd.toString() + "\n";
		//}
		return ret;
	}
}
