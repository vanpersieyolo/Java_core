package Static_Method;

public class StaticMethod {
    private int rollno;
    private  String name;
    private static String college = "Hello";

    StaticMethod (int r, String n){
        rollno = r;
        name = n;
    }

    static void change(){
        college = "CodeGyms";
    }

    void display(){
        System.out.println(rollno + "__" + college);
    }


}
