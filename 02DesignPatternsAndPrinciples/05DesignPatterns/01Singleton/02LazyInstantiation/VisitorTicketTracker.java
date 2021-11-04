public class VisitorTicketTracker {
    private static VisitorTicketTracker instance;
    private VisitorTicketTracker() {}
    private synchronized void instantiateInstance() {
        instance = new VisitorTicketTracker();
    }
    public static VisitorTicketTracker getInstance() {
        if(instance == null) {
            instantiateInstance();
        }
        return instance;
    }
}
