package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        AnimalAbility.soundAnimal(dog);
        AnimalAbility.soundAnimal(bird);
        AnimalAbility.soundAnimal(chicken);

        AnimalAbility.flyAnimal(bird);
        AnimalAbility.flyAnimal(chicken);
    }
}
