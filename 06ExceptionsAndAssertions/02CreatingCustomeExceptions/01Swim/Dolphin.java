class CannotSwimException extends Exception {}
class DangerInTheWater extends RuntimeException {}
class SharkInTheWaterException extends DangerInTheWater {}
public class Dolphin {
    private boolean canSwim;
    public Dolphin() {
        this.canSwim = false;
    }
    public void setSwim() {
        this.canSwim = true;
    }
    public void swim() throws CannotSwimException {
        if(!canSwim)
            throw new CannotSwimException();
        System.out.println("Swimming");
    }
    public static void main(String[] args) {
        Dolphin d = new Dolphin();
        if(args.length > 0)
            d.setSwim();
        d.swim();
    }
}
