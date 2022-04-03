import java.util.concurrent.*;
public class Question extends RecursiveAction {
    private int start;
    private int end;
    public Question(int start, int end) {
        this.start = start;
        this.end = end;
    }

    protected void compute() {
        if (start<0) return;
        else {
            int middle = start + ((end-start) / 2);
            invokeAll(new Question(start, middle),
                    new Question(middle, end));
        }
    }
    public static void main(String[] args) {
        ForkJoinTask<?> task = new Question(0, 4);
        ForkJoinPool pool = new ForkJoinPool();
        Object result = pool.invoke(task);
    }
}
