import java.util.concurrent.*;
import java.util.*;
import java.lang.Math;

public class AddData {
    public static void main(String[] args) throws InterruptedException,
           ExecutionException {
       ExecutorService service = null;
       try {
           service = Executors.newSingleThreadExecutor();
	   Future<Integer> result1 = service.submit(() -> 30+Math.pow(11,0));
	   Future<Integer> result2 = service.submit(() -> 30+Math.pow(11,1));
	   Future<Integer> result3 = service.submit(() -> 30+Math.pow(11,2));
	   Future<Integer> result4 = service.submit(() -> 30+Math.pow(11,3));
       } finally {
           if(service != null) service.shutdown();
       }
       if(service != null) {
	       service.awaitTermination(1, TimeUnit.MINUTES);
	       if(service.isTerminated())
		       System.out.println("All tasks finished");
	       else
		       System.out.println("At least one task is still running");
       }
       System.out.println(result1.get());
       System.out.println(result2.get());
       System.out.println(result3.get());
       System.out.println(result4.get());
    }
}
