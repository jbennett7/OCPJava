import java.util.*;
class ZooAnimal implements Comparable<ZooAnimal> {
    private String name;
    public String toString() {
        return name;
    }
    public ZooAnimal(String name) {
        this.name = name;
    }
    public int hashCode() {
        return name.hashCode();
    }
    public boolean equals(Object obj) {
        if( !(obj instanceof ZooAnimal) ) return false;
        ZooAnimal otherZooAnimal = (ZooAnimal) obj;
        return this.name == otherZooAnimal.name;
    }
    public int compareTo(ZooAnimal z) {
        return name.compareTo(z.name);
    }
}
class Lion extends ZooAnimal {
    public Lion(String name) {
        super(name);
    }
}
class Sheep extends ZooAnimal {
    public Sheep(String name) {
        super(name);
    }
}
class Camel extends ZooAnimal {
    public Camel(String name) {
        super(name);
    }
}
public class Zoo {
    public static void main(String[] args) {
        NavigableSet<ZooAnimal> set = new TreeSet<>();
        set.add(new Lion("Fred"));
        set.add(new Lion("Todd"));
        set.add(new Sheep("Kreg"));
        set.add(new Camel("Bob"));
        set.add(new Sheep("John"));
        set.add(new Lion("Mike"));
        set.add(new Camel("Timmy"));
        System.out.println(set.lower(new Sheep("Joe")));
    }
}
