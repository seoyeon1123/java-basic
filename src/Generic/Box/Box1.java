package Generic.Box;

public class Box1 <T>{
    public T content;

    public  boolean compare(Box1<T> other){
        boolean result = content.equals(other.content);
        return result;
    }
    //여기서 기본적으로 파라미터 T는 Object타입으로 간주되므로 Object가 가지고 있는 equals메소드를 호출할 수 있다!
}
