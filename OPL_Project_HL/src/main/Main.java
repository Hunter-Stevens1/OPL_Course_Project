package main;

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
    
    public static void main(String[] args) {
        
        //TEST SUITE FOR PP
        JExpr test;
        JNum j = new JNum(1);
        System.out.println(j.pp());
    }
    
}