import java.util.*;
import java.util.concurrent.*;
public class Question {
    public void addAndPrintItems(BlockingDeque<Integer> deque) throws InterruptedException {
        deque.offer(103);
        deque.offerFirst(20,1,TimeUnit.SECONDS);
        deque.offerLast(85,7,TimeUnit.HOURS);
        System.out.print(deque.pollFirst(200,TimeUnit.NANOSECONDS));
        System.out.print(" "+deque.pollLast(1,TimeUnit.MINUTES));
    }

    public static void main(String[] args) {
        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        Question q = new Question();
        try {
            q.addAndPrintItems(deque);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}
