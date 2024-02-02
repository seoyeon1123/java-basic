package poly.basic;

//upcasting vs downcasting
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = (Parent) child;
        Parent parent1 = child;

        parent.parentMethod();
        parent1.parentMethod();


    }


}
