public class Except {
    public static void main(String[] args) throws java.lang.Throwable, java.lang.Exception {
        boolean throwThrowable = false;
        boolean throwException = false;
        boolean throwError = false;
        boolean throwRuntimeException = false;

        java.lang.Object o = new String("hello");
        System.out.println((String)o);

        java.lang.Throwable t = new java.lang.Throwable("Throwing Throwable");
        if (throwThrowable)
            throw t;

        java.lang.Exception e = new java.lang.Exception("Throwing Exception");
        if (throwException)
            throw e;
        
        java.lang.Error f = new java.lang.Error("Throwing Error");
        if (throwError)
            throw f;

        java.lang.RuntimeException re = new java.lang.RuntimeException("Throwing RuntimeException");
        if (throwRuntimeException)
            throw re;
    }
}
