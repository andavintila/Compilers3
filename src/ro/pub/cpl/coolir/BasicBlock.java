package ro.pub.cpl.coolir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class BasicBlock implements Comparable{
	int index;
	ArrayList<BasicBlock> successors = new ArrayList<BasicBlock>();
	ArrayList<BasicBlock> predecessors =  new ArrayList<BasicBlock>();
	ArrayList<Instruction> instructions = new ArrayList<Instruction>();
	HashMap<Integer,Integer> in = new HashMap<Integer,Integer>();
	HashMap<Integer,Integer> out = new HashMap<Integer,Integer>();
	String code;
	
	public BasicBlock(int index) {
		super();
		this.index = index;
		this.code = "";
	}

	public String getTitle() {
		return "# BB" + index + " #\n";
	}
	
	public String getSuccessors(){
		Collections.sort(successors);
		String s = "Successors:";
		for (int i = 0; i < successors.size(); i++){
			s  += " BB" + successors.get(i).index;
		}
		return s + "\n";
	}
	
	public String getPredecessors(){
		Collections.sort(predecessors);
		String s = "Predecessors:";
		for (int i = 0; i < predecessors.size(); i++){
			s  += " BB" + predecessors.get(i).index;
		}
		return s + "\n";
	}

	public void addSuccessors(BasicBlock bb){
		if (!successors.contains(bb))
			successors.add(bb);
	}
	
	public void addPredecessors(BasicBlock bb){
		if (!predecessors.contains(bb))
			predecessors.add(bb);
	}
	
	public String getIn(ArrayList<Integer> al){
		String s = "In:";
		String val;
		for (int i = 0; i < al.size(); i++){
			if (in.get(al.get(i)) == null)
				val = "UNDEF";
			else if (in.get(al.get(i)) == -1){
				val = "NAC";
			}
			else val = in.get(al.get(i)).toString();
			s += " VR" + al.get(i) + "(" + val + ")";
		}
		return s + "\n";
	}
	
	public String getOut(ArrayList<Integer> al){
		String s = "Out:";
		String val;
		for (int i = 0; i < al.size(); i++){
			if (out.get(al.get(i)) == null)
				val = "UNDEF";
			else if (out.get(al.get(i)) == -1){
				val = "NAC";
			}
			else
				val = out.get(al.get(i)).toString();
			s += " VR" + al.get(i) + "(" + val + ")";
		}
		return s + "\n";
	}
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return  this.index - ((BasicBlock)arg0).index;
	}
}
