package poly.ex6;

public class AnimalAbility {
    public static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    public static void flyAnimal(Fly fly){
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }
}
