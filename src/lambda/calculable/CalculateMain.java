package lambda.calculable;

public class CalculateMain {
    public static void main(String[] args) {
        action((x,y)->{
            int result = x+y;
            System.out.println(result);
        });

        action((x,y)->{
            int result2 = x-y;
            System.out.println(result2);
        });
    }
    public static void action(Calculate calculate){
        int x = 10;
        int y = 20;
        calculate.calculate(10,20);
    }
}
