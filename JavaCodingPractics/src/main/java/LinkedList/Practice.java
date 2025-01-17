package LinkedList;

import java.util.Scanner;

public class Practice {
   static Scanner sc ;
public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public static Boolean detectCycle(Node root){
    if(root == null)
        System.out.println("List is empty");
    Node slow =root,fast=root;
     while (fast != null && fast.next != null){
         slow = slow.next;
         fast = fast.next.next;
         if(fast == slow)
             return true;
     }
     return false;
}

public static Node reverseList(Node start){
    Node t1=null;
    Node t2=null;
    while(start!=null){
        t2= start.next;
        start.next =t1;
        t1 =  start;
        start=t2;
    }
    return t1;
}

public static Node createNode(){
    Node root = null;
    int data =  sc.nextInt();
    if(data==-1)
        return null;
    root =  new Node(data);
    root.next =  createNode();

    return root;
}

public static void printList(Node root){

    if(root == null){
        System.out.println("List is empty");
    }
    while (root !=null)
    {
        System.out.print(root.data+" ");
        root =  root.next;
    }
}

public static Boolean palindromCheck(Node root){
    Node middle =returnMiddleNode(root);
    Node last = reverseList(middle.next);
    Node cur =  root;
    while (last!=null){
        if(cur.data != last.data)
            return false;

        cur =  cur.next;
        last =  last.next;
    }
    return true;
}
public static Node returnMiddleNode(Node root){
    if(root == null)
        System.out.println("List is empty");
    Node slow =root,fast=root;
    while (fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;

    }
    return slow;
}
    public static void main(String[] args){
       sc =  new Scanner(System.in);
       Node root = createNode();
        if(palindromCheck(root))
            System.out.println("Palindrom");
        else
            System.out.println("not palindrom");


    }
}
