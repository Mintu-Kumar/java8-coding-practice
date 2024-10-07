package LinkedList;

import java.util.Scanner;

public class DetectCycle extends CreateNode{

    static Node isCycle(Node head){
        Node slow =  head;
        Node fast =  head;
        while (fast != null && fast.next != null){
            slow =  slow.next;
            fast =  fast.next.next;
            if (slow == fast)
                return slow;
        }
        return null;
    }
    static Node detectFirstNode(Node head){
        Node meet = isCycle(head);
        Node start =  head;
        while (start != null){
            start = start.next;
            meet =  meet.next;
        }
        return start;
    }
    public static void main(String[] args){

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next =  new Node(30);
        head.next.next.next =  new Node(40);
        head.next.next.next.next =  new Node(50);
       // head.next.next.next.next.next = head.next.next;
        if(isCycle(head) != null)
            System.out.println("Cycle is present");
        else
            System.out.println("Cycle is not present");

    }
}
