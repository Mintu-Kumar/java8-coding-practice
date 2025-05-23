===== See voiing technology question =====
===== Coding Question =====

1. Write a program to implement Singleton Class.
2. Write a program to implement Builder Design Pattern.
3. Change first letter of every word into uppercase Ex - good morning - Good Morning
4. Write program to check palindrome of string.
5. Write a program to reverse a string.
6. Find a missing number in given array. Input - {0,1,2,3,4,6,7,8,9,10}
7. Write a program to find cumulative sum of array - //Input array => 10, 15, 20, 25, 30
   //Output array => 10, 25, 45, 70, 100.
8. code to check if two objects are same using .equal() and ==.
9. Print all prime number from 1 to 100
10. Read a file and print only K repetitive word from file ? example if file 100 repetitive print 10 word
11. Design your custom HashMap ? write at least put and get method
12. Design producer and consumer, producer will produce something and consume the same
13. Find Most repetitive word from given string.
14. Sort and remove duplicate from list.
15. Find 3rd max number in given integer number


===== Java Interview Question ====\


1. How do you ensure that the class is immutable; -  CapG
2. What is Immutable?
3. what is difference between comparator[compare()](custom order) and comparable[compareTo()](natural order).
4. difference between .equal() and ==
5. Boxing, unboxing and typecasting.
6. final key word, what happens if we declare a variable as final, can we print in the main method.
7. what is static key word. if a variable is defined as static can it be printed in main.
8. exceptions types of exceptions.
9. difference between throws and throw.
10. synchronization, where it is used and why?
11. what is functional Interface and how do you use it.
12. Design your custom HashMap ? write at least put and get method
13. Design producer and consumer, producer will produce something and consume the same.
14. What are stereotype annotations in java?
15. What are the Intermediate operations in stream api
16. Why default and static methods in interfaces
17. How to call static method from interface
18. treemap
19. Sort using custom Comparator
20. Spy vs mock in mockito
21. How to make list thread safe
22. Different between == and hash code.
23. internal working of hash map.
24. what is runnable interface.
25. what is inner class
26. What is wrapper class.
27. What is thread pool in multithreading?
28. What is callable and Future interface in Multithreading?
29. What is the diff between Runnable interface, callable interface, and Future interface?
30. What is diff between hashcode and dot equals method in java?
31. Thread life cycle?
32. Store procedure ?
33. Asynchronous pool/ allocated all memory
34. HashMap and ConcurrentHashMap
35. What java version you are  using? what is diff in all version.
36. Access modifier in java?
37. What does default access modifier?
38. What if we declare a variable with final keyword and try to update or assign value
    in constructor?  Give the all possible answer.
39. Diff between collection api and stream api?
40. What is diff between ArrayList and Set ?
41. Stream API is Lazy Loading or Eager Loading?
42. All intermediate and terminal operation?
43. What does concurrent hashmap ? how is it differing from traditional hashmap?
    explain with an example.
44. All traditional method of collection is mutable ?
45. Pattern matching in switch case -  introduce in java 17
46. How can access private method from outside the class
47. Write Junit testcase for private method.
48. Implement exception in java 8.
49. Diff between Iterator and splitIterator.
50. find the duplicate element from array. using java 8
51. what is synchronized method ?
52. How we do achieve serialization and cloneable?
53. How to handle synchronized method with concurrent thread?
54. write java8 code which take 2 integer and return result using lamda expression?



===== Spring Boot Interview Question =====

1. Diff between @Bean and @Service  
   Ans -   Both @Bean and @Service are annotations used for defining beans that are managed by the Spring container
    **Bean**
2. 
            **Purpose**: Declares a bean manually in a @Configuration class.
            **Used in**: Methods inside a class annotated with @Configuration.
            **Scope**: Used when you want to explicitly declare a bean and have fine control over its instantiation.
    **Service**

            **Purpose**: Marks a class as a service component, a special case of @Component.
            **Used on**: Classes.
            **Scope**: Used for service layer logic in your application (business logic).
2. Diff between @Service and @Repository
   Ans -   @Service and @Repository are both specializations of the @Component annotation, meaning Spring will automatically detect and register them during component scanning. However, they are intended for different layers of a typical Spring application and have some behavioral differences.
    **Service**

         **Purpose**: Indicates that a class provides business logic (service layer).
         **Use Case**: Used to define a service class that contains business-related operations or orchestration of multiple data access calls.
         **Behavior**: It doesn't add additional behavior beyond what @Component provides, except for classification.
   **Repository**

         **Purpose**: Indicates that a class is a Data Access Object (DAO) that interacts with the database.
         **Use Case**: Used to define persistence layer classes (e.g., interacting with a database using JPA or JDBC).
         **Behavior**: Adds exception translation via Spring’s PersistenceExceptionTranslationPostProcessor. That means Spring will automatically convert database-related exceptions into Spring’s DataAccessException.
