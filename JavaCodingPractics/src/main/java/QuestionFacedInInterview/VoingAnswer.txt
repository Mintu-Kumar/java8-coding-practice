========= microservice ===========
1 How to manage data consistency in microservice?
Answer:-
Sagas Pattern
    The Sagas pattern is a way to manage distributed transactions in microservices.
    A saga consists of a sequence of local transactions, each of which updates a single service's database. If one of the transactions fails, compensating actions are performed to maintain consistency.
Sagas can be implemented in two ways:
    Choreography-based: Each service involved in the saga knows about the next step and performs its action and passes the responsibility to the next service.
    Orchestration-based: A central service (the orchestrator) coordinates the saga by telling each service what action to take.


Question on Kafka
    What are the core components of Kafka, and how do they interact?
    How does Kafka achieve fault tolerance?
    Explain Kafka producers and consumers in a typical use case.
    What is a Kafka topic and how is it structured?
    How does Kafka handle message ordering and consistency?
    Compare Kafka with other streaming platforms.
    What is the role of the offset in Kafka?
    Can Kafka be used without ZooKeeper?
    Why are replications critical in Kafka?
    What is a partitioning key?