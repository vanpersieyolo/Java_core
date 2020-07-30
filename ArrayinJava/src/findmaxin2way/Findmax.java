package findmaxin2way;

import java.util.Scanner;

public class Findmax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bạn muốn nhập mấy mảng con ?");
        int mainar = scanner.nextInt();

        System.out.println("nhập vào chỉ số mảng con ( 1- 5): ");

        int[][] mainAr = new int[mainar][];
        definedSub(mainAr);

        for (int i = 0; i < mainAr.length ; i++) {
            for (int j = 0; j <mainAr[i].length ; j++) {
                mainAr[i][j]= (int)(Math.random()*100);
                System.out.print(mainAr[i][j]+" ");
            }
            System.out.println();
        }
        int max = mainAr[0][0];
        for (int i = 0; i < mainar ; i++) {
            for (int j = 0; j < mainAr[i].length; j++) {
                if (max < mainAr[i][j]){
                    max = mainAr[i][j];
                }
            }
        }
        System.out.println(max + "là số lớn nhất trong mảng 2 chiều");
    }
    public static void definedSub (int [][] arr){
        Scanner scanner = new Scanner(System.in);
        int subIndex = scanner.nextInt();
        for (int i = 0; i <arr.length ; i++) {
                arr[i] = new int[subIndex] ;
        }
    }
}
