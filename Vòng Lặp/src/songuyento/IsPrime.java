package songuyento;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("nhap vao so can kiem tra: ");
        int enterNum ;
        boolean check = true;

        Scanner scanner = new Scanner(System.in);
        enterNum = scanner.nextInt();
        if (enterNum < 2){
            System.out.printf("%d is not prime ",enterNum);
        }
        if (enterNum >= 2) {

            for (int i = 2; i <= Math.sqrt(enterNum); i ++) {
                if (enterNum % i == 0) {
                   check = false;
                   break;
                }
            }
        }
        if (check) {
            System.out.printf("%d is  prime", enterNum);
        } else {
            System.out.printf("%d is  not prime", enterNum);
        }
    }
}
