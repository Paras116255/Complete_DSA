package ALLList;

import org.w3c.dom.Node;

public class leetcode234 {

    Node head;
    class Node{
        int data;
        Node next;
        Node(){
        }
        Node (int data){
            this.data = data;
        }
        Node (int data, Node next){
            this.data = data;
            this.next = null;
        }
    }

    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node newN = curr.next;
            curr.next = prev;

            prev = curr;
            curr = newN;
        }
        return prev;
    }

    public Node findMiddle(Node head){
        Node hare = head;
        Node turtle = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }


    public boolean isPland(Node head){
        if (head == null || head.next == null){
            return true;
        }

        Node middle = findMiddle(head);
        Node secondHalfStart = reverse(middle.next);

        Node firstHalfStart = head;
        while(secondHalfStart != null){
            if (firstHalfStart.data != secondHalfStart.data){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;


    }

}
