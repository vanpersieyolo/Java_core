public class ExcerciseTriangle {

    public static String checkTriangleType(int firstSide, int sencondSide,int thirdSide){
        if (firstSide+sencondSide <= thirdSide || firstSide +thirdSide <= sencondSide || sencondSide + thirdSide <= firstSide || firstSide <= 0 || sencondSide <= 0 || thirdSide <= 0){
            return "Error";
        }else {
            if (firstSide == sencondSide || sencondSide == thirdSide || firstSide == thirdSide){
                if (firstSide != sencondSide || sencondSide != thirdSide || firstSide != thirdSide ){
                    return "tam giác cân";
                }else {
                    return "tam giác đều";
                }
            }
            else
                return "tam giác thường";
        }
    }
}
