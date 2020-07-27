package TestLeapYear;

import java.util.Scanner;

public class TestYear {
    public static void main(String[] args) {
        System.out.println("nhập vào số năm muốn kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 4 == 0  ){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.printf("%d This year is leap year",year);
                }else {
                    System.out.printf("%d This year is not leap year ", year);
                }
            }else {
                System.out.printf("%d This year is leap year",year);
            }
        }else {
            System.out.printf("%d This year is not leap year ", year);
        }
    }
}
