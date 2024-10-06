package LinkedList;

import Tree.BinaryTreeOperation.InsertElementInBT;

import java.util.Scanner;

public class InsertElementAtGivenPosition extends CreateNode{

    static Node insertNode(Node head,int data,int pos){
        Node toAdd =  new Node(data);
        if(pos == 0)
        {
            toAdd.next =head;
            head =  toAdd;
            return head;
        }
        Node prev = head;
        for(int i=0;i<pos-1;i++){
            prev =  prev.next;
        }
        toAdd.next = prev;
        prev.next =  toAdd;

        return head;
    }
    public static void main(String[] args){
        sc =  new Scanner(System.in);
        InsertElementAtGivenPosition insertElementAtGivenPosition =  new InsertElementAtGivenPosition();
        Node head =  insertElementAtGivenPosition.createNode();
        Node newHead = insertNode(head,40,4);
        insertElementAtGivenPosition.traverse(newHead);
    }
}
