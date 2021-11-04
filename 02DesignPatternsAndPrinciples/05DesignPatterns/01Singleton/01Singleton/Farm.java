public class Farm {
    public static void main(String[] args) {
        HayStorage hs = HayStorage.getInstance();
        hs.addHay(101);
        HorseTrainer ht = new HorseTrainer();
        LlamaTrainer lt = new LlamaTrainer();
        ht.feedHorses(10);
        lt.feedLlamas(10);
        System.out.println(hs.getHayQuantity());
    }
}
