package baiDocmang2chieu;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exp {
    public static void main(String[] args) {
        System.out.println(sign(10));

    }
    public static int sign(int nhap){


        if (nhap > 0)
            return 1;
        else if (nhap == 0)
            return 0;
        else
            return -1;

    }
}
