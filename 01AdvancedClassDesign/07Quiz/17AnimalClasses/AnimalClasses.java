/* 
 * Enums are required to have a semicolon after the list of values if
 * there is anything else in the enum. Enums are also allowed to have
 * only a private constructor.
 */
public enum AnimalClasses {
    MAMMEL(true), FISH(Boolean.FALSE), BIRD(false),
    REPTILE(false), AMPHIBIAN(false), INVERTEBRATE(false)/*;*/
    boolean hasHair;
    /*private*/ public AnimalClasses(boolean hasHair) {
        this.hasHair = hasHair;
    }
    public boolean hasHair() {
        return hasHair;
    }
    public void giveWig() {
        hasHair = true;
    }
    public static void main(String[] args) {
        AnimalClasses a = AnimalClasses.FISH;
        System.out.println(a);
    }
}
