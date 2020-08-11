package Excercise;

import java.util.ArrayList;

public class TestMyList {
    public static void main(String[] args) {
        Mylist mylist = new Mylist(10);
        mylist.add(0,1);
        mylist.add(1,2);
        mylist.add(2,3);
        mylist.add(3,4);
        mylist.add(4,5);
        mylist.add(5,1);
        mylist.add(6,2);
        mylist.add(7,3);
        mylist.add(8,4);
        mylist.add(9,10);
//        mylist.add(11,11);
//        mylist.add(12,12);


//        System.out.println(mylist.toString());
//        System.out.println(mylist.size());
//        System.out.println(mylist.remove(3));
//        System.out.println(mylist.clone());
//        System.out.println(mylist.contains(5));
//        System.out.println(mylist.indexOf(5));
        mylist.clear();
        System.out.println(mylist);



    }

}
