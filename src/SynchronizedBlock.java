public class SynchronizedBlock {

    private final Object lock = new Object();
    private int count = 0;

    public void incrementSync() {
        synchronized (lock) {
            count++;
        }
    }

    public int getCount() {
        return count;


    }
}