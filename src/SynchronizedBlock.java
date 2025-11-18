public class SynchronizedBlock {
    private final Object lock = new Object();
    private int count = 0;

    public void increment() {
        int i = 0;
        synchronized (lock) {
            while (i < 5000) {
                count++;
                i++;
            }
        }
    }

    public int getCountSync() {
        return count;
    }
}
