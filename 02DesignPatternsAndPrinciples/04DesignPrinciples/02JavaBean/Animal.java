public class Animal {
    private boolean playing;
    private Boolean dancing;
    // Correct because it defines a proper getter
    // for a boolean variable.
    public boolean isPlaying() { return playing; }
    // Correct because booleans can use either is
    // or get.
    public boolean getPlaying() { return playing; }
    // Correct because the Boolean wrapper returns
    // an object and thus you should not use is.
    public Boolean getDancing() { return dancing; }
}
