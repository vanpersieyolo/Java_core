public class FizzBuzz {
    public static String fizzorBuzz(int enterNumber){

        if (enterNumber > 0){
            if (enterNumber % 3 == 0){
                if (enterNumber % 5 == 0){
                    return "FizzBuzz";
                }
                else {
                    return "Fizz";
                }
            }
            else if (enterNumber % 5 == 0){
                return "Buzz";
            }else {
                return String.valueOf(enterNumber);
            }
        }
        return String.valueOf(enterNumber);
    }
    public static String upFizzorBuzz(int number){
       String enterNumber = number+"";
        String[] NumberUnit = {"không ","một ","hai ","ba ","bốn ","năm ","sáu ","bảy ","tám ","chín ","mười "};
//        if (enterNumber.indexOf('5') >= 0){
//            return "Buzz";
//        }
       if (enterNumber.indexOf('3') >= 0){
            if (enterNumber.indexOf('5') >= 0){
                return "Fizz Buzz";
            }else {
                return "Fizz";
            }
       }else if(enterNumber.indexOf('5') >= 0){
           return "Buzz";
       }else if (number <10) return NumberUnit[number];
       else if (number <100){
           return NumberUnit[number/10]+NumberUnit[number%10];
       } else return "Error";
    }
}
