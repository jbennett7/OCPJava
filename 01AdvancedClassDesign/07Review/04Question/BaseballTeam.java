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
    public static void main(String[] args) {}
}
