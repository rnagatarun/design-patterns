public class LazySingleton {

    /*
     * LAZY SINGLETON
     * -------------
     * In Lazy Singleton, the Singleton instance is created
     * only when it is needed for the first time.
     *
     * The object is created only when getInstance()
     * is called for the first time.
     *
     * Understanding:
     * --------------
     * - The instance initially starts as null.
     * - On the first call to getInstance(), the object is created.
     * - Future calls return the same already-created object.
     *
     * Pros:
     * -----
     * - Saves memory if the object is never used.
     * - Object creation is delayed until actually required.
     * - Better for heavy or expensive objects.
     *
     * Cons:
     * -----
     * - NOT thread-safe by default.
     * - Multiple threads can create multiple objects simultaneously.
     * - Requires synchronization in multi-threaded applications.
     */

    // Initially no object is created
    private static LazySingleton instance;

    // Private constructor prevents external object creation
    private LazySingleton() {
        System.out.println("Lazy Singleton Object Created");
    }

    // Object created only when needed
    public static LazySingleton getInstance() {

        // Create object only first time
        if (instance == null) {
            instance = new LazySingleton();
        }

        // Return same object afterwards
        return instance;
    }
}