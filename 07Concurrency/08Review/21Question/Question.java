import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
public class Question {
    public static Integer performCount(int exhibitNumber) {
        return 1;
    }

    public static void printResults(Future<?> f) {
        try {
            System.out.println(f.get());
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        final List<Future<?>> results = new ArrayList<>();
        IntStream.range(0,10)
            .forEach(i -> results.add(
                        service.submit(() -> performCount(i))));
        results.stream().forEach(f -> printResults(f));
        service.shutdown();
    }
}
