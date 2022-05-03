import java.util.*;
import java.util.function.*;
public final class Duck {
    private final String name;
    private final List<Duck> ducklings;
    public Duck(String name, List<Duck> ducklings) {
        this.name = name;
        this.ducklings = new ArrayList<Duck>(ducklings);
    }
    public String getName() { return name; }
    public List<Duck> getDucklings() {
        return new ArrayList<Duck>(ducklings);
    }
    public String hasDucklings(Predicate<Duck> p) {
        return p.test(this) ? "Quack Quack": "";
    }
}
