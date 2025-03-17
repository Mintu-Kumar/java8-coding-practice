package QuestionFacedInInterview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * A thread pool is a collection of pre-initialized, reusable threads that are managed by a threading system in a multithreaded environment. Instead of creating and destroying a new thread every time a task needs to be executed, a thread pool allows tasks to be executed using an existing thread, which improves performance and resource management.
 *
 * How a Thread Pool Works:
 * Thread Initialization: A thread pool is created with a fixed number of threads (or a dynamic number in some cases). These threads are created and maintained in advance.
 *
 * Task Submission: When a task (such as a function or piece of code) needs to be executed, it is submitted to the thread pool. The thread pool assigns the task to one of the available threads.
 *
 * Task Execution: An available thread from the pool picks up the task and executes it. Once the task is completed, the thread returns to the pool and waits for the next task.
 *
 * Thread Reusability: Instead of creating new threads for every task, the same threads are reused, reducing the overhead of creating and destroying threads repeatedly.
 *
 * Benefits of Using a Thread Pool:
 * Resource Efficiency: It avoids the overhead associated with creating and destroying threads for every task.
 * Improved Performance: Reusing threads reduces latency and overhead, especially in environments with many small tasks.
 */
public class ThreadPoolExecutor {
    // Task to be executed by threads
    static class Task implements Runnable {
        private final int taskId;

        public Task(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            System.out.println("Task " + taskId + " is running.");
            try {
                // Simulating work by sleeping for 2 seconds
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Task " + taskId + " is completed.");
        }
    }

    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        int numberOfThreads = 3;
        ExecutorService threadPool = Executors.newFixedThreadPool(numberOfThreads);

        // Submit tasks to the thread pool
        for (int i = 0; i < 5; i++) {
            threadPool.submit(new Task(i));
        }

        // Shut down the thread pool after all tasks are completed
        threadPool.shutdown();
    }
}
