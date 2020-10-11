public class Main {

    public static void main(String [] args) {
        Singleton instance1 = Singleton.getInstance();

        Singleton instance2 = Singleton.getInstance();

        instance2.closeInstance();

        Singleton instance3 = Singleton.getInstance();
    }
}
