package Excercise3;

import java.util.TreeMap;

public class Excercise3 {
    public static void main(String[] args) {
        String str  =  "Hà Nội chống covid Hà Nội và Đà Nẵng chống covid Hà Nội hỗ trợ Đà Nẵng";
        TreeMap<String, Integer> countWords = new TreeMap<>();
        int count = 0;
        for (int i = 0; i <str.split(" ").length ; i++) {
            if (countWords.containsKey(str.split(" ")[i])){
                count = countWords.get(str.split(" ")[i]);
                countWords.replace(str.split(" ")[i],++count);
            }
            else{
                countWords.put(str.split(" ")[i],1);
            }
        }
        System.out.println(countWords);
    }
}


