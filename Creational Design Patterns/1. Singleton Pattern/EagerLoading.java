public class EagerSingleton {

    /*
     * EAGER SINGLETON
     * ----------------
     * In Eager Loading, the Singleton instance is created
     * immediately when the class is loaded by the JVM,
     * regardless of whether it is actually used later or not.
     *
     * Understanding:
     * --------------
     * - The object is created immediately during class loading.
     * - The same instance is shared everywhere in the application.
     * - JVM class loading guarantees thread safety.
     *
     * Pros:
     * -----
     * - Very simple implementation.
     * - Thread-safe without synchronization.
     * - Instance is always ready to use.
     *
     * Cons:
     * -----
     * - Memory may be wasted if the object is never used.
     * - Bad choice for heavy objects that consume:
     *      - memory,
     *      - database connections,
     *      - network resources,
     *      - or initialization time.
     */

    // Singleton instance created immediately when class loads
    private static final EagerSingleton instance = new EagerSingleton();

    // Private constructor prevents external object creation
    private EagerSingleton() {
        System.out.println("Singleton Object Created");
    }

    // Global access point
    public static EagerSingleton getInstance() {
        return instance;
    }
}