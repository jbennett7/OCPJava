public class Bobcat {
    public void findDen() {}
    public static void main(String[] args) {}
    public void growl() {}
}
class BobcatMother extends Bobcat {
    @Override
    public void findDen() {}
    @Override public void growl() {}
    //@Override
    //public void growl(int g) {}  // DOES NOT COMPILE
}
