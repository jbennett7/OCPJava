import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
public class Question {
    static int counter = 0;
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        List<Future<?>> results = new ArrayList<>();
        IntStream.iterate(0,i -> i+1).limit(5).forEach(
            i -> results.add(service.execute(() -> counter++))
        );
        for(Future<?> result : results) {
            System.out.print(result.get()+" ");
        }
        service.shutdown();
    }
}
