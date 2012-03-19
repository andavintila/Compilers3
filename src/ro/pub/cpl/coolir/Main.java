
package ro.pub.cpl.coolir;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class Main 
{
	public static void main(String[] args) 
	{
		try {
			ANTLRFileStream input = new ANTLRFileStream(args[0]);
			CoolIrLexer lexer = new CoolIrLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			CoolIrParser parser = new CoolIrParser(tokens);
			
			Program p = parser.program();
			
		//	System.out.println(p);
			
			String cfa = args[0]+"_cfa";
			PrintWriter out_cfa = new PrintWriter(new FileWriter(cfa));
			out_cfa.println(p.toStringCFA());
			out_cfa.close();
			
			String dfa = args[0]+"_dfa";
			PrintWriter out_dfa = new PrintWriter(new FileWriter(dfa));
			out_dfa.println(p.toStringDFA());
			out_dfa.close();
			
			// TODO: control flow graph
			// TODO: live variables analysis
			// TODO: dead code elimination
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
	}
}
	