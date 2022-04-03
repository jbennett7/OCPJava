import java.util.concurrent.*;
import static java.util.concurrent.TimeUnit.*;
public class Question {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(() -> {
            System.out.println("Open Zoo");
            //return null;
        }, 0, 1, TimeUnit.MINUTES);
        Future<?> result = service.submit(() -> System.out.println("Wake Staff"));
        System.out.println(result.get());
    }
}
