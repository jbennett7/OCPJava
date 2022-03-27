import java.util.*;
class StuckTurkeyCage implements AutoCloseable {
    public void close() throws Exception {
        throw new Exception("Cage door does not close");
    }
}
public class Question {
    public static void main(String[] args) throws Exception {
        AnswerB();
    }
    private static void AnswerB() throws Exception {
        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
            System.out.println("put turkeys in");
        }
    }
    private static void AnswerC() {
        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
            System.out.println("put turkeys in");
        } catch(Exception e){}
    }
}
