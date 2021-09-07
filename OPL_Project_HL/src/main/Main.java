package main;

import java.io.*;
import java.util.Random;

interface JExpr{
    public String pp();
}
   
class JNum implements JExpr{
    int n;
    JNum(int n){
        this.n = n;
    }
    public String pp(){
        return Integer.toString(n);
    }
}

class JPlus implements JExpr{
    JExpr lhs, rhs;
    JPlus(JExpr lhs, JExpr rhs){
        this.lhs = lhs;
        this.rhs = rhs;
    } 
    public String pp(){
        return "(+ " + lhs.pp() + " " + rhs.pp() + ")";
    }
}

class JMult implements JExpr{
    JExpr lhs, rhs;
    JMult(JExpr lhs, JExpr rhs){
        this.rhs = rhs;
        this.lhs = lhs;
    }
    public String pp(){
        return "(* " + lhs.pp() + " " + rhs.pp() + ")";
    }
}



public class Main {
	
	//test suite for J0 programs
	public static void ppTest() {
		
		Random rand = new Random();
		
		JNum jnum1 = new JNum(1);
		JNum jnum2 = new JNum(1);
		
		for(int i = 1; i <= 12; i++) {
			jnum1.n = rand.nextInt(1000);
			jnum2.n = rand.nextInt(1000);
			
			if(i % 4 == 1 && i != 1) {
				System.out.println();
			}
			if (i <= 4) {
				System.out.println("PPTest " + i + ": Expected: " + jnum1.n + " Output: " + jnum1.pp());
			}
			if (i > 4 && i <=8) {
				JPlus jplus = new JPlus(jnum1, jnum2);
				System.out.println("PPTest " + i + ": Expected: (+ " + jnum1.n + " " + jnum2.n + ") Output: " + jplus.pp());
			}
			if (i > 8 && i <=12) {
				JMult jmult = new JMult(jnum1, jnum2);
				System.out.println("PPTest " + i + ": Expected: (* " + jnum1.n + " " + jnum2.n + ") Output: " + jmult.pp());
			}
			
		}
		
		
	}
	
	
    public static void main(String[] args) {
        ppTest();
    }
    
}