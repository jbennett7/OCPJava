public interface Otter {
    default void play() {}
    public static void main(String[] args) {}
}
class RiverOtter implements Otter {
    @Override public boolean equals(Object o) { return false; }
    @Override public int hashCode() { return 42; }
    @Override public void play() {}
}
