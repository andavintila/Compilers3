package ro.pub.cpl.coolir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Method {
	private String name;
	private List<Instruction> instructions;
	private int inParamCount;
	private int outParamCount;
	private BasicBlock predec;
	private Hashtable<Integer, BasicBlock> bbHt;
	private Hashtable<String, ArrayList<BasicBlock>> bbSucc;
	private Hashtable<String,Integer> bbLabel;
	private int currentIndex;
	private boolean newBlock;
	private int bbIndex;
	private String inst;
	private ArrayList<BasicBlock> bbReturn = new ArrayList<BasicBlock>();
	private ArrayList<String> labels = new ArrayList<String>();
	
	private ArrayList<Integer> reg = new ArrayList<Integer>();
	private boolean change = true;

	public Method(String name, int inParamCount, int outParamCount, List<Instruction> il) {
		this.name = name;
		this.inParamCount = inParamCount;
		this.outParamCount = outParamCount;
		this.instructions = il;
	}

	public String getName() {
        return name;
	}
	public List<Instruction> getInstructions() {
		return this.instructions;
	}
    
	public void setLabels(){
		for (int i = 0; i < instructions.size(); i++) {
			Instruction instr = instructions.get(i);
			if (instr instanceof JumpInstruction){
				String label = ((JumpInstruction)instr).getTargetLabel();
				labels.add(label);
			}
		}
	}
	
	public void setReg(){
		for (int i = 0; i < instructions.size(); i++) {
			Instruction instr = instructions.get(i);
			if (instr instanceof ArithmeticalInstruction){
				int register = ((ArithmeticalInstruction)instr).getDestOp().getIndex();
				if(!reg.contains(register)){
					reg.add(register);
				}
			}
			/*if (instr instanceof CallInstruction){
				if(!((CallInstruction)instr).isDirect()){
					int register1 = ((CallInstruction)instr).getIndirectCallee().getIndex();
					if(!reg.contains(register1)){
						reg.add(register1);
					}
				}
				ArrayList<Register> al = ((CallInstruction)instr).get
				
			}*/
			if (instr instanceof CopyInstruction){
				int register = ((CopyInstruction)instr).getRegister().getIndex();
				if(!reg.contains(register)){
					reg.add(register);
				}	
			}
			if (instr instanceof LogicalInstruction){
				int register = ((LogicalInstruction)instr).getDestOp().getIndex();
				if(!reg.contains(register)){
					reg.add(register);
				}
				
			}
		}
		Collections.sort(reg);
	}
	
	public void cfa(){
		predec = new BasicBlock(0);
		BasicBlock current = new BasicBlock(1);
		bbHt = new Hashtable<Integer, BasicBlock>();
		bbLabel = new Hashtable<String, Integer>();
		bbSucc = new Hashtable<String, ArrayList<BasicBlock>>();
		bbHt.put(0, predec);
		bbHt.put(1, current);
		bbLabel.put(instructions.get(0).lToString(),1);
		predec.addSuccessors(current);
		current.addPredecessors(predec);
		
		bbIndex = 1;
		newBlock = true;
		currentIndex = 1;
		for (int i = 0; i < instructions.size(); i++) {
			Instruction instr = instructions.get(i);
			inst = instr.toString();
			current.code += inst + "\n";
			current.instructions.add(instr);
			if (instr instanceof ReturnInstruction){
				bbIndex++;
				predec = current;
				current = new BasicBlock(bbIndex);
				bbHt.put(bbIndex, current);
				
				
				if(i==instructions.size()-1){
					current.addPredecessors(predec);
					for(int j = 0; j < bbReturn.size(); j++){
						bbReturn.get(j).addSuccessors(current);
						current.addPredecessors(bbReturn.get(j));
					}
					predec.addSuccessors(current);
				}
				else {
					bbReturn.add(predec);
					String label = instructions.get(i+1).lToString();
					if (bbLabel.get(label)==null){
						bbLabel.put(label, bbIndex);
						bbHt.put(bbIndex, current);
						if(bbSucc.get(label)!=null){
							ArrayList<BasicBlock> al = bbSucc.get(label);
							for (int j = 0; j < al.size(); j++){
								al.get(j).addSuccessors(current);
								current.addPredecessors(al.get(j));
							}
						}
					}
					else current = bbHt.get(bbLabel.get(label));
				
				}
			}
			
			else if (instr instanceof JumpInstruction){
				currentIndex++;
				predec = current;
				
				if (!instructions.get(i+1).lToString().equals("")){
					String label = instructions.get(i+1).lToString();
					if (bbLabel.get(label)==null){
						bbIndex++;
						bbLabel.put(label, bbIndex);
						current = new BasicBlock(bbIndex);
						bbHt.put(bbIndex, current);
						if(bbSucc.get(label)!=null){
							ArrayList<BasicBlock> al = bbSucc.get(label);
							for (int j = 0; j < al.size(); j++){
								al.get(j).addSuccessors(current);
								current.addPredecessors(al.get(j));
							}
						}
					}
					else current = bbHt.get(bbLabel.get(label));
				}
				else{
					bbIndex++;
					current = new BasicBlock(bbIndex);
					bbHt.put(bbIndex, current);
				}
				
				if (!((JumpInstruction)instr).isJumpUncond()){
					predec.addSuccessors(current);
					current.addPredecessors(predec);
				}
				
				//instructiune jump
				String label = ((JumpInstruction)instr).getTargetLabel();
				BasicBlock newBB;
				if (bbLabel.get(label) == null){
					if(bbSucc.get(label) == null){
						ArrayList<BasicBlock> al = new ArrayList<BasicBlock>();
						al.add(predec);
						bbSucc.put(label, al);
					}
					else bbSucc.get(label).add(predec);
					
				}
				else
					{
					newBB = bbHt.get(bbLabel.get(label));
					newBB.addPredecessors(predec);
					predec.addSuccessors(newBB);
					}
			}
			else if (i+1 < instructions.size() && !instructions.get(i+1).lToString().equals("")){
				String label = instructions.get(i+1).lToString();
				if (labels.contains(label)){
					currentIndex++;
					predec = current;
					if (bbLabel.get(label)==null){
						//creare bloc nou
						bbIndex++;
						bbLabel.put(label, bbIndex);
						current = new BasicBlock(bbIndex);
						bbHt.put(bbIndex, current);
						if(bbSucc.get(label)!=null){
							ArrayList<BasicBlock> al = bbSucc.get(label);
							for (int j = 0; j < al.size(); j++){
								al.get(j).addSuccessors(current);
								current.addPredecessors(al.get(j));
							}
						}
					}
					else current = bbHt.get(bbLabel.get(label));
					predec.addSuccessors(current);
					current.addPredecessors(predec);
				}
			}
			
		}
	}
	
	public void setIn(BasicBlock b){
		Integer val;
		boolean nac;
		HashMap<Integer, Integer> newIn= new HashMap<Integer, Integer>();
		//System.out.println("Basic Block " + b.index);
		for (int i = 0; i < reg.size(); i++){
			if (b.predecessors.size()>0){
			//	System.out.println("Registru " + reg.get(i));
				val = b.predecessors.get(0).out.get(reg.get(i));
			//	System.out.println("Valoare predecesor: " + b.predecessors.get(0).out.get(reg.get(i)));
				nac = false;
				for (int j = 1; j < b.predecessors.size(); j++){
					if (val != null && val == -1){
						nac = true;
						break;
					}
					Integer newVal = b.predecessors.get(j).out.get(reg.get(i));
				//	System.out.println("Valoare predecesor in for: " + b.predecessors.get(j).out.get(reg.get(i)));
				//	if (newVal!=null && newVal.equals(val) && val!=null) System.out.println("sunt egale");
					if (newVal!=null  && (!newVal.equals(val) && val!=null || newVal == -1)){
					//	System.out.println("intru aici");
						nac = true;
						break;
					}
					if (val == null && newVal!=null){
						val = newVal;
					}
					//if (val!=null && newVal!= null){
					//	nac = 
					//}
				}
				if (!nac) {
					//System.out.println("Valoarea finala: " + val);
					newIn.put(reg.get(i), val);
				}
				else{
					//System.out.println("Valoarea finala: " + "-1");
					newIn.put(reg.get(i), -1);
				}
			}
		}
		for (int i = 0; i < reg.size(); i++){
			if (
					//(b.in.get(reg.get(i))!=null && newIn.get(reg.get(i))==null) || (b.in.get(reg.get(i))==null && newIn.get(reg.get(i))!=null) || (
					//b.in.get(reg.get(i))!=null && newIn.get(reg.get(i))!=null &&
					b.in.get(reg.get(i))!=newIn.get(reg.get(i))){
				change = true;
			}
		}
		b.in = newIn;
		for (int i = 0; i < reg.size(); i++){
			b.out.put(reg.get(i), b.in.get(reg.get(i)));
		}
	//	b.out = newIn;
	}
	//adaugare call assign
	//adaugare undef ^ v = v
	public void dfa(){
		int count = 0;
		BasicBlock bbInit = bbHt.get(0);
		for (int i = 0; i < reg.size(); i++){
			bbInit.out.put(reg.get(i),-1);
			bbInit.in.put(reg.get(i),-1);
		}
		while(change && count < 40){
			count ++;
		//	System.out.println("ciclam");
			change = false;
			for (int i = 1; i <= bbIndex; i++){
				BasicBlock bb = bbHt.get(i);
				//construire in
				setIn(bb);
				for (int j = 0; j < bb.instructions.size(); j++) {
					Instruction instr = bb.instructions.get(j);
					if (instr instanceof ArithmeticalInstruction){
						ArithmeticalInstruction ai = (ArithmeticalInstruction)instr;
						int dest = ai.getDestOp().getIndex();
						Operand first = ai.getFirstOperand();
						Operand second = ai.getSecondOperand();
						if (first instanceof Register && second instanceof Register){
							Integer op1 = bb.out.get(((Register)first).getIndex());
							Integer op2 = bb.out.get(((Register)second).getIndex());
							if (op1!= null && op2!=null && op1 != -1 && op2 != -1){
							//	change = true;
								if(ai.getMnemonic() == ArithmeticalInstruction.OPERATION.ADD)
									bb.out.put(dest, op1 + op2);
								if(ai.getMnemonic() == ArithmeticalInstruction.OPERATION.DIV) 
									bb.out.put(dest, op1 / op2);
								if(ai.getMnemonic() == ArithmeticalInstruction.OPERATION.MUL) 
									bb.out.put(dest, op1 * op2);
								if(ai.getMnemonic() == ArithmeticalInstruction.OPERATION.SUB) 
									bb.out.put(dest, op1 - op2);
							}
							else if ((op1!= null && op1 == -1) || (op2!=null && op2 == -1)){
								bb.out.put(dest, -1);
							}
							else bb.out.remove(dest);
								
						}
					}
					//usuported operand exception
					if (instr instanceof CopyInstruction){
						CopyInstruction ci = (CopyInstruction)instr;
						if(ci.isOperandToRegister()){
							Operand op = ci.getOperand();
							if(op instanceof IntConstant){
							//	change = true;
								bb.out.put(ci.getRegister().getIndex(), ((IntConstant)op).getValue());
							}
							if(op instanceof Register){
							//	if (bb.in.get(((Register)op).getIndex())==-1){
								//	change = true;
								//	System.out.println(bb.out.get(((Register)op).getIndex()));
									bb.out.put(ci.getRegister().getIndex(), bb.out.get(((Register)op).getIndex()));
							//	}
							//	else bb.out.put(ci.getRegister().getIndex(), -1);
							}
						}
						else if (ci.isLabelToRegister() || ci.isInRegisterToRegister()) 
							bb.out.put(ci.getRegister().getIndex(), -1);
					}
					
					if (instr instanceof CallInstruction){
						CallInstruction ci = (CallInstruction) instr;
						if (ci.getRetvals()!= null && ci.getRetvals().size() > 0){
							for (int k = 0; k < ci.getRetvals().size(); k++)
								bb.out.put(ci.getRetvals().get(k).getIndex(),-1);
						}
					}
					
					if (instr instanceof LogicalInstruction){
						LogicalInstruction li = (LogicalInstruction)instr;
						int dest = li.getDestOp().getIndex();
						Operand first = li.getFirstOperand();
						Operand second = li.getSecondOperand();
						if (first instanceof Register && second instanceof Register){
							Integer op1 = bb.out.get(((Register)first).getIndex());
							Integer op2 = bb.out.get(((Register)second).getIndex());
							if (op1!= null && op2!=null && op1 != -1 && op2 != -1){
							//	change = true;
								if(li.isEq()){
									if (op1 == op2) 
										bb.out.put(dest, 1);
									else bb.out.put(dest, 0);
								}
								if(li.isLe()){
									if (op1 <= op2) 
										bb.out.put(dest, 1);
									else bb.out.put(dest, 0);
								}
								if(li.isLt()){
									if (op1 < op2) 
										bb.out.put(dest, 1);
									else bb.out.put(dest, 0);
								}
								
							}
							else if ((op1!= null && op1 == -1) || (op2!=null && op2 == -1)){
								bb.out.put(dest, -1);
							}
							else bb.out.remove(dest);
						}
						else if (first instanceof Register){
							Integer op1 = bb.out.get(((Register)first).getIndex());
							if(op1 != -1 && li.isNot()){
								//change = true;
								if (op1 == 0) 
									bb.out.put(dest, 1);
								else bb.out.put(dest, 0);
							}
							else bb.out.put(dest,-1);
						}
						
					}
				}
				
			}
		}
	}
   
	public String toStringCFA() {
    	setLabels();
    	cfa();
		String ret = ".function " + "\"" + name + "\"" + "," + inParamCount + "," + outParamCount + "\n";
		for (int i = 0; i <= bbIndex; i++){
			BasicBlock newBB = bbHt.get(i);
			ret += newBB.getTitle();
			ret += newBB.code;
			ret += newBB.getSuccessors();
			ret += newBB.getPredecessors();
			ret += "\n";
		}
		
		ret += ".end\n";
		return ret;
	}
    
	public String toStringDFA(){
		setReg();
		dfa();
		String ret = ".function " + "\"" + name + "\"" + "," + inParamCount + "," + outParamCount + "\n";
		for (int i = 0; i <= bbIndex; i++){
			BasicBlock newBB = bbHt.get(i);
			ret += newBB.getTitle();
			ret += newBB.getIn(reg);
			ret += newBB.getOut(reg);
			ret += "\n";
		}
		
		ret += ".end\n";
		return ret;
	}
}
