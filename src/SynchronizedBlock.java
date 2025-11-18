public class SynchronizedBlock {
    private final Object lock = new Object();
    private int count = 0;

        synchronized (lock) {
                count++;
        }
    }

        return count;
    }
    }