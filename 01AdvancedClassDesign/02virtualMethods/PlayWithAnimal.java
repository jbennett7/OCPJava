/* Virtual method invocation is when Java looks for an overridden method
 * rather than necessarily using the one in the class that the compiler
 * says we have.
 */
abstract class Animal {
    /* Instance variables don't work like method invocation.
     * Notice here instance variable name. In the lion class
     * we set the name to leo. However when we use an animal
     * reference to a Lion object and print the variable, we get "???".
     */
    String name = "???";
    public void printName() {
        System.out.println(name);
    }
    // Overridden in each of the extended concrete classes.
    public abstract void feed();
    public void careFor() {
        play();
    }
    public void play() {
        System.out.println("pet animal");
    }
}
class Cow extends Animal {
    // calls the appropriate private class feed method.
    public void feed() { addHay(); }
    private void addHay() {
        System.out.println("Hay");
    }
}
class Bird extends Animal {
    // calls the appropriate private class feed method.
    public void feed() { addSeed(); }
    private void addSeed() {
        System.out.println("Seed");
    }
}
class Lion extends Animal {
    String name = "Leo";
    // calls the appropriate private class feed method.
    public void feed() { addMeat(); }
    private void addMeat() {
        System.out.println("Meat");
    }
    public void play() {
        System.out.println("toss in meat");
    }
}
public class PlayWithAnimal {
    public void feedAnimal(Animal animal) {
        animal.feed();
    }
    public static void main(String... args) {
        Animal animal = new Lion();
        animal.printName();
        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = new Bird();
        animals[2] = new Cow();
        for(Animal a : animals) {
            a.feed();
            a.careFor();
        }
    }
}
