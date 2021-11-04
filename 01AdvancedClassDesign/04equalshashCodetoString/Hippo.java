public class Hippo {
    private String name;
    private double weight;
    public Hippo(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return name + " " + weight;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Hippo)) return false;
        Hippo otherHippo = (Hippo)obj;
        return this.name.equals(otherHippo.name) &&
               this.weight == otherHippo.weight;
    }
    @Override
    public int hashCode() {
        return (int)weight * 7;
    }
    public static void main(String[] args) {
        Hippo h1 = new Hippo("Harry", 3100.0);
        System.out.println(h1);
        Hippo h[] = new Hippo[3];
        h[0] = new Hippo("Harry", 3100.0);
        h[1] = new Hippo("Harry", 3200.0);
        h[2] = new Hippo("Eve", 3100.0);
        System.out.println(h1.equals(h1));
        for(int i=0;i<h.length;i++) {
            System.out.println(h1.equals(h[i]));
            System.out.println(h[i].equals(h1));
            System.out.println(h[i].hashCode());
            System.out.println();
        }
    }
}
