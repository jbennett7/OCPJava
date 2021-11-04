/* The class compiles but has an improper hasCode() method
 * The equals() method is correct. You are allowed to use any business
 * logic that you want in determining equality. The hashCode() method is
 * not correct. It violates the rule that two objects that return true
 * for equals() must return the same hashCode(). It is also a bad idea
 * for the hash code to contain values that could change.
 */
public class BaseballTeam {
    private String city, mascot;
    private int numberOfPlayers;
    public boolean equals(Object obj) {
        if (!(obj instanceof BaseballTeam))
            return false;
        BaseballTeam other = (BaseballTeam) obj;
        return (city.equals(other.city) && mascot.equals(other.mascot));
    }
    public int hasCode() {
        return numberOfPlayers;
    }
    public static void main(String[] args){}
}
