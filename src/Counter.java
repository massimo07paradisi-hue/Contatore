public class Counter {
    private int count = 0;

    public synchronized void increment() {
        int i=0;
        while(i<5000) {
            count++;
            i++;
        }



    }

    public int getCount() {

        return count;
    }
}