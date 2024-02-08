package Generic.Box1;

public class Box<T> {
    private T object;

    public void set(T t) {
        this.object = t;
    }

    public T get() {
        return object;
    }
}