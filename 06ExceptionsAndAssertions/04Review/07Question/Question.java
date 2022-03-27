public class Question {
    public static void main(String[] args) {
        if(args.length <= 3) assert false; // remember assertions must be enabled
        System.out.println(args[0] + args[1] + args[2]);
    }
}
