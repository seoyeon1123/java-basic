package Generic.Box;

public class BoxMain2 {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        box1.content = "100";

        Box1 box2 = new Box1();
        box2.content = "100";

        Box1 box3 = new Box1();
        box3.content = 100;

        boolean A = box1.compare(box2);
        System.out.println(A);

       boolean B = box3.compare(box2);
        System.out.println(B);

    }
}
