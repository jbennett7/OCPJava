public class AnonInner {
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
    interface SaleTodayOnlyInt {
        int dollarsOff();
    }
    public int pay(int basePrice) {
        return admission2(int basePrice, new SaleTodayOnlyInt() {
            public int dollarsOff() { return 3; }
        });
    }
    public int admission2(int basePrice, SaleTodayOnlyInt sale) {
        return basePrice - sale.dollarsOff();
    }
    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            int dollarsOff() { return 3; }
        };
        int first = basePrice - sale.dollarsOff();

        SaleTodayOnlyInt sle = new SaleTodayOnlyInt() {
            public int dollarsOff() { return 2; }
        };
        int second = basePrice - sle.dollarsOff()*2;
        return first+second;
    }
    public static void main(String[] args) {
        AnonInner a = new AnonInner();
        System.out.println(a.admission(3));
        System.out.println();
        System.out.println(a.pay(5)));
    }
}
