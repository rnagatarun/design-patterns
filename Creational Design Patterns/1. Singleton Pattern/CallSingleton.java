public class CallSingleton {
    public static void main(String[] args) {
        System.out.println("Calling EagerSingleton...");
        EagerSingleton.getInstance();

        System.out.println("\n---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("Calling LazySingleton...");
        System.out.println("LazySingleton initialized? " + LazySingleton.isInitialized());
        LazySingleton.getInstance();
        System.out.println("LazySingleton initialized? " + LazySingleton.isInitialized());

        System.out.println("\n---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("Calling BillPughSingleton...");
        BillPughSingleton.getInstance();
    }
}