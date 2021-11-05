import java.util.*;

public class WQueue {
    public static void main(String[] args) {
        qQueue();
        System.out.println();
        dQueue();
    }

    public static void qQueue() {
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=20; i >= 0; i--) queue.add(i);
        while(!queue.isEmpty()) System.out.print(queue.poll() + ", ");
    }

    public static void dQueue() {
        ArrayDeque<Integer> dqueue = new ArrayDeque<>();
        for(int i=20; i >= 0; i--) dqueue.push(i);
        while(!dqueue.isEmpty()) System.out.print(dqueue.poll() + ", ");
    }
}
