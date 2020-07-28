package borrowMonney;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Borrow {
    public static void main(String[] args) {
       int month = 1;
       double interestRate = 1.0;
       double money = 0.0;
       double tienLai = 0;

       Scanner scanner = new Scanner(System.in);
       System.out.println("nhập vào số tiền cần tình: ");
       money = scanner.nextDouble();
       System.out.println("nhập lãi suất / năm: ");
       interestRate = scanner.nextDouble();
        System.out.println("nhập số tháng cần gửi: ");
        month = scanner.nextInt();

        for (int i = 0; i < month ; i++) {
            tienLai += money * (interestRate/100) / 12 * month;
        }

        System.out.printf("tiền lãi thu được sau %d là: %f",month,tienLai);
    }
}
