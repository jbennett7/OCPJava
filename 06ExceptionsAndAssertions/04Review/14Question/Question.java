public class Question {
    static class SneezeException extends Exception {}
    static class SniffleException extends SneezeException {}
    public static void main(String[] args) throws SneezeException {
        try {
            throw new SneezeException();
        } catch (SneezeException | SniffleException e) { // subclass compiler error
            throw e;
        } } }
