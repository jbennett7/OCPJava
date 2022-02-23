interface Gorilla { String move(); }
public class GorillaFamily {
    String walk = "walk";
    void everyonePlay(boolean baby) {
        String approach = "amble";
        approach = "Foo";
        play(() -> walk);
        play(() -> baby ? "hitch a ride": "run");
        play(() -> approach);
    }
    void play(Gorilla g) {
        System.out.println(g.move());
    }
    public static void main(String[] args) {
        GorillaFamily g = new GorillaFamily();
        g.everyonePlay(true);
    }
}
