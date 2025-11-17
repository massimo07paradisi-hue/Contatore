public class Main {
    public static void main(String[] args) {
        SynchronizedBlock example = new SynchronizedBlock();
        Counter c= new Counter();

        // Create multiple threads to increment the counter
        Thread t1 = new Thread(() -> example.incrementSync());
        Thread t2 = new Thread(() -> example.incrementSync());
        Thread t3 = new Thread(() -> c.increment());
        Thread t4 = new Thread(() -> c.increment());


        t1.start();
        t2.start();
        t3.start();
        t4.start();


        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Final count: " + c.getCount());
        System.out.println("Final count: " + example.getCount());
    }
}



