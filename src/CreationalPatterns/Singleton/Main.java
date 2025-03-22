package CreationalPatterns.Singleton;

public class Main {

    public static void main(String[] args) {
        EmulatingServiceImpl emulatingService = new EmulatingServiceImpl();
        Logger LOG = Logger.getInstance();
        System.out.println("# Should print the same object");
        System.out.println(LOG);
        emulatingService.printLogInstance();
    }

}
