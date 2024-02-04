package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child = (Child)parent1;
        child.parentMethod();//오류가 발생하지 않음.

        Parent parent2 = new Parent();
        Child child2 = (Child)parent2; // 런타임 오류 발생
        child2.parentMethod();
        child2.childMethod();// 실행불가
    }

}
