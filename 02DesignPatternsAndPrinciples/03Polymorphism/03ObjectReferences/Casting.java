class Bird {}
class Fish {}
class Rodent {}
class Capybara extends Rodent {}

public class Casting {
    public static void main(String[] args) {
        Fish fish = new Fish();
        //Bird bird = (Fish)fish; // DOES NOT COMPILE

        Rodent rodent = new Rodent();
        //Capybara capybara = (Capybara)rodent; // Throws ClassCastException at
                                              // runtime
        if(rodent instanceof Capybara) {
            Capybara capybara = (Capybara)rodent;
        }
    }
}
