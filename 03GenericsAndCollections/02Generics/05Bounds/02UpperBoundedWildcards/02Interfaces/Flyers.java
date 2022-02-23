import java.util.*;
interface Flyer { void fly(); }
class HangGlider implements Flyer {
    public void fly() {}
}
class Goose implements Flyer {
    public void fly() {}
}
public class Flyers {
    private void anyFlyer(List<Flyer> flyer) {}
    private void groupOfFlyers(List<? extends Flyer> flyer) {}
    public static void main(String[] args) {}
}
