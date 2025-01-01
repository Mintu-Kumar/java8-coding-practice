package LinkedList;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice {
   static Scanner sc;

   public static class Node{
       int data;
       Node next;

       Node(int data){
           this.data =  data;
       }
   }

   public Node createNode(){
       Node head = null;
       System.out.println("Enter data:-");
       int data = sc.nextInt();
       if(data == -1)
           return null;

       head = new Node(data);
       head.next = createNode();

       return head;
   }

   public void traverseList(Node head){
       Node next = head;
       if(head == null)
           return;

       while (next != null){
           System.out.print(next.data+" ");
           next = next.next;
       }
   }

   public void deleteNode(Node head, int pos){

       if(pos == 0)
       {
           head =head.next;
           return ;
       }
       Node prev = head;
       for (int i=0;i<pos-1;i++)
           prev = prev.next;

       prev.next = prev.next.next;

   }

   public boolean detectCycle(Node head){
        if(head == null)
            System.out.println("List is empty");

        Node slow= head,fast=head;
        while (fast.next != null && fast !=null ){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow)
                return true;
        }
        return false;
   }

   public Node insterNode(Node head, int pos,int  newData){
       Node newNode = new Node(newData);
       if(pos == 0){

           newNode.next = head;
           head = newNode;
           return head;
       }
       Node prev = head;
       for(int i=0;i<pos-1;i++){
           prev = prev.next;
       }
       newNode.next = prev;
       prev.next = newNode;

       return head;
   }

    public static void main(String[] args){
        sc =  new Scanner(System.in);
        Practice p =  new Practice();
        Node head = p.createNode();
       Node newList = p.insterNode(head,3,7);
      // System.out.println("Before deletion ");
        p.traverseList(newList);
      //  p.deleteNode(head,3);
      //  System.out.println("After deletion");
      //  p.traverseList(head);
       /* Node head = new Node(10);
        head.next = new Node(20);
        head.next.next =  new Node(30);
        head.next.next.next =  new Node(40);
        head.next.next.next.next =  new Node(50);
        //head.next.next.next.next.next = head.next.next;
        if(p.detectCycle(head))
            System.out.println("cycle present");
        else
            System.out.println("Cycle is not present");*/

    }
}
