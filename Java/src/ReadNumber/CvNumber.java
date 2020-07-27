package ReadNumber;

import java.util.Scanner;

public class CvNumber {
    public static void main(String[] args) {
        int enterNumber;
//        int result;
//        int surplus;
        int result1;
        System.out.println("nhập vào số cần đọc ( nhỏ hơn 1000) : ");
        Scanner scanner = new Scanner(System.in);
        enterNumber = scanner.nextInt();

//        result = enterNumber / 10;
//        surplus = enterNumber % 10;
        result1 = enterNumber / 100;
        String zero = "zero";
        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";
        String five = "five";
        String six = "six";
        String seven = "seven";
        String eight = "eight";
        String nine = "nine";

        if (result1 >= 1 ){
            switch (result1){
                case 1:
                    if (result1 / 10 >= 1 && result1 < 20){

                    }
            }
        }
    }
}
