package LinkedList;

import java.util.Scanner;

public class ReverseLinkedList extends CreateNode{

    static Node reverseList(Node head){
        Node cur =  head;
        Node prev =  null;
        while (cur!= null){
           Node temp =  cur.next;
           cur.next =  prev;
           prev = cur;
           cur =  temp;
        }
        return prev;
    }
    public static void main(String[] args){
        sc =  new Scanner(System.in);
        ReverseLinkedList  reverseLinkedList =  new ReverseLinkedList();
        Node head =  reverseLinkedList.createNode();
        reverseLinkedList.traverse(reverseList(head));
    }
}
