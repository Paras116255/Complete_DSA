package ALLList;

import org.w3c.dom.Node;

public class leetCode19 {
    Node head;

    class Node{
        int data;
        Node next;
        Node(){
        }
        Node(int data){
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = null;
        }
    }

    public Node removeNthItem(int n){
        if (head == null){
            return null;
        }

        int size = 0;
        Node currNode = head;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }

        if (n == size){
            return head.next;
        }

        int indexOfSearch = size - n;
        Node prevNode = head;
        int i = 1;
        while(i < indexOfSearch){
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
        return head;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        if (head == null){
            System.out.print("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        leetCode19 lc  = new leetCode19();
        lc.addFirst(5);
        lc.addFirst(4);
        lc.addFirst(3);
        lc.addFirst(2);
        lc.addFirst(1);
        lc.printList();

        lc.removeNthItem(2);
        lc.printList();
    }

}
