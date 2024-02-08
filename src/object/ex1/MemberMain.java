package object.ex1;

public class MemberMain {
    public static void main(String[] args) {

        Member obj1 = new Member("bleu");
        Member obj2 = new Member("blue");

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
    }
}
