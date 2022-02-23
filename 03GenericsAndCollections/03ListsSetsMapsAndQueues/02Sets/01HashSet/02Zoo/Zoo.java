import java.util.*;

class ZooAnimal {
    public String name;
    public ZooAnimal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int hashCode() {
        return this.name.hashCode();
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof ZooAnimal)) return false;
        ZooAnimal otherZooAnimal = (ZooAnimal) obj;
        return this.name == otherZooAnimal.name;
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
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Sheep)) return false;
        Sheep otherSheep = (Sheep) obj;
        return this.name == otherSheep.name;
    }
}

class Zebra extends ZooAnimal {
    public Zebra(String name) {
        super(name);
    }
}

public class Zoo {
    public static void main(String[] args) {
        Set<ZooAnimal> set = new HashSet<>();
        System.out.println(set.add(new Lion("Fred")));
        System.out.println(set.add(new Sheep("Charles")));
        System.out.println(set.add(new Zebra("Bob")));
        System.out.println(set.add(new Lion("Fred")));
        System.out.println(set.add(new Sheep("Fred")));
    }
}
