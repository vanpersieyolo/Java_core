package Practive1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        Map<String,Integer> treeMap = new TreeMap<>();
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(2,0.1f,true);
        hashMap.put("văn",25);
        hashMap.put("lâm",25);
        hashMap.put("tùng",27);
        hashMap.put("1",20);
        hashMap.put("9",24);
        System.out.println("HashMap: "+hashMap);
        treeMap.put("Văn", 25);
        treeMap.put("Lâm",25);
        treeMap.put("Tùng",27);
        System.out.println("TreeMap: "+treeMap);
        linkedHashMap.put("Tùng",27);
        linkedHashMap.put("Văn",25);
        linkedHashMap.put("Lâm",25);
        System.out.println("Tuổi của Văn Là : "+ linkedHashMap);
        System.out.println(linkedHashMap.get("Tùng"));
        System.out.println("Tuổi của Văn Là : "+ linkedHashMap);
    }
}
