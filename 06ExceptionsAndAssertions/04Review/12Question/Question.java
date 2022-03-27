public class Question {
    static class SneezeException extends Exception {}
    static class SniffleException extends SneezeException {}
    public static void main(String[] args) throws SneezeException {
        try {
            throw new SneezeException();
        } catch (SneezeException e) {
            //e = new Exception();  // Does not compile
            //e = new RuntimeException();  // Does not compile
            //e = new SneezeException(); //Compiles
            //e = new SniffleException();
            throw e;
        } } }
