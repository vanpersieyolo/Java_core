package changeCurrency;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        System.out.println("mời bạn chọn giá trị cần nhập vào: ");

        double vnd = 0;
        double dollar = 0;

        Scanner scanner = new Scanner(System.in);
        vnd = scanner.nextDouble();

        dollar = vnd / 23000;

        System.out.printf("giá trị đồng dollar = %f$",dollar);

    }
}
