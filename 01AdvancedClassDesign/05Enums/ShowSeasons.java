enum OnlyOne {
    ONCE(true);
    private OnlyOne(boolean b) {
        System.out.println("constructing OnlyOne");
    }
}
/*
enum Season {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
    private String expectedVisitors;
    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
        System.out.println(expectedVisitors);
    }
    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}
*/
enum Season {
    WINTER("Low") {
        public void printHours() { System.out.println("9am-3pm"); }
    },
    SPRING("Medium"),
    SUMMER("High") {
        public void printHours() { System.out.println("9am-7pm"); }
    },
    FALL("Medium");
    private String expectedVisitors;
    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }
    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
    public void printHours() { System.out.println("9am-5pm"); }
}
public class ShowSeasons {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println();
        System.out.println(Season.SUMMER);
        System.out.println(s == Season.SUMMER);
        for(Season season: Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
            season.printHours();
        }
        Season s1 = Season.valueOf(args[0]);
        System.out.println(s1);
        System.out.println(s1.ordinal());
        System.out.println();
        OnlyOne firstCall = OnlyOne.ONCE;
        OnlyOne secondCall = OnlyOne.ONCE;
        switch(s1) {
            case SUMMER:
                System.out.println("SUMMER");
                s1.printExpectedVisitors();
                Season.SUMMER.printExpectedVisitors();
                break;
            case WINTER:
                System.out.println("WINTER");
                s1.printExpectedVisitors();
                break;
            case SPRING:
                System.out.println("SPRING");
                s1.printExpectedVisitors();
                break;
            case FALL:
                s1.printExpectedVisitors();
                System.out.println("FALL");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
