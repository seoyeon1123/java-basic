package lambda.add;

public class AddMain2 {
    public static void main(String[] args) {
        IAdd iAdd = (x,y)-> {return x+y;};
        int result = iAdd.add(5,8);
        System.out.println(result);

    }
}
