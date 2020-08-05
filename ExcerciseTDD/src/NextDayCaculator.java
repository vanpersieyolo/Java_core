public class NextDayCaculator{
    int enterDay = 0;
    int enterMonth = 0;
    int enterYear = 0;

    public NextDayCaculator(int enterYear, int enterDay, int enterMonth){
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
        switch (enterMonth){
                case 1,3,5,7,8,10,12 :
                    if (enterDay < 31 && enterDay > 0){
                    enterDay += 1;
                }else if (enterDay == 31){
                    enterDay = 1;
                    if (enterMonth == 12){
                        enterYear+=1;
                        enterMonth = 1;
                    }else {
                        enterMonth =1;
                    }
                    }else System.out.println(" ngày nhập vào không có");
                break;
                case 4,6,9,11 :
                    if (enterDay < 30 && enterDay > 0){
                        enterDay += 1;
                    }else if (enterDay == 30){
                        enterDay = 1;
                        enterMonth += 1;
                    }else System.out.println(" ngày nhập vào không có");
                    break;
                case 2:
                    if (enterYear % 4 == 0){
                        if (enterYear % 100 != 0){
                            if (enterDay < 30 && enterDay > 0){
                                enterDay += 1;
                            }else if (enterDay == 29){
                                enterDay = 1;
                                enterMonth+= 1;
                            }else System.out.println(" ngày nhập vào không có");
                            break;
                        }else {
                            if (enterDay < 29 && enterDay > 0){
                                enterDay += 1;
                            }else if (enterDay == 28){
                                enterDay = 1;
                                enterMonth+= 1;
                            }else System.out.println(" ngày nhập vào không có");
                            break;
                        }
                    }else {
                        if (enterDay < 29 && enterDay > 0){
                            enterDay += 1;
                        }else if (enterDay == 28){
                            enterDay = 1;
                            enterMonth+= 1;
                        }else System.out.println(" ngày nhập vào không có");
                        break;
                    }
                }
        }

}

