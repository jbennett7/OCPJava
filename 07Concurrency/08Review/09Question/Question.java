import java.util.concurrent.*;
abstract class MyTask implements ForkJoinTask {}
public class Question extends MyTask {
    private Integer[] elements;
    private int a;
    private int b;
    public Question(Integer[] elements, int a, int b) {
        this.elements = elements;
        this.a = a;
        this.b = b;
    }
    public Integer compute() {
        if ((b-a) < 2)
            return Math.min(elements[a], elements[b]);
        else {
            int m = a + ((b-a) / 2);
            System.out.println(a + "," + m + "," + b);
            MyTask t1 = new Question(elements, a, m);
            int result = t1.fork().join();
            return Math.min(new Question(elements, m, b).compute(), result);
        }
    }

    public static void main(String[] args) throws InterruptedException,
           ExecutionException {
               Integer[] elements = new Integer[] { 8, -2, 2, -54 };
               MyTask task = new Question(elements, 0, elements.length-1);
               ForkJoinPool pool = new ForkJoinPool(1);
               Integer sum = pool.invoke(task);
               System.out.println("Min: " + sum);
    }
}
