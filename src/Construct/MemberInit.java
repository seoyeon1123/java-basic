package Construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //생성자 추가
    MemberInit(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" +
                grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}