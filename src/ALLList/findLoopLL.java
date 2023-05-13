package ALLList;

import org.w3c.dom.Node;

public class findLoopLL {

    Node head;
    class Node{
        int data;
        Node next;
        Node(){}
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean findLoop(Node head){
        if(head == null){
            return false;
        }
        Node hare = head;
        Node turtle = head;
        while(hare != null && hare.next !=null){
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle){
                return true;
            }
        }
        return false;
    }
}
