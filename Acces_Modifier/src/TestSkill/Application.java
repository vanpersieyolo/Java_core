package TestSkill;

import java.util.ArrayList;

public class Application {
    ArrayList<Student>students = new ArrayList<>();
    public void addNewStudent (Student student){
        students.add(student);
    }
    public void removeStudent (int id){
        Student a = new Student();
        for (Student idSt: students) {
            if (idSt.getId() == id ){
                a = idSt;
            }
        }
        students.remove(a);
    }
    public void getAll(){
        for (Student a: students) {
            System.out.println(a.toString());
        }
    }
    public void update(Student a){
        for (Student student : students) {
            if (a.getId() == student.getId()){
                student.setName(a.getName());
                student.setAddress(a.getAddress());
                student.setEmail(a.getEmail());
            }
        }
    }
    public Student findStudent(String b){
        Student student =new Student();
        for (Student a : students) {
            String c = a.getName();
                if (c.equals(b)){
                    student = a;
                }
        }
        return student;

    }
}
