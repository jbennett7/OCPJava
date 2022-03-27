public class Question {
    static class SneezeException extends Exception {}
    static class SniffleException extends SneezeException {}
    public static void main(String[] args) throws SneezeException {
        try {
            throw new SneezeException();
        } catch (SneezeException | RuntimeException e) {
            //e = new Exception(); // Does not compile
            //e = new RuntimeException(); // e cannot be re-assigned in multi-catch.
            //e = new SneezeException(); // e cannot be re-assigned in multi-catch.
            //e = new SniffleException(); // e cannot be re-assigned in multi-catch.
            throw e;
        } } } 
