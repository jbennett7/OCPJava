/* Prints "x is 24"
 * Outer.this.x is the correct way to refer to x in the Outer class. In
 * Java 7, the answer would have been that line 16 would have generated
 * a compiler error because you used to have to declare variables as
 * final to use them in a local inner class. In Java 8, this requirement
 * was dropped and the variables only need to be effectively final, which
 * means that the code would still compile if final were added.
 */
public class Outer {
    private int x = 24;
    public int getX() {
        String message = "x is ";
        class Inner {
            private int x = Outer.this.x;
            public void printX() {
                System.out.println(message + x);
            }
        }
        Inner in = new Inner();
        in.printX();
        return x;
    }
    public static void main(String[] args) {
        new Outer().getX();
    }
}