3. What is the Bean life cycle

       **Container Started**: The Spring IoC container is initialized.
       **Bean Instantiated**: The container creates an instance of the bean.
       **Dependencies Injected**: The container injects the dependencies into the bean.
       **Custom init() method**: If the bean implements InitializingBean or has a custom initialization method specified via @PostConstruct or init-method.
       **Bean is Ready**: The bean is now fully initialized and ready to be used.
       **Custom utility method**: This could be any custom method you have defined in your bean.
       **Custom destroy() method**: If the bean implements DisposableBean or has a custom destruction method specified via @PreDestroy or destroy-method, it is called when the container is shutting down.
4. What all annotation you have used in spring boot.
5. when you change a property in application.yml in config, how does the client pick up the change automatically
6. spring profiles

       Ans - Spring Profiles allow you to define different configurations for different environments — like development, testing, and production — and activate only the relevant ones at runtime.
7. how do we access a variable from application.properties file to class
     
       Ans -  Using @value annotation  @Value("${app.name}")   
8. JPA and ORM - how do you define a table name in the spring boot application.
9.  What is dependency injection and how many ways.
    
        Ans - Dependency Injection (DI) is a design pattern used by Spring Framework to achieve Inversion of Control (IoC) — instead of a class creating its dependencies, they are provided (injected) by the Spring container.
        3 ways to inject dependency - 1. By Constructor injection 2. By setter injection 3. By Field injection
10. what is GlobalExceptionHandler in spring boot and how do we implement it and its uses.
    
        Ans = In Spring Boot, the GlobalExceptionHandler is a centralized mechanism to handle 
          exceptions that occur across the whole application, especially in REST APIs. 
          Instead of handling exceptions in every controller method individually, 
          you can use a global exception handler to catch and process exceptions in one place.
         The GlobalExceptionHandler is a class annotated with **@ControllerAdvice** and typically used with **@ExceptionHandler** methods to catch exceptions thrown by controller methods and return a meaningful response.
11. how do you return an object from a controller class.
12. what is load balancer and how do we implement it in the service.
    
        Ans - A load balancer is a system or software that distributes incoming network traffic across multiple servers (instances of a service) to Improve availability, Enhance performance,Provide fault tolerance,Enable horizontal scaling.
          In a microservice architecture, multiple instances of a service might run for scalability or fault tolerance. A load balancer decides which instance handles each request.
          3 types of LB -  client side, server side, global/external
          How to implement -  See Durgesh microservice YouTube video
13. client side load balancer and server side load balancer.
14. If I have a huge list of employees list and how can each employee has again a lot of data, in this scenario how do we improve the performance.(using parallel stream).
15. How can we authenticate a request before that request hit actual api?
16. How do we validate request parameter if a request come into controller level?
17. Any annotation we use to validate a request on controller level?
18. If an api return 1000 record in response then how do you do pagination?
19. How do we improve performance of our api?
20. What does @configuration do
21. What if there are 2 beans of the same type

        Ans -  If we have 2 bean with same name then we use @Primary annotation, and in the @Qualifier annotation we have to specify the bean name @Qualifier("dieselEngine")
22. What happens when we annotate a method with @transactional
23. What are the types of advices in AOP
24. Explain after returning and after throwing in AOP
25. what is joinpoint and pointcut
26. How to implement composite key with entity
27. JPA and ORM
28. @Qualifier and @Primary annotation
29. what is pre-destroyed in spring
30. what is post-construct in spring
31. When we annotate any class with @component annotation then spring register this class as bean in spring container
    and initialize that object. now If a service A is calling service B and after getting the response we want to set value
    in the bean in that case which annotation we use ?
32. How to get the list of all bean in spring boot which is register in spring container?
33. What is the default scope of bean?
34. What are the benefits of using Spring Boot?
35. Centralized request logging in spring boot login
36. How to select profile in spring boot run time(hosting time)
37. How to implement caching in spring boot.
38. How to disable autoconfiguration in springboot.
39. State management in Rest framework?
40. How to implement concurrent request in rest APIs?
41. CORS in spring boot?
42. Session management in spring boot ?
43. What does autowiring ?
44. write the code to inject dependency ?
45. how to manage data consistency in microservice?


===== Microservice =====

1.  Service Registry and its uses.
2. How do you declare the host for each servies and how they communicated using Service registry how do they pick up the host.
3. Config and how it is registered.
4. which pattern you use so that if a transaction is failed in one of the servies should be rolled back in others too. and how to implement it.
5. Microservice SAGA pattern ?
6. how to manage data consistency in microservice?
7.  Service discovery in microservice.
8. event sourcing in building scalable microservice?
9. how microservice communicate each other? Explain all ways.
10. write rest controller that return query parameter in response?

===== Design Pattern =====

1. Write code for builder design pattern
2. What is Composite design pattern? where do we use it?
3. What is Builder design pattern? where do we use it?
4. What is chain of responsibility design patter? where do we use it?
5. What is adapter design pattern? where do we use it?
6. What is decorator design pattern? where do we use it?
7. Singleton design pattern


===== Kafka =====
1. How do you ensure that if we have partition 0 1 2 3 4 5 and consumer 1 is using partition 0,1,2
    and consumer 2 using partition 3 4 5 ?