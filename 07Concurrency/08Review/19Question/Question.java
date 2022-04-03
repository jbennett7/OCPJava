import java.util.concurrent.*;
public class Question {
    private Question() { super(); }
    private static Question instance;
    public static synchronized Question getInstance() {
        if(instance == null) instance = new Question();
        return instance;
    }

    private int tickets;
    public int getTicketCount() { return tickets; }
    public void makeTicketsAvailable(int value) { tickets += value; }
    public void sellTickets(int value) {
        synchronized (this) {
            tickets -= value;
        }
    }
}
