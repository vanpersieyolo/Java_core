package ReadNumber;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        int enterNumber;
        int result ;
        int surplus;
        System.out.println("nhập vào số cần đọc: ");
        Scanner scanner = new Scanner(System.in);
        enterNumber = scanner.nextInt();
        result = enterNumber / 10 ;
        surplus = enterNumber % 10;
        String zero = "zero";
        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";
        String five = "five";
        String six = "six";
        String seven = "seven";
        String eight = "eight";
        String nine = "nine";
        if (result < 1){
            switch (enterNumber){
                case 0:
                    System.out.println(zero);
                    break;
                case 1:
                    System.out.println(one);
                    break;
                case 2:
                    System.out.println(two);
                    break;
                case 3:
                    System.out.println(three);
                    break;
                case 4:
                    System.out.println(four);
                    break;
                case 5:
                    System.out.println(five);
                    break;
                case 6:
                    System.out.println(six);
                    break;
                case 7:
                    System.out.println(seven);
                    break;
                case 8:
                    System.out.println(eight);
                    break;
                case 9:
                    System.out.println(nine);
                    break;
            }
        }else {
            if (enterNumber < 20){
                switch (surplus){
                    case 0:
                        System.out.println("ten");
                        break;
                    case 1:
                        System.out.println("eleven");
                        break;
                    case 2:
                        System.out.println("twelve");
                        break;
                    case 3:
                        System.out.println("thirteen");
                        break;
                    case 4:
                        System.out.println("fourteen");
                        break;
                    case 5:
                        System.out.println("fifteen");
                        break;
                    case 6:
                        System.out.println("sixteen");
                        break;
                    case 7:
                        System.out.println("seventeen");
                        break;
                    case 8:
                        System.out.println("eighteen");
                        break;
                    case 9:
                        System.out.println("nineteen");
                        break;
                }
            }else {
                if (enterNumber > 20 && enterNumber < 100){
                    switch (result){
                        case 2:
                            if (surplus == 0){
                                System.out.println("twenty");
                            }
                            if (surplus == 1){
                                System.out.println("twenty " + one);
                            }
                            if (surplus == 2){
                                System.out.println("twenty " + two);
                            }
                            if (surplus == 3){
                                System.out.println("twenty " + three);
                            }
                            if (surplus == 4){
                                System.out.println("twenty " + four);
                            }
                            if (surplus == 5){
                                System.out.println("twenty " + five);
                            }
                            if (surplus == 6){
                                System.out.println("twenty " + six);
                            }
                            if (surplus == 7){
                                System.out.println("twenty " + seven);
                            }
                            if (surplus == 8){
                                System.out.println("twenty " + eight);
                            }
                            if (surplus == 9){
                                System.out.println("twenty " + nine);
                            }break;
                        case 3:
                            if (surplus == 0){
                                System.out.println("thirty");
                            }
                            if (surplus == 1){
                                System.out.println("thirty " + one);
                            }
                            if (surplus == 2){
                                System.out.println("thirty " + two);
                            }
                            if (surplus == 3){
                                System.out.println("thirty " + three);
                            }
                            if (surplus == 4){
                                System.out.println("thirty " + four);
                            }
                            if (surplus == 5){
                                System.out.println("thirty " + five);
                            }
                            if (surplus == 6){
                                System.out.println("thirty " + six);
                            }
                            if (surplus == 7){
                                System.out.println("thirty " + seven);
                            }
                            if (surplus == 8){
                                System.out.println("thirty " + eight);
                            }
                            if (surplus == 9){
                                System.out.println("thirty " + nine);
                            }
                            break;

                        case 4:
                            if (surplus == 0){
                                System.out.println("forty");
                            }
                            if (surplus == 1){
                                System.out.println("forty " + one);
                            }
                            if (surplus == 2){
                                System.out.println("forty " + two);
                            }
                            if (surplus == 3){
                                System.out.println("forty " + three);
                            }
                            if (surplus == 4){
                                System.out.println("forty " + four);
                            }
                            if (surplus == 5){
                                System.out.println("forty " + five);
                            }
                            if (surplus == 6){
                                System.out.println("forty " + six);
                            }
                            if (surplus == 7){
                                System.out.println("forty " + seven);
                            }
                            if (surplus == 8){
                                System.out.println("forty " + eight);
                            }
                            if (surplus == 9){
                                System.out.println("forty " + nine);
                            }
                            break;

                        case 5:
                            if (surplus == 0){
                                System.out.println("fifty");
                            }
                            if (surplus == 1){
                                System.out.println("fifty " + one);
                            }
                            if (surplus == 2){
                                System.out.println("fifty " + two);
                            }
                            if (surplus == 3){
                                System.out.println("fifty " + three);
                            }
                            if (surplus == 4){
                                System.out.println("fifty " + four);
                            }
                            if (surplus == 5){
                                System.out.println("fifty " + five);
                            }
                            if (surplus == 6){
                                System.out.println("fifty " + six);
                            }
                            if (surplus == 7){
                                System.out.println("fifty " + seven);
                            }
                            if (surplus == 8){
                                System.out.println("fifty " + eight);
                            }
                            if (surplus == 9){
                                System.out.println("fifty " + nine);
                            }
                            break;

                        case 6:
                            if (surplus == 0){
                                System.out.println("sixty");
                            }
                            if (surplus == 1){
                                System.out.println("sixty " + one);
                            }
                            if (surplus == 2){
                                System.out.println("sixty " + two);
                            }
                            if (surplus == 3){
                                System.out.println("sixty " + three);
                            }
                            if (surplus == 4){
                                System.out.println("sixty " + four);
                            }
                            if (surplus == 5){
                                System.out.println("sixty " + five);
                            }
                            if (surplus == 6){
                                System.out.println("sixty " + six);
                            }
                            if (surplus == 7){
                                System.out.println("sixty " + seven);
                            }
                            if (surplus == 8){
                                System.out.println("sixty " + eight);
                            }
                            if (surplus == 9){
                                System.out.println("sixty " + nine);
                            }
                            break;

                        case 7:
                            if (surplus == 0){
                                System.out.println("seventy");
                            }
                            if (surplus == 1){
                                System.out.println("seventy " + one);
                            }
                            if (surplus == 2){
                                System.out.println("seventy " + two);
                            }
                            if (surplus == 3){
                                System.out.println("seventy " + three);
                            }
                            if (surplus == 4){
                                System.out.println("seventy " + four);
                            }
                            if (surplus == 5){
                                System.out.println("seventy " + five);
                            }
                            if (surplus == 6){
                                System.out.println("seventy " + six);
                            }
                            if (surplus == 7){
                                System.out.println("seventy " + seven);
                            }
                            if (surplus == 8){
                                System.out.println("seventy " + eight);
                            }
                            if (surplus == 9){
                                System.out.println("seventy " + nine);
                            }break;

                        case 8:
                            if (surplus == 0){
                                System.out.println("eighty");
                            }
                            if (surplus == 1){
                                System.out.println("eighty " + one);
                            }
                            if (surplus == 2){
                                System.out.println("eighty " + two);
                            }
                            if (surplus == 3){
                                System.out.println("eighty " + three);
                            }
                            if (surplus == 4){
                                System.out.println("eighty " + four);
                            }
                            if (surplus == 5){
                                System.out.println("eighty " + five);
                            }
                            if (surplus == 6){
                                System.out.println("eighty " + six);
                            }
                            if (surplus == 7){
                                System.out.println("eighty " + seven);
                            }
                            if (surplus == 8){
                                System.out.println("eighty " + eight);
                            }
                            if (surplus == 9){
                                System.out.println("eighty " + nine);
                            }
                            break;

                        case 9:
                            if (surplus == 0){
                                System.out.println("ninety");
                            }
                            if (surplus == 1){
                                System.out.println("ninety " + one);
                            }
                            if (surplus == 2){
                                System.out.println("ninety " + two);
                            }
                            if (surplus == 3){
                                System.out.println("ninety " + three);
                            }
                            if (surplus == 4){
                                System.out.println("ninety " + four);
                            }
                            if (surplus == 5){
                                System.out.println("ninety " + five);
                            }
                            if (surplus == 6){
                                System.out.println("ninety " + six);
                            }
                            if (surplus == 7){
                                System.out.println("ninety " + seven);
                            }
                            if (surplus == 8){
                                System.out.println("ninety " + eight);
                            }
                            if (surplus == 9){
                                System.out.println("ninety " + nine);
                            }
                            break;

                    }
                }
            }
        }
    }
}
