package Generic.Box;

public class BoxMain1 {
    public static void main(String[] args) {
        Box1<String> box1 = new Box1<>();
        box1.content = "표원식";
        String name = box1.content;
        System.out.println("이름: " + name);

        Box1<Integer> box2 = new Box1<>();
        box2.content = 27;
        int age = box2.content;
        System.out.println("나이 : " +age);

        Box1 box3 = new Box1();

    }
}
