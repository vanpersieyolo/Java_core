public class NextDayCaculator{
    int enterDay = 1;
    int enterMonth = 1;
    int enterYear = 1;

    public NextDayCaculator(int enterDay, int enterMonth,int enterYear){
      this.enterDay = enterDay;
      this.enterMonth = enterMonth;
      this.enterYear = enterYear;
    }


    //    public static void getEnterMonth(int enterMonth){
//        boolean monthinput = enterMonth < 12;
//        boolean monthinput1 = enterMonth > 1;
//        if (monthinput && monthinput1){
//            enterMonth += 1;
//        }else if(enterMonth == 12){
//            enterMonth = 1;
//        }
//    }
    public static void nextDay(int enterDay,int enterMonth,int enterYear){
        switch (enterMonth) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (enterDay < 31 && enterDay > 0) {
                    enterDay += 1;
                    System.out.println("ngày tiếp theo là: " + enterDay + " / " + enterMonth + " / " + enterYear);
                    break;
                }
                if (enterDay == 31) {
                    if (enterMonth == 12) {
                        enterYear += 1;
                        enterMonth = 1;
                        enterDay = 1;
                    } else {
                        enterMonth += 1;
                        enterDay = 1;
                    }
                    System.out.println("ngày tiếp theo là: " + enterDay + " / " + enterMonth + " / " + enterYear);
                    break;
                }
                if (enterDay > 31 || enterDay < 0) {
                    System.out.println("không có ngày xác định 1");
                }
                break;
            case 4, 6, 9, 11:
                if (enterDay < 30 && enterDay > 0) {
                    enterDay += 1;
                    System.out.println("ngày tiếp theo là: " + enterDay + " / " + enterMonth + " / " + enterYear);
                    break;
                }
                if (enterDay == 30) {
                    enterMonth += 1;
                    enterDay = 1;
                    System.out.println("ngày tiếp theo là: " + enterDay + " / " + enterMonth + " / " + enterYear);
                    break;
                }
                if (enterDay > 30 || enterDay < 0) {
                    System.out.println("không có ngày xác định");
                }
                break;
            case 2:
                if (enterYear % 4 == 0) {
                    if (enterYear % 100 != 0) {
                        if (enterDay < 29 && enterDay > 0) {
                            enterDay += 1;
                            System.out.println("ngày tiếp theo là: " + enterDay + " / " + enterMonth + " / " + enterYear);
                            break;
                        }
                        if (enterDay == 29) {
                            enterMonth += 1;
                            enterDay = 1;
                            System.out.println(" đây là năm nhuận nên sẽ có 29 ngày của tháng 2 !");
                            System.out.println("ngày tiếp theo là: " + enterDay + " / " + enterMonth + " / " + enterYear);
                            break;
                        }
                        if (enterDay > 29 || enterDay < 0) {
                            System.out.println("không có ngày xác định");
                        }
                        break;
                    } else if (enterYear % 400 == 0) {
                        if (enterDay < 29 && enterDay > 0) {
                            enterDay += 1;
                            System.out.println("ngày tiếp theo là: " + enterDay + " / " + enterMonth + " / " + enterYear);
                            break;
                        }
                        if (enterDay == 29) {
                            enterMonth += 1;
                            enterDay = 1;
                            System.out.println(" đây là năm nhuận nên sẽ có 29 ngày của tháng 2 !");
                            System.out.println("ngày tiếp theo là: " + enterDay + " / " + enterMonth + " / " + enterYear);
                            break;
                        }
                        if (enterDay > 29 || enterDay < 0) {
                            System.out.println("không có ngày xác định");
                        }
                        break;
                    } else {

                        if (enterDay < 28 && enterDay > 0) {
                            enterDay += 1;
                            System.out.println("ngày tiếp theo là: " + enterDay + " / " + enterMonth + " / " + enterYear);
                            break;
                        }
                        if (enterDay == 28) {
                            enterMonth += 1;
                            enterDay = 1;
                            System.out.println("ngày tiếp theo là: " + enterDay + " / " + enterMonth + " / " + enterYear);
                            break;
                        }
                        if (enterDay > 28 || enterDay < 0) {
                            System.out.println("không có ngày xác định");
                            break;
                        }
                    }
                } else {

                    if (enterDay < 28 && enterDay > 0) {
                        enterDay += 1;
                        System.out.println("ngày tiếp theo là: " + enterDay + " / " + enterMonth + " / " + enterYear);
                        break;
                    }
                    if (enterDay == 28) {
                        enterMonth += 1;
                        enterDay = 1;
                        System.out.println("ngày tiếp theo là: " + enterDay + " / " + enterMonth + " / " + enterYear);
                        break;
                    }
                    if (enterDay > 28 || enterDay < 0) {
                        System.out.println("không có ngày xác định");
                        break;
                    }
                }
        }

    }
}

