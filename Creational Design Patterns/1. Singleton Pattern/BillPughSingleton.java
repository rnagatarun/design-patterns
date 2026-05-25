public class BillPughSingleton {

    /*
     * BILL PUGH SINGLETON
     * -------------------
     * This Singleton implementation uses a static inner class
     * to achieve:
     *
     * - Lazy Loading
     * - Thread Safety
     * - High Performance
     *
     * without using synchronized methods or volatile variables.
     *
     *
     * Explanation:
     * ------------
     * - The Singleton instance is NOT created immediately.
     * - The object is created only when getInstance() is called.
     *
     * - The static inner class (Holder) is NOT loaded
     *   until it is referenced for the first time.
     *
     * - Java class loading mechanism guarantees that
     *   static class initialization is thread-safe.
     *
     * Therefore:
     * - only one object gets created,
     * - multiple threads cannot create multiple instances,
     * - and there is no synchronization overhead.
     *
     * Pros:
     * -----
     * - Best of both worlds:
     *      Lazy Loading + Thread Safety
     *
     * - No need for:
     *      - synchronized
     *      - volatile
     *
     * - Clean, optimized, and efficient implementation.
     */

    // Private constructor prevents external object creation
    private BillPughSingleton() {
        System.out.println("BillPughSingleton object created");
    }

    /*
     * Static Inner Class
     * ------------------
     * This class is loaded only when getInstance()
     * is called for the first time.
     */
    private static class Holder {

        /*
         * Singleton instance created only once
         * during Holder class loading.
         */
        private static final BillPughSingleton instance =
                new BillPughSingleton();
    }

    /*
     * Global access point
     * -------------------
     * First call:
     * - loads Holder class
     * - creates Singleton object
     *
     * Future calls:
     * - return same already-created object
     */
    public static BillPughSingleton getInstance() {
        return Holder.instance;
    }
}