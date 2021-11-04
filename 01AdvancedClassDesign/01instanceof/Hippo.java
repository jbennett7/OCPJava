class Animal {
    public void Feed() { System.out.println("Animal Food"); }
    public static void feedAnimal(Animal animal) {
        /* The instanceof operator is commonly used to determine if an instance is a
         * subclass of a particular object before applying an explicit cast.
         */
        if(animal instanceof Cow){
            ((Cow)animal).Feed();
        } else if(animal instanceof Bird) {
            ((Bird)animal).Feed();
        } else if(animal instanceof Lion) {
            ((Lion)animal).Feed();
        } else {
            throw new RuntimeException("Unsupported Animal");
        }
    }
}
class Cow extends Animal {
    public void Feed() { System.out.println("hay"); }
}
class Bird extends Animal {
    public void Feed() { System.out.println("seed"); }
}
class Lion extends Animal {
    public void Feed() { System.out.println("meat"); }
}
class HeavyAnimal extends Animal {}
class Elephant extends HeavyAnimal {}
interface Mother {}
class MotherHippo extends Hippo implements Mother {}
public class Hippo extends HeavyAnimal {
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        System.out.println(hippo instanceof Hippo);
        System.out.println(hippo instanceof HeavyAnimal);
        System.out.println(hippo instanceof Elephant);
        System.out.println(hippo instanceof Object); // Objects always true
        Hippo nullHippo = null;
        System.out.println(nullHippo instanceof Object); // null objects always false
        Hippo anotherHippo = new Hippo();
        //System.out.println(anotherHippo instanceof Elephant); // DOES NOT COMPILE
        System.out.println(hippo instanceof Mother);
        Animal[] animals = new Animal[3];
        animals[0] = new Bird();
        animals[1] = new Cow();
        animals[2] = new Lion();
        for(Animal a : animals) {
            Animal.feedAnimal(a);
        }
    }
}
