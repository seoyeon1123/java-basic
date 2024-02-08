package Generic.Box1;

public class BoxEample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("안녕하세용가리쓰");
        String A = box.get();
        System.out.println(A);

        Box<Integer> box1 = new Box<>();
        box1.set(1104);
        int birth = box1.get();
        System.out.println("생일은 : " + birth);

        FruitBox fruitBox = new FruitBox("apple");
        Box<FruitBox> box2 = new Box<>();
        box2.set(fruitBox);
        FruitBox fruit = box2.get();
        System.out.println("과일 종류: " + fruit);

    }
}
