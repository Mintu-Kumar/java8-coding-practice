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

    static Node createNode(){
        Node head=null;
        System.out.println("Enter data:");
        int data = sc.nextInt();
        if(data == -1)
            return null;

        head =  new Node(data);
        System.out.println("Enter next element:");
        head.next =  createNode();

        return head;
    }
}
