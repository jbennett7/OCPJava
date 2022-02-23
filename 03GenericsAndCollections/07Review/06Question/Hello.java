public class Hello<T> {
    T t;
    public Hello(T t) { this.t = t; }
    public String toString() { return t.toString(); }
    public static void main(String[] args) {
        System.out.print(new Hello<String>("hi"));
        // Throws a warning not an error. toString() is defined
        // by Object.
        System.out.print(new Hello("there"));
    }
}
