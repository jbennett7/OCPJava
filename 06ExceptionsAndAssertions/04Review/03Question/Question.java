import java.io.*;
public class Question {
    public static void main(String[] args) {
        try {
            throw new IOException();
        //} catch(FileNotFoundException | IOException e) {} // subclass of IOException
        //} catch(FileNotFoundException e | IOException e) {} // Same and you cannot use multiple variable names
        //} catch(FileNotFoundException | RuntimeException e) {} // IOException needs to be handled
        //} catch(FileNotFoundException | RuntimeException e) {} // See above
        } catch(IOException | RuntimeException e) {}
        //} catch(IOException e | RuntimeException e) {} / See above
    }
}
