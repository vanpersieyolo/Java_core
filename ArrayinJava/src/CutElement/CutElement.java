package CutElement;

import java.util.Scanner;

public class CutElement {
    public static void main(String[] args) {
        int[]arrayBuild = new int[10];
        EnterArray(arrayBuild);
        cutElement(arrayBuild);
    }
    public static void EnterArray(int[]a){
        System.out.println("nhập vào 1 chuỗi 10 phần tử: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <a.length ; i++) {
            a[i]= scanner.nextInt();
        }
    }
    public static void cutElement(int[]b) {
        System.out.println("xóa phần tử tại vị trí sô:( 0 -> 9) ");
        Scanner scanner = new Scanner(System.in);
        int enterTrim = scanner.nextInt();
        for (int i = enterTrim; i <b.length-1 ; i++) {
            b[i] = b[i+1];

        }
        b[b.length-1]=0;
        for (int i = 0; i < b.length ; i++) {
            System.out.print(b[i] +" ");
        }
    }
}
