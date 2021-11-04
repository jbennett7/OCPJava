package animals;
import actions.*;
public class Mole implements CanBurrow {
    @Override
    public void dig() { System.out.println("Digging"); }
    @Override
    public int digging() { return 2; }
    public static void main(String[] args) {
        Mole m = new Mole();
        CanBurrow b = m;
        System.out.println(b.first);
    }
}
