package Practive2;

import java.util.*;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge() > o2.getAge()){
            return 1;
        }else if (o1.getAge() == o2.getAge()){
            return 0;
        }else
            return -1;
    }

    public static void main(String[] args) {
        Student student = new Student("van",18,"hn");
        Student student1 = new Student("lam",20,"hn");
        Student student2 = new Student("viet" ,12,"hd");
        Student student3 = new Student("tung", 23, "hn");

        List<Student> lists =  new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("so sanh theo tuoi");
        for ( Student st: lists) {
            System.out.println(st.toString());
        }
    }
}
