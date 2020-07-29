package addElement;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[]arrayBuild = new int[10];
        EnterArray1(arrayBuild);
        addElement(arrayBuild);

    }
    public static void EnterArray1 (int [] a ){
        System.out.println("nhập vào 1 chuỗi 10 phần tử: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            a[i]= scanner.nextInt();
        }
    }
    public static void addElement(int[]b) {

        System.out.println("nhâp vào giá trị cần thêm: ");
        System.out.println("thêm phần tử tại vị trí sô:( 0 -> 9) ");
        Scanner scanner = new Scanner(System.in);
        int enterTrim = scanner.nextInt();
        int temp = scanner.nextInt();
        for (int i = enterTrim; i <b.length-1 ; i++) {
            b[i] = temp;

        }

        for (int i = 0; i < b.length ; i++) {
            System.out.print(b[i] +" ");
        }
    }
}
