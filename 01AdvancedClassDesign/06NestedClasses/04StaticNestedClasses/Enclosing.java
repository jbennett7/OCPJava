/* Rules for Static Nested Classes
 * ** The nesting creates a namespace because the enclosing class name must
 *    be used to refer to it.
 * ** It can be made private or use one of the other access modifiers to
 *    encapsulate it.
 * ** The enclosing class can refer to the fields and methods of the static
 *    nested class.
 */
public class Enclosing {
    static class Nested {
        private int price = 6;
        public int tryme() {
            Enclosing e = new Enclosing();
            return e.Intme();
        }
    }
    private int Intme() {return 3;}
    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
        System.out.println(nested.tryme());
    }
}
