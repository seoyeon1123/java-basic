package lambda.ex6;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        Member m1 = person.getMember1((id) -> {
            Member m = new Member(id);
            return m;
        });
        System.out.println(m1);
        m1 = person.getMember1((id) -> new Member(id));
        m1 = person.getMember1(Member::new);
        //----------------------------------------
        Member m2 = person.getMember2((id,name)->{
            Member m = new Member(id,name);
            return m;
        });
        m2 = person.getMember2((id,name)->
            new Member(id,name));
        m2 = person.getMember2(Member::new);


    }
}
