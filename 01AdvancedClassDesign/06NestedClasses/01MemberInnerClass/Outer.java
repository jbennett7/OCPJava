/* Rules for Member Inner Class
 * ** Can be declared public, private, or protected or use default access
 * ** Can extend any class and implement interfaces
 * ** Can be abstract or final
 * ** Cannot declare static fields or methods
 * ** Can access members of the outer class including private members
 */
public class Outer {
    private interface Secret {
        public void shh();
    }
    private String greeting = "Hi";
    protected class Inner {
        public int repeat = 3;
        public void go() {
            for (int i =0; i < repeat; i++)
                System.out.println(greeting);
        }
        protected class Inner2 implements Secret {
            private int item = 4;
            public int getItem() { return item; }
            public void shh() { System.out.println("Secret"); }
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();
        System.out.println();
        Inner inner = outer.new Inner();
        inner.go();
        Inner.Inner2 ii2 = inner.new Inner2();
        System.out.println(ii2.getItem());
        Outer2 outer2 = new Outer2();
        Inner inner2 = outer2.new Inner();
        inner2.shh();
    }
}

class Outer2 extends Outer {}
