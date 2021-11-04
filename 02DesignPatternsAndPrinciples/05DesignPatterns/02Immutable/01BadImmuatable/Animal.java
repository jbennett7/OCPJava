import java.util.*;

public final class Animal {
    private final LIst<String> favoriteFoods;

    public Animal(List<String> favoriteFoods) {
        if(favoriteFoods == null) {
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }

    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }
}
