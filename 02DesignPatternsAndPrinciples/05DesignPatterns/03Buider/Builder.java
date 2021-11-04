import java.util.*;

public class Builder {
    public static void main(String[] args) {
        AnimalBuilder duckBuilder = new AnimalBuilder();
        duckBuilder.setAge(4).setFavoriteFoods(Arrays.asList("grass","fish")).setSpecies("duck");
        Animal duck = duckBuilder.build();
        System.out.println(duck.getSpecies());
        System.out.println();
        Animal flamingo = new AnimalBuilder()
            .setFavoriteFoods(Arrays.asList("algae", "insects"))
            .setSpecies("flamingo").build();
        System.out.println(flamingo.getSpecies());
    }
}
