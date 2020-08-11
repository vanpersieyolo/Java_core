public class NextDayCaculator {

    public static String nextDay(int day, int month, int year) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (day < 31 && day > 0) {
                    day += 1;
                    return day + "/" + month + "/" + year;
                }
                if (day == 31) {
                    if (month == 12) {
                        year += 1;
                        month = 1;
                        day = 1;
                    } else {
                        month += 1;
                        day = 1;
                    }
                    return day + "/" + month + "/" + year;
                }
                if (day > 31 || day < 0) {
                   return ("Error");
                }
                break;
            case 4, 6, 9, 11:
                if (day < 30 && day > 0) {
                    day += 1;
                    return day + "/" + month + "/" + year;
                }
                if (day == 30) {
                    month += 1;
                    day = 1;
                    return day + "/" + month + "/" + year;
                }
                if (day > 30 || day < 0) {
                    return ("Error");
                }
                break;
            case 2:
                if (year % 4 == 0) {
                    if (year % 100 != 0) {
                        if (day < 29 && day > 0) {
                            day += 1;
                            return day + "/" + month + "/" + year;
                        }
                        if (day == 29) {
                            month += 1;
                            day = 1;
                            return day + "/" + month + "/" + year;
                        }
                        if (day > 29 || day < 0) {
                            return ("Error");
                        }
                        break;
                    } else if (year % 400 == 0) {
                        if (day < 29 && day > 0) {
                            day += 1;
                            return day + "/" + month + "/" + year;
                        }
                        if (day == 29) {
                            month += 1;
                            day = 1;
                            return day + "/" + month + "/" + year;
                        }
                        if (day > 29 || day < 0) {
                            return ("Error");
                        }
                        break;
                    }
                } else {
                    if (day < 28 && day > 0) {
                        day += 1;
                        return day + "/" + month + "/" + year;

                    }
                    if (day == 28) {
                        month += 1;
                        day = 1;
                        return day + "/" + month + "/" + year;
                    }
                    if (day > 28 || day < 0) {
                        return ("Error");
                    }
                }
        }
      return day + "/" + month + "/" + year;
    }
}

