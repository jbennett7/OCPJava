import food.*;
public class ZooKeeper {
    public static void main(String[] args) {
        final Food food = FoodFactory.getFood("polar bear");
        food.consumed();
        final Food pelts = FoodFactory.getFood("goat");
        pelts.consumed();
        // Throws the exception
        final Food poop = FoodFactory.getFood("poop");
        poop.consumed();
    }
}
