package MergeArray;

import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("khởi tạo mảng 1: ");
        System.out.println("nhập vào size mảng 1 ( 1- 10): ");
        int sizeA = scanner.nextInt();
        int[] ar1 = new int[sizeA];
        System.out.println("nhập vào mảng: ");

        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = scanner.nextInt();
        }
        System.out.println("khởi tạo mảng 2: ");
        System.out.println("nhập vào size mảng 1 ( 1- 10): ");
        int sizeB = scanner.nextInt();
        int[] ar2 = new int[sizeB];
        System.out.println("nhập vào mảng: ");

        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = scanner.nextInt();
        }
        int[] ar3 = new int[ar1.length + ar2.length];
        for (int i = 0; i < ar1.length; i++) {
            ar3[i] = ar1[i];

        }
        for (int i = ar1.length+1; i < ar2.length+ar1.length ; i++) {
            ar3[i] = ar2[i-ar1.length];
        }
        for (int i = 0; i <ar3.length ; i++) {
            System.out.print(ar3[i]);
        }
    }

}
