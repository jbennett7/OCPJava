public class Question {
    public static void main(String[] args) {
        Question q = new Question();
        q.addPlusOne(1, 1);
    }
    private int addPlusOne(int a, int b){
        boolean assert = false;
        assert a++ > 0; // assertions should not have side effects.
        assert b > 0;
        return a + b;
    }
}
