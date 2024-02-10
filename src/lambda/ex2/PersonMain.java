package lambda.ex2;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.action((name,job)-> System.out.println(name+ "이 " + job + "을 합니다"));
        person.act(speak-> System.out.println(speak+" 라고 말했습니다"));

    }
}
