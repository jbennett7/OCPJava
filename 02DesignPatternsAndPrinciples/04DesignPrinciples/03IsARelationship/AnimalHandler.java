interface Pet {
    void cuddle();
}
class Animal {}
class Feline extends Animal {}
class Cat extends Feline implements Pet {
    public void cuddle() { System.out.println("Pet Cat"); }
}
class Tiger extends Feline {}
class Dog extends Animal implements Pet {
    public void cuddle() { System.out.println("Pet Dog"); }
}
public class AnimalHandler {
    public static void main(String[] args) {
        Animal a = new Dog();
        Pet p = (Pet)a;
        p.cuddle();
    }
}
