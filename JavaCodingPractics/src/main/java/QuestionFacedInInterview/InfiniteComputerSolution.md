1. What is thread pool in multithreading?
Ans - A thread pool in multithreading is a collection of worker threads that are used to perform tasks concurrently.
      The idea behind a thread pool is to manage and reuse threads rather than creating a new thread each time a task
      needs to be performed. This approach improves efficiency by minimizing the overhead associated with thread creation
      and destruction.  See -  Program - ThreadPoolExecutor.java
2. What is callable and Future interface in Multithreading?
3. What is the diff between Runnable interface, callable interface, and Future interface?
4. What is diff between hashcode and dot equals method in java?
5. Thread life cycle?
6. Bean life cycle?
7. Global exception handler ? - we use @RestControllerAdvice and for method level @ExceptionHandler 
8. Store procedure ?
9. Microservice SAGA pattern ?
10. JPA and ORM
11. Asynchronous pool/ allocated all memory 
12. @Qualifier and @Primary annotation
13. HashMap and ConcurrentHashMap 
14. kafka Topic


========== Ask in interview ==========

1. what is pre-destroyed in spring -  **Answer** - Runs before Spring destroys the bean (usually when the app is shutting down).
2. what is post-construct in spring - **Answer** - Runs after the bean is created and after all dependencies are injected.
   Used for initial setup, like connecting to a database, starting a thread, validating configs, etc.
   **Think like that** - "Hey Spring, once you're done creating this bean and injecting all its required services, call this method so I can finish setting things up."
   **What Can You Do in @PostConstruct?**
   1. Connect to external services (APIs, DBs)
   2. Load configuration or cache data
   3. Validate injected values
   4. Log bean setup completion
   5. Start a scheduled job
3. AOP concept in spring
4. What is promise in java-script
5. When we annotate any class with @component annotation then spring register this class as bean in spring container
    and initialize that object. now If a service A is calling service B and after getting the response we want to set value
    in the bean in that case which annotation we use ?
6. Kafka consumer
7. Kafka Partition