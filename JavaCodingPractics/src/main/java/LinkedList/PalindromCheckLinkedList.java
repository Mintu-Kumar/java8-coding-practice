package LinkedList;

import java.util.Scanner;

public class PalindromCheckLinkedList extends CreateNode{

    static boolean palindromCheck(Node head){
        if(head == null)
            return false;
        Node mid = middle(head);
        Node last = reverse(mid.next);
        Node cur =  head;
        while (last!=null){
            if(last.data != cur.data)
                return false;

            last = last.next;
            cur =  cur.next;
        }
        return true;
    }

    static Node middle(Node head){
        Node slow =  head;
        Node fast =  head;
        while (fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node reverse(Node head){
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
        sc = new Scanner(System.in);
        PalindromCheckLinkedList palindromCheckLinkedList =  new PalindromCheckLinkedList();
        Node head =  palindromCheckLinkedList.createNode();
        boolean res = palindromCheck(head);
        if(res)
            System.out.println("Linked list is palindrom");
        else
            System.out.println("List is not palindrom");
    }
}
