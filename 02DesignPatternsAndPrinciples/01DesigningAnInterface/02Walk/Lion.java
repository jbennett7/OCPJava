interface Walk {
    boolean isQuadruped();
    abstract double getMaxSpeed();
}
interface Run extends Walk {
    public abstract boolean canHuntWhileRunning();
    abstract double getMaxSpeed();
}
public class Lion implements Run {
    public boolean isQuadruped() {
        return true;
    }

    public boolean canHuntWhileRunning() {
        return true;
    }
    public double getMaxSpeed() {
        return 100;
    }

    public static void main(String[] args) {
    }
}
