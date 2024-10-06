package LinkedList;

import java.util.Scanner;

public class TraverseLinkedList extends CreateNode {

    public static void main(String[] args){
      sc =  new Scanner(System.in);
      TraverseLinkedList list =  new TraverseLinkedList();
      Node head =  list.createNode();
      list.traverse(head);
    }
}
