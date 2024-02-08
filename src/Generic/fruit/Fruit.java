package Generic.fruit;

public class Fruit<T> {

    public static <T> T addBox(T t){
        return t;
    }

    public static void main(String[] args) {
        Fruit.addBox(100);
    }
}
