public class HorseTrainer {
    public boolean feedHorses(int numberOfHorses) {
        int amountNeeded = 5 * numberOfHorses;
        HayStorage hayStorage = HayStorage.getInstance();
        if(hayStorage.getHayQuantity() < amountNeeded) {
            hayStorage.addHay(amountNeeded + 10);
        }
        boolean fed = hayStorage.removeHay(amountNeeded);
        if(fed) System.out.println("Horses have been fed");
        return fed;
    }
}
