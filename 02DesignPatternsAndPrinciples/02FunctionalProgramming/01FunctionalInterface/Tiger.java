public class Tiger extends Animal implements Sprint, SprintFaster {
    @Override
    public String toString() { return "Tiger"; }
    @Override
    public void sprint(Animal animal) {
        System.out.println("Animal is sprinting fast! "+animal.toString());
    }
    public static void main(String[] args) {
        Kangaroo k = new Kangaroo();
        Animal a = new Tiger();
        Tiger t = new Tiger();
        t.sprint(t);
    }
}
