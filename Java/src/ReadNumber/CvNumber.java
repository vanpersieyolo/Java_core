package ReadNumber;

import java.util.Scanner;

public class CvNumber {
    public static void main(String[] args) {
        int enterNumber;
        int result;
        String[] nameNumber = {"one","two","three","four","five","six","seven","eight","nine"};
        String[] nameNumber1 = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] nameNumber2 = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String[] nameNumber3 = {"one hunderd","twohunderd","three hunderd", "four hunderd", "five hunderd", "six hunderd", "seven hunderd", "eight hunderd","nine hunderd"};
        System.out.println("nhap vao so can doc ( duoi 1000): ");
        Scanner scanner = new Scanner(System.in);
        enterNumber = scanner.nextInt();
        result = enterNumber % 10;
        if(enterNumber / 10 < 1){
            System.out.println(nameNumber[result -1 ]);
        }else {
            if (enterNumber / 10 < 2) {
                System.out.println(nameNumber1[result]);
            }else {
                if (enterNumber / 10 < 10){
                    System.out.println(nameNumber2[enterNumber/10 - 2] +"_"+nameNumber[result-1]);
                }else {
                    if (enterNumber / 10 >= 10 ){
                        if (result == 0){
                            if (result % 10 ==0){
                                System.out.println(nameNumber3[(enterNumber / 100) - 1]);
                            }
                        }else {
                            if (result % 10 < 1){

                            }
                        }

                    }
                }
            }
        }
    }
}
