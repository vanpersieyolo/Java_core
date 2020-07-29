package FindMin;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        System.out.println("nhập vào chuỗi (10 phần tử): ");
        Scanner scanner = new Scanner(System.in);

        int [] array = new int[5];

        for (int i = 0; i <array.length ; i++) {
            array[i] = scanner.nextInt();
        }
        int checkMin = findMin(array);
        System.out.println("phần tử có giá trị nhỏ nhất trong mảng là: "+checkMin);
    }

    public static int findMin(int [] a) {
        int minmap = a[0];
        for (int i = 0; i <a.length ; i++) {
            if (minmap > a[i]){
                minmap = a[i];
            }
        }
        return minmap;
    }
}
