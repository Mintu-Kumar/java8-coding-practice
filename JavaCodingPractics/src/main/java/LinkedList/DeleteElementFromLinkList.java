package LinkedList;

import java.util.Scanner;

public class DeleteElementFromLinkList extends CreateNode{

    static void deleteElement(Node head, int pos){
        if(pos == 0){
            head = head.next;
            return;
        }
        Node prev = head;
        for(int i=0;i<pos-1;i++){
            prev =  prev.next;
        }
        prev.next =  prev.next.next;

    }
    public static void main(String[] args){
        sc =  new Scanner(System.in);
        DeleteElementFromLinkList  deleteElementFromLinkList =  new DeleteElementFromLinkList();
        Node head = deleteElementFromLinkList.createNode();
        deleteElement(head,3);
        deleteElementFromLinkList.traverse(head);
    }
}
