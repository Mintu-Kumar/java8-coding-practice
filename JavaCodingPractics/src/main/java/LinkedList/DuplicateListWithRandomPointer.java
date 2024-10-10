package LinkedList;

public class DuplicateListWithRandomPointer extends NodeWIthRandomPointer {

    static Node duplicate(Node head){
        Node cur = head;
        while(cur!=null){
            Node temp =  cur.next;
            cur.next =  new Node(cur.data);
            cur.next.next = temp;
            cur = temp;
        }
        cur =  head;

        while (cur!=null){
            if(cur.next !=null){
                cur.next.random = (cur.random!=null)?cur.random.next:null;
            }
            cur =  cur.next.next;
        }
        Node original =  head, copy =  head.next;
        Node temp =  copy;

        while(original!=null){
            original.next = original.next.next;
            copy.next =  copy.next.next;
            original =  original.next;
            copy =  copy.next;
        }
        return temp;
    }
    public static void main(String[] args){

    }
}
