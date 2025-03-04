package QuestionFacedInInterview;


/**
 * Problem statement -  How to handle synchronized method with concurrent thread?
 */
public class SynchronizedExample {
    private int counter = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedExample example = new SynchronizedExample();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter: " + example.getCounter()); // Should print 2000
    }
}
