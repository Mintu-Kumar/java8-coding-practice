package QuestionFacedInInterview;

import java.util.concurrent.*;

/**
 * 1. Callable:
 * The Callable interface is similar to Runnable, but it can return a result (or throw an exception) when the task is completed. The Runnable interface, in contrast, does not allow returning a result and only defines the run() method, which is void.
 *
 * Callable tasks can be executed by a thread pool, and they return a Future object that can be used to retrieve the result of the computation.
 * Here's how Callable works in Java:
 *
 * Callable Interface has a method call() which returns a result (can throw exceptions too).
 *
 * Runnable has the run() method but doesn’t return anything.
 *
 * 2. Future:
 * The Future interface represents the result of an asynchronous computation. It allows you to query the status of a task and retrieve its result once it's done.
 *
 * A Future object is returned when submitting a Callable to an executor.
 * The Future.get() method blocks until the result is available.
 */
public class CollableAndFutureThreadPool {
    // Task to be executed by threads
    static class CallableTask implements Callable<String> {
        private final int taskId;

        public CallableTask(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public String call() throws Exception {
            System.out.println("Task " + taskId + " is running.");
            // Simulating work by sleeping for 2 seconds
            Thread.sleep(2000);
            return "Task " + taskId + " is completed.";
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create a thread pool with 3 threads
        int numberOfThreads = 3;
        ExecutorService threadPool = Executors.newFixedThreadPool(numberOfThreads);

        // Submit tasks to the thread pool and get Future objects
        Future<String> future1 = threadPool.submit(new CallableTask(1));
        Future<String> future2 = threadPool.submit(new CallableTask(2));
        Future<String> future3 = threadPool.submit(new CallableTask(3));
        Future<String> future4 = threadPool.submit(new CallableTask(4));
        Future<String> future5 = threadPool.submit(new CallableTask(5));

        // Retrieve and print the results once the tasks are completed
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        System.out.println(future4.get());
        System.out.println(future5.get());

        // Shut down the thread pool after all tasks are completed
        threadPool.shutdown();
    }

}
