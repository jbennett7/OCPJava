import java.util.function.Predicate;

public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait trait) {
        if(trait.test(animal))
            System.out.println(animal);
    }
    private static void printPred(Animal animal, Predicate<Animal> trait) {
        if(trait.test(animal))
            System.out.println(animal);
    }
    public static void main(String[] args) {
        System.out.println("Animals that can hop:");
        print(new Animal("kangaroo", true, false), a -> a.canHop());
        print(new Animal("beaver", false, true), a -> {return a.canHop();});
        print(new Animal("fish", false, true), (Animal a) -> a.canHop());
        print(new Animal("human", true, true), (Animal a) -> {return a.canHop();});
        System.out.println();
        System.out.println("Animals that can swim:");
        printPred(new Animal("trout", false, true), a -> a.canSwim());
        printPred(new Animal("cat", true, false), (Animal a) -> a.canSwim());
        printPred(new Animal("dog", true, true), a -> {return a.canSwim();});
        printPred(new Animal("whale", false, true), (Animal a) -> {return a.canSwim();});
    }
}
