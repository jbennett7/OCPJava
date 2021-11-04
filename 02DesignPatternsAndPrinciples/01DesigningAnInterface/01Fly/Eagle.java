class FlyException extends Exception {}
class BrokenWingException extends FlyException {}

interface Fly {
    public int getWingSpan() throws Exception;
    public static final int MAX_SPEED = 100;

    public default void land() {
        System.out.println("Animal is landing");
    }

    public static double calculateSpeed(float distance, double time) {
        return distance/time;
    }
}
public class Eagle implements Fly {
    @Override
    public int getWingSpan() throws BrokenWingException {
        return 15;
    }
    public void land() {
        System.out.println("Eagle is diving fast");
    }
    public static void main(String[] args){}
}
