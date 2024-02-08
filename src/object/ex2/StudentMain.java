package object.ex2;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student(1,"서연");
        Student student2 = new Student(1,"서연");

        if(student1.hashCode() == student1.hashCode()){
            if(student1.equals(student2)){
                System.out.println("동등 객체 입니다.");
            } else {
                System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
            }
        } else {
            System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
        }

    }
}
