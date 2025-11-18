public class SynchronizedBlock {
    private final Object lock = new Object();
    private int count = 0;

    public void increment() {
        int i =0;
        synchronized (lock) {
            while(count<5000) {
                count++;
                i++;
                lock.notify();
            }

        }
    }

    public int getCountSync() {
        return count;
    }
    }