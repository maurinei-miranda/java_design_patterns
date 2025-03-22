package CreationalPatterns.Singleton;

public class Logger {
    private Logger() {}

    public static Logger instance = new Logger();

    public static Logger getInstance() {
        return instance;
    }

}
