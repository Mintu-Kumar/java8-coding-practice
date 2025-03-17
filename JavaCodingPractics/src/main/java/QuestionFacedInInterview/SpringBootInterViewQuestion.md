Basic Spring Boot Questions

        1. What is Spring Boot?
        2. What are the main features of Spring Boot?
        Ans - Auto Configuration, Production ready Feature(Health check, metrics),Embedded webservice, Microservice ready, Spring boot starter template,

        3. What is the difference between Spring and Spring Boot?
        4. What is the role of @SpringBootApplication annotation in Spring Boot?
        Ans -  It is combination of @Configuration, @EnableAutoConfiguration and @ComponentScan annotation
               @ComponentScan - This annotation enables component scanning, which allows Spring to automatically discover and register beans (such as @Service, @Repository, @Controller, etc.)

        5. What are the different types of starters in Spring Boot?
        Ans -  All starter dependencies like starter web, data-jpa, security, actuator,test,messaging,mail, cache,logging, many more.

        6. What is Spring Boot Autoconfiguration?
        7. Explain the Spring Boot Maven plugin and its use.
        8. How do you create a Spring Boot application?
        9. What is the application.properties/application.yml file used for?
        Ans -  Used for externalized configuration, environment specific configuration, customization of default behaviour

        10. How do you run a Spring Boot application?
        11. What is the default port for a Spring Boot application?
        12. How to change the default port in Spring Boot?
        13. What is Spring Boot Actuator?
        14. What are the benefits of using Spring Boot?
        15. What is the difference between @Component, @Service, and @Repository in Spring Boot?
        16. What are Spring Profiles and how do you use them in Spring Boot?
        17. Explain the Spring Boot logging mechanism.
        18. What is the use of @ConfigurationProperties annotation in Spring Boot?
        19 How do you create a RESTful web service in Spring Boot?
        20 How does Spring Boot handle dependency injection?
        Ans - Spring Boot leverages DI to manage how objects are created, configured, and injected into classes that require them

Advanced Spring Boot Questions:

        1. Explain Spring Boot security and how to configure basic authentication.
        2. What are Spring Boot starters, and can you create your own custom starter?
        3. What is Spring Boot's support for embedded web servers?
        4. What is the use of @EnableAutoConfiguration?
        5. How to perform exception handling in a Spring Boot application?
        Ans - For local use @ExceptionHandler and for global @ControllerAdvice

        6. What is the role of @RestController annotation in Spring Boot?
        7. Explain the Spring Boot caching mechanism.
        8. What are Spring Boot's best practices for managing database transactions?
        Ans -  1. Use @Transactional Annotation
               2. Set the Propagation Level Correctly - The default propagation is Propagation.REQUIRED, which means that if a transaction already exists, it will be used; otherwise, a new one will be created.
                  Other option  - REQUIRES_NEW, SUPPORTS, NOT_SUPPORTED
               3. Transaction Rollback for Specific Exceptions
               4. Choose the Right Isolation Level - Spring allows you to configure the isolation level for transactions. Isolation level determines how the transaction is isolated from other concurrent transactions. Spring provides the following isolation levels:
                  a. Isolation.READ_UNCOMMITTED: Allows dirty reads (rarely used).
                  b. Isolation.READ_COMMITTED: Ensures no dirty reads but allows non-repeatable reads.
                  c. Isolation.REPEATABLE_READ: Prevents dirty reads and non-repeatable reads, but allows phantom reads.
                  d. Isolation.SERIALIZABLE: Provides the highest level of isolation but can lead to performance issues due to locking.

        9. How do you configure Spring Boot with an external database (e.g., MySQL, PostgreSQL)?
        10. What is Spring Boot’s support for testing, and what annotations are commonly used for testing?
        11. Explain how to use Spring Boot with Spring Data JPA.
        12. How can you create a multi-module Spring Boot application?
        13. What is Spring Boot DevTools, and how can it be useful during development?
        14. Explain how you can schedule tasks in Spring Boot.
        Ans -     Steps to Schedule Tasks in Spring Boot
            1. Add the Required Dependency
            2. Enable Scheduling in Your Application - @EnableScheduling
            3. Define Scheduled Tasks -  Fixed rate, Fixed delay

        15. What are Spring Boot profiles, and how are they used to handle different environments (e.g., dev, prod)?
        16. What is Spring Boot’s support for asynchronous processing?
        17. How do you handle file uploads in Spring Boot?
        18. How to configure Spring Boot to send email notifications?
        19. How can you implement logging in a Spring Boot application?
        20. What is Spring Boot’s support for integrating with external APIs?


Spring Boot Deployment & Production-related Questions:

        How do you deploy a Spring Boot application on a cloud platform?
        How to package a Spring Boot application as a JAR or WAR file?
        What is the difference between a monolithic and microservices architecture in Spring Boot?
        How to enable HTTPS in Spring Boot?
        What is Spring Cloud, and how does it work with Spring Boot?
        How do you monitor a Spring Boot application in production?
        What are the ways to scale a Spring Boot application?
        Explain how to secure your Spring Boot application using JWT (JSON Web Token).

Performance & Optimization:

        How do you optimize the performance of a Spring Boot application?
        How can you profile a Spring Boot application?
        What are some common performance bottlenecks in a Spring Boot application?
        How does Spring Boot handle asynchronous processing?

Spring Boot Microservices:

        What are microservices, and how does Spring Boot support microservice architecture?
        How to create a Spring Boot application with multiple microservices?
        What is Spring Cloud Config and how does it help in Spring Boot?
        What is Eureka Server in Spring Cloud and how does it work?
        What is Spring Cloud Gateway, and how is it used in microservices?
        How do you enable inter-service communication in a Spring Boot-based microservices system?
        What are some strategies for handling service discovery and load balancing in Spring Boot microservices?
        How can you implement Spring Boot-based microservices with Spring Cloud Netflix (Hystrix, Ribbon, etc.)?

Spring Boot Integration:

        How do you integrate Spring Boot with messaging systems like Kafka or RabbitMQ?
        How do you integrate Spring Boot with Elasticsearch?
        How do you integrate Spring Boot with Redis?
        How do you implement Spring Boot with Spring Batch for batch processing?
        How do you configure Spring Boot to use RabbitMQ or Kafka for messaging?
        How to integrate Spring Boot with a third-party authentication provider (OAuth, SSO)?

Miscellaneous:

        What are the advantages of Spring Boot over traditional Spring applications?
        How does Spring Boot handle session management?
        How do you handle application versioning in a Spring Boot API?
        How do you secure a Spring Boot application with OAuth 2.0?