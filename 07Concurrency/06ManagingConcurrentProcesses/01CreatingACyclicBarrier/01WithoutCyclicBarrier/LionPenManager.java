import java.util.concurrent.*;

public class LionPenManager {
    private void removeAnimals() { System.out.println("Removing Animals");}
    private void cleanPen() { System.out.println("Cleaning the pen");}
    private void addAnimals() { System.out.println("Adding animals");}

    public void performTask() {
        removeAnimals();
        cleanPen();
        addAnimals();
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            LionPenManager manager = new LionPenManager();
            for(int i=0; i<4; i++)
                service.submit(() -> manager.performTask());
        } finally {
            if(service != null) service.shutdown();
        }
    }
}
