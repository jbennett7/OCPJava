import java.io.*;
import java.util.*;
import java.util.function.*;

public class ExceptionCaseStudy {
    private static List<String> create() throws IOException {
        throw new IOException();
    }
    public static List<String> createSafe() {
        try {
            return ExceptionCaseStudy.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws IOException {
        if(args.length > 2) {
            ExceptionCaseStudy.create().stream().count();
        }
        Supplier<List<String>> s = () -> {
            try {
                return ExceptionCaseStudy.create();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
        Supplier<List<String>> s1 = ExceptionCaseStudy::createSafe;
        System.out.println("\n\tCreateSafe\n\n");
        List<String> theSecondList = s.get();
        List<String> theList = s1.get();
        System.out.println("Reached the end.");
    }
}
