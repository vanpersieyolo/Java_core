package PrintPrime;

import java.util.Scanner;

public class Display20primenumber {
    public static void main(String[] args) {
        int count = 0;
        int number =2;
        boolean check = true;

        while (count < 20){
            for (int i = 2; i <= Math.sqrt(number); i ++) {
                if (number % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.print(number + "__");
                count++;
            }
            check = true;
            number++;

        }

    }
}
