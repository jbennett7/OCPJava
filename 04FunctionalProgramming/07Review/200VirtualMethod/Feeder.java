abstract class Animal {
    public abstract void feed();
}
class Cow extends Animal {
    public void feed() { addHay(); }
    private void addHay() {
        System.out.println("Adding Hay");
    }
}
class Bird extends Animal {
    public void feed() { addSeed(); }
    private void addSeed() {
        System.out.println("Adding Seed");
    }
}
class Lion extends Animal {
    public void feed() { addMeat(); }
    private void addMeat() {
        System.out.println("Adding Meat");
    }
}
public class Feeder {
    public void feedAnimal(Animal animal) {
        animal.feed();
    }
    public static void main(String[] args) {
        Feeder f = new Feeder();
        f.feedAnimal(new Bird());
        f.feedAnimal(new Lion());
        f.feedAnimal(new Lion());
    }
}
