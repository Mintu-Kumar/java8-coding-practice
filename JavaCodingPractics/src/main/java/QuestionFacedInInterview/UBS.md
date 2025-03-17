1. What java version you are  using?
2. What is the new in diff version?
3. Access modifier in java?
4. What does default access modifier?
5. What if we declare a variable with final keyword and try to update or assign value
   in constructor?  Give the all possible answer.
6. How do you ensure that if we have partition 0 1 2 3 4 5 and consumer 1 is using partition 0,1,2
   and consumer 2 using partition 3 4 5 ?


============= infinite computer  solution ===================
1. Diff between collection api and stream api?
2. What is diff between ArrayList and Set ?
3. Stream API is Lazy Loading or Eager Loading?
4. All intermediate and terminal operation?
5. Program -  Find 3rd max number in given integer number
6. What is singleton class. Write the code for that ?
7. How to get the list of all bean in spring boot which is register in spring container?
8. What is the default scope of bean ?
9. What does concurrent hashmap ? how is it differing from traditional hashmap?
   explain with an example.
10. All traditional method of collection is mutable ?
11. What are the benefits of using Spring Boot?


Answer of 3 -
Lazy Evaluation: When you define a series of intermediate operations (like filter(), map(), sorted(), etc.) on a stream, these operations are not executed immediately. Instead, they are deferred until a terminal operation (like collect(), forEach(), reduce()) is invoked on the stream.
Terminal Operations: These trigger the execution of the entire pipeline of stream operations and produce a result, like collecting elements into a collection or printing them.
The Stream API in Java uses lazy loading (or lazy evaluation). This means that the operations on streams are not executed immediately when you define them but rather when they are triggered by a terminal operation.

Answer of 10 -
Immutable List, Set, Map (Java 9+): Java 9 introduced methods like List.of(), Set.of(), and Map.of() that return immutable collections.

Example:

java
Copy
List<String> list = List.of("apple", "banana");  // Immutable list
list.add("orange");  // Throws UnsupportedOperationException