package Generic.Box2;

public class BoxMain {
    public static <T> Box<T> boxing(T t){
        Box<T> box =  new Box<T>();
        box.set(t);
        return box
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int value = box1.get();
        System.out.println(value);

        Box<String> box2 = boxing("안녕");
        String str = box2.get();
        System.out.println(str);
    }
}
