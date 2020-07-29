package ReverseArray;

public class ReverseArray {

    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9} ;
        int temp = 0;

        for (int i = 1; i <= number.length/2 ; i++) {
            temp =  number[i-1];
            number[i-1] = number[number.length-i];
            number [number.length-i] = temp;

        }
        for (int i = 0; i <number.length ; i++) {
            System.out.print(number[i]+"__");
        }

    }
}
