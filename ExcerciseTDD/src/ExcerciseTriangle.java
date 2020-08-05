public class ExcerciseTriangle {

    public ExcerciseTriangle(){
    }

    public void checkTriangleType(int firstSide, int sencondSide,int thirdSide){
        if (firstSide+sencondSide <= thirdSide || firstSide +thirdSide <= sencondSide || sencondSide + thirdSide <= firstSide || firstSide <= 0 || sencondSide <= 0 || thirdSide <= 0){
            System.out.println("Đây ko phải là 1 tam giác");
        }else {
            if (firstSide == sencondSide || sencondSide == thirdSide || firstSide == thirdSide){
                if (firstSide != sencondSide || sencondSide != thirdSide || firstSide != thirdSide ){
                    System.out.println(" đây là tam giác cân");
                }else {
                    System.out.println(" đây là tam giác đều");
                }
            }
            else {
                System.out.println(" đây là tam giác thường");
            }
        }

    }
}
