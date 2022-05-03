import java.util.concurrent.*;
import java.util.stream.*;
public class BabyPandaBathManager {
    public static void await(CyclicBarrier cb) {
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        final CyclicBarrier cb = new CyclicBarrier(3,() -> System.out.println("Clean!"));
        ExecutorService service = Executors.newScheduledThreadPool(2);
        IntStream.iterate(1, i->1)
            .limit(12)
            .forEach(i->service.submit(
                        ()-> await(cb)));
        service.shutdown();
    }
}
