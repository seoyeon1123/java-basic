package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("쨱쨱");
    }

    @Override
    public void fly() {
        System.out.println("새가 날아서 이동한다.");
    }
}
