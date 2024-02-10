package lambda.ex3;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.action((x,y)-> {
            double result = x + y;
            return result;
        });

        person.action((x,y)-> x + y);

        person.action((x,y)-> sum(x,y));
    }
    public static double sum (double x, double y){
        return x + y;
    }
}
