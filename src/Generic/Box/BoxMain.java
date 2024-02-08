package Generic.Box;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box(123);
        Box box1 = new Box("안녕");

        int A = (int)box.content;
        System.out.println(A);

    }
}
