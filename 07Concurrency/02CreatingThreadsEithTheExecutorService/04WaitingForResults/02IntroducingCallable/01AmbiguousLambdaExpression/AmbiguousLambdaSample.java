import java.util.concurrent.*;
import java.util.function.*;
import java.io.IOException;
public class AmbiguousLambdaSample {
    public static void useCallable(Callable<Integer> expression) {}
    public static void useSupplier(Supplier<Integer> expression) {}
    public static void use(Supplier<Integer> expression) {}
    public static void use(Callable<Integer> expression) {}
    public static void main(String[] args) {
        //useCallable((Callable<Integer>)() -> {throw new IOException();});
        //useSupplier(() -> {throw new IOException("");});
        use((Callable<Integer>)() -> {throw new IOException("FOo");});
    }
}
