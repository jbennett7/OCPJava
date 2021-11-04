import java.util.*;

interface Flyer { void fly(); }
class HangGlider implements Flyer { public void fly() {} }
class Goose implements Flyer { public void fly() {} }

public class Flyers {
    private void anyFlyer(List<Flyer> flyer) {}
    private void groupOfFlyers(List<? extends Flyer> flyer) {}

    public static void main(String[] args) {
        Flyers f  = new Flyers();
        List<Flyer> flyers = new ArrayList<>();
        flyers.add(new HangGlider());
        flyers.add(new Goose());
        f.anyFlyer(flyers);
        f.groupOfFlyers(flyers);
    }
}
