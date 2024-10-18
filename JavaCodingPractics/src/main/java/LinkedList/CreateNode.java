package LinkedList;

import java.util.Scanner;

public class CreateNode {
    static Scanner sc ;
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    public void traverse(Node head){
        Node cur= head;
        if(head == null)
            System.out.println("List is empty");
        while (cur!=null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }

    public Node createNode(){
        Node head=null;
        System.out.println("Enter data:");
        int data = sc.nextInt();
        if(data == -1)
            return null;

        head =  new Node(data);
        head.next =  createNode();

        return head;
    }
}
