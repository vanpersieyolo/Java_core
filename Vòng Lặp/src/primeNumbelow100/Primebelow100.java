package primeNumbelow100;

import java.util.Scanner;

public class Primebelow100 {
    public static void main(String[] args) {
        int limitValue = 0;
        boolean check = true;
        System.out.println("giá trị giới hạn: ");
        Scanner scanner = new Scanner(System.in);
        limitValue = scanner.nextInt();

        for (int i = 2; i < limitValue ; i++) {
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0){
                    check = false;
                }
            }
            if (check){
                System.out.print(i+"__");
            }
            check = true;
        }

    }
}
