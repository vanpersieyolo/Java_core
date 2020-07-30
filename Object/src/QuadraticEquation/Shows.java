package QuadraticEquation;

import java.util.Scanner;

public class Shows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào giá trị a: ");
        double varA = scanner.nextDouble();
        System.out.println("nhập vào giá trị b: ");
        double varB = scanner.nextDouble();
        System.out.println("nhập vào giá trị c: ");
        double varC = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(varA, varB ,varC);
        if (quadraticEquation.getDelta() > 0){
            System.out.println("pt có 2 nhiệm phân biệt: " + quadraticEquation.getResult1()+ "và "+quadraticEquation.getResult2());
        }else if (quadraticEquation.getDelta()==0){
            System.out.println("pt có 1 nghiệm kép: "+ quadraticEquation.getcoupleResult());
        }else if(quadraticEquation.getDelta() < 0){
            System.out.println("pt vô nghiệm");
        }
    }
}
