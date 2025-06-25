1. What is microservie ?

       Ans -  Microservices are an architectural style where a large application is broken down into small
       , independent, loosely coupled services, each responsible for a specific business capability.
        | Characteristic                   | Description                                                                          |
        | -------------------------------- | ------------------------------------------------------------------------------------ |
        | 🔄 **Independent Deployment**    | Each service can be developed, deployed, and scaled independently                    |
        | 🧠 **Single Responsibility**     | Each service focuses on a specific functionality (e.g., User Service, Order Service) |
        | 🔗 **Loose Coupling**            | Services interact via lightweight protocols (e.g., REST, messaging)                  |
        | 💬 **Lightweight Communication** | Typically via **HTTP REST** or **message queues (Kafka, RabbitMQ)**                  |
        | 📦 **Own Data**                  | Each microservice manages its own database (**Database per service**)                |
        | 🚀 **Scalability**               | Services can be scaled individually depending on load                                |
        | 🔐 **Technology Agnostic**       | Different services can be written in different languages/technologies                |
2. How big should a single microservice be?

       Ans - There’s no fixed "size in lines of code" or "number of functions" that defines how big a microservice should be — instead, it should follow this principle:
       A microservice should be just big enough to implement a single business capability — and small enough to be understood, developed, deployed, and maintained independently.
Communication and Interaction in Microservices:
3. What is Inter Process Communication (IPC)?

       Ans - Inter-Process Communication (IPC) refers to the mechanisms that allow different processes (or services) to communicate and share data with each other.
        In microservices, each service typically runs in its own process. IPC allows these services to coordinate, request data, or trigger actions in each other.
        **Synchronous Communication:**
        | Protocol      | Description                                             |
        | ------------- | ------------------------------------------------------- |
        | **HTTP/REST** | Most common using `RestTemplate`, `WebClient`, or Feign |
        | **gRPC**      | Lightweight, high-performance protocol based on HTTP/2  |
        | **GraphQL**   | Query-based single-endpoint access                      |
        **Asynchronous Communication:**
        | Tool/Protocol     | Description                     |
        | ----------------- | ------------------------------- |
        | **Message Queue** | Kafka, RabbitMQ, ActiveMQ, etc. |
        | **Event Bus**     | Publish/Subscribe architecture  |
        **Tools Commonly Used for IPC in Spring Boot Microservices:**
        | Purpose            | Tools                                      |
        | ------------------ | ------------------------------------------ |
        | REST Communication | `RestTemplate`, `WebClient`, `Feign`       |
        | Message Queues     | Kafka, RabbitMQ                            |
        | gRPC               | gRPC Spring Boot starter                   |
        | Service Discovery  | Eureka, Consul                             |
        | Load Balancing     | Spring Cloud LoadBalancer, Ribbon (legacy) |
4. What can be done if there are communication failures between microservices?

       Ans - In a microservices architecture, communication failures are inevitable due to network issues,
             service downtime, or overload. To ensure the system remains resilient, you need to design for fault tolerance and graceful degradation.
       **Strategies to Handle Communication Failures Between Microservices**
        1. Retries - Retry the request if a temporary failure occurs (e.g., timeout or 5xx error). Use libraries like Resilience4j, Spring Retry
        2. Circuit Breaker - Prevents a failed service from being overwhelmed by repeated calls. It "opens" after a certain number of failures and temporarily blocks calls.  Tools - Resilience4j
        3. Timeouts - Always configure timeouts to avoid hanging connections in config file
        4. Fallback Methods - Return a default response or cached data when the main call fails.
        5. Asynchronous Communication (Decoupling) - Use Kafka, RabbitMQ, or another message broker to avoid tight coupling and eliminate blocking calls. 
5. What is the preferred communication style in microservices: synchronous or asynchronous?

       Ans - The choice between synchronous and asynchronous communication in microservices depends on the use case, performance needs, and failure tolerance.
        
      **Synchronous Communication (Request/Response)**

       Service A sends a request to Service B and waits for a response.  Protocol - HTTP/REST, gRPC,Feign clients in Spring Cloud
       Pros - 
       | Advantage            | Description                              |
       | -------------------- | ---------------------------------------- |
       | ✅ Simpler logic      | Easy to implement and understand         |
       | ✅ Real-time response | Client gets an immediate answer          |
       | ✅ Widely supported   | REST/gRPC are common and well-documented |
       Cons:
       | Disadvantage     | Description                                        |
       | ---------------- | -------------------------------------------------- |
       | ❌ Tight coupling | Service A is dependent on Service B’s availability |
       | ❌ Latency        | Each call adds network delay                       |
       | ❌ Less resilient | A failure in one service can cascade to others     |

   **Asynchronous Communication (Event-driven / Messaging)**

       Service A sends a message/event to a queue or topic and does not wait for a response. TOols - Apache Kafka, RebbitMQ, 
       Pros:-
       Cons:-d



