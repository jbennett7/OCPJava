package actions;
public interface CanBurrow {
    int first = 1;
    void dig();
    default int digging() { return 1; }
}
