package lambda.IAdd;

public class IAddMain {
    public static IAdd makeFunction(){
        return (x,y) -> x+y;
    }

    public static void main(String[] args) {
        IAdd func = makeFunction();
        int result = func.add(3,5);
        System.out.println(result);
    }
}
