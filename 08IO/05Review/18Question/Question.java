import java.io.*;
public class Question {
    public static void main(String[] args) {
        Console console = System.console();
        String color = console.readLine("What is your favorite color? ");

        //console.print("Your favorite color is "+color+"\n");
        console.printf("Your favorite color is "+color+"\n");
        //console.println("Your favorite color is "+color+"\n");
        console.format("Your favorite color is "+color+"\n");
        console.writer().println("Your favorite color is "+color+"\n");
        //console.out("Your favorite color is "+color+"\n");
    }
}
