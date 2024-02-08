package object.ex2;

import java.util.HashSet;

public class StudentMain2 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        Student student1 = new Student(1,"서연");
        hashSet.add(student1);
        System.out.println("저장된 객체 수 : " + hashSet.size());

        Student student2 = new Student(1,"서연");
        hashSet.add(student2);
        System.out.println("저장된 객체 수 : " + hashSet.size());

        Student student3 = new Student(2,"서연");
        hashSet.add(student3);
        System.out.println("저장된 객체 수 : " + hashSet.size());

        Student student4 = new Student(2,"원식");
        hashSet.add(student4);
        System.out.println("저장된 객체 수 " + hashSet.size());

    }
}
