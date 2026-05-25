public class CallSingleton {
    public static void main(String[] args) {
        System.out.println("Calling EagerSingleton...");
        EagerSingleton.getInstance();

        System.out.println("Calling LazySingleton...");
        LazySingleton.getInstance();
    }
}