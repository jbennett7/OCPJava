import java.lang.Runnable;
import java.lang.Thread;

public class ReadInventoryThread extends Thread {
    public void run() {
        System.out.println("Printing zoo inventory");
    }
    public static void main(String[] args) {
        (new ReadInventoryThread()).start();
    }
}
