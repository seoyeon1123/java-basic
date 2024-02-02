package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();
        child.parentMethod(); // 부모를 상속하고 있어서 가능

        //부모가 자식 인스턴스 참조 가능(다형성 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        //poly.childMethod(); 자식의 기능은 호출할 수 없다

        //Child child1 = new Parent(); 자식은 부모를 담을 수 없다

    }
}
