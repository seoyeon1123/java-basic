package poly.ex5;

public class Cat implements interfaceAnimal{
    @Override
    public void sound() {
        System.out.println("냐옹");

    }

    @Override
    public void move() {
        System.out.println("고양이가 담장 위로 이동합니다.");
    }
}
