package MaxinArray;

import java.util.Scanner;

public class MaxinArray {
    public static void main(String[] args) {

        int [] array1 = new int [10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array1.length ; i++) {
            array1[i] = scanner.nextInt();
        }
        int print = max(array1);


    }

    public static int max(int [] x) {
        int max1 = x[0];
        for (int i = 1; i < x.length ; i++) {
            if (max1 < x[i]){
                max1 = x[i];
            }
        }
        System.out.println(max1);
       return max1;
    }
}
