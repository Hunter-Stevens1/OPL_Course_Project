package main;

interface JExpr{
}
   
class JNum implements JExpr{
    int n;
    JNum(int n){
        this.n = n;
    }
}

class JPlus implements JExpr{
    JExpr lhs, rhs;
    JPlus(JExpr lhs, JExpr rhs){
        this.lhs = lhs;
        this.rhs = rhs;
    } 
}

class JMult implements JExpr{
    JExpr lhs, rhs;
    JMult(JExpr lhs, JExpr rhs){
        this.rhs = rhs;
        this.lhs = lhs;
    }
}



public class Main {
    
    public static void main(String[] args) {
    	System.out.println("Hello world!");
    }
    
}