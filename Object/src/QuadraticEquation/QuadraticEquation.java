package QuadraticEquation;

public class QuadraticEquation {
    double varA , varB, varC, delta;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double varA, double varB, double varC){
        this.varA = varA;
        this.varB = varB;
        this.varC = varC;
    }
    public double getDelta(){
        delta = Math.pow(varB,2) - 4 * varA * varC;
        return delta;
    }
    public double getResult1(){
        return (-varB + Math.sqrt(delta)/2 * varA);
    }
    public  double getResult2(){
        return  (-varB - Math.sqrt(delta)/2 * varA);
    }
    public  double getcoupleResult(){
        return (-varB / 2 * varA);
    }

}
