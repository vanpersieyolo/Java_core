package PrintPrime;

import java.util.Scanner;

public class Display20primenumber {
    public static void main(String[] args) {
        int soLuong = 0;
        int number = 2;
        boolean check = true;
        System.out.println("nhập vào sô lượng số nguyên tố cần hiển thị: ");
        Scanner scanner = new Scanner(System.in);
        soLuong = scanner.nextInt();

        for (int i = 0; i < soLuong ; i++) {
            for (int j = 2; j <= Math.sqrt(number) ; j++) {
                System.out.print(i+"__");
            }
            number++;
        }


    }
}
