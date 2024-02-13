package lambda.ex4;

public class PersonMain {
    public static void main(String[] args) {

        //정적 메소드 참조
        Person person = new Person();
        person.action(Double::sum);
        person.action((x,y)->{
            return x + y;
        });
        person.action(Computer::staticMethod);

        //인스턴스 메소드 참조
        Computer computer = new Computer();
        person.action((x,y)->{
            return computer.instanceMethod(x,y);
        });

        person.action((x,y)-> computer.instanceMethod(x,y));
        person.action(computer::instanceMethod);
    }
}
